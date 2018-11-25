package service;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import bean.GoodsInfo;
import dao.GoodsInfoDAO;
@WebServlet("/goods")
public class GoodsServlet extends HttpServlet{

	private static final long serialVersionUID = 1L;

	private GoodsInfoDAO gidao = new GoodsInfoDAO();
	@Override
	public void doGet(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
		String type = request.getParameter("type");
		if("1".equals(type)){
			addGwc(request, response);
		}else if("2".equals(type)){
			findAllGoods(request, response);
		}
	}
	
	
	//����ȫ��ʾ��Ʒ��Ϣ�ķ���
	public void findAllGoods(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
		HttpSession session = request.getSession();
		//�����е���Ʒ�б���뵽session��,��������һ������GOODSLIST
		session.setAttribute("GOODSLIST", gidao.findAll());
		
		response.sendRedirect("goods.jsp");
		
	}
	//���û�ѡ�е���Ʒ���뵽���ﳵ��
	public void addGwc(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
		HttpSession session = request.getSession();
		//��ȡ���û����ݹ�������Ʒ���
		int goodsId = Integer.parseInt(request.getParameter("id"));
		//������Ʒ���,��ȡ����Ʒ
		GoodsInfo gi = gidao.findById(goodsId);
		
		
		//�ж���û�й��ﳵ,���û��,�򴴽�һ�����ﳵ,���ҽ���һ����Ʒ����;����,ʹ�ù��ﳵ,����Ʒ���빺�ﳵ
		Object obj = session.getAttribute("GWCLIST");
		List<GoodsInfo> gwcList = null;
		if(obj==null){
			//����һ���µļ���,������ϳ�ʼΪ��
			gwcList = new ArrayList<GoodsInfo>();
			//������Ʒ������Ϊ1
			gi.setGoodsNum(1);
			gwcList.add(gi);
		}else{
			//�������,��ôʹ��
			gwcList = (List<GoodsInfo>)obj;
			//�ж�gi�����Ʒ��gwclist���Ƿ����,�������,�����ۼ�;����ͽ�gi���뵽gwcList��
			int index = gwcList.indexOf(gi);
			if(index==-1){
				//������Ʒ������Ϊ1
				gi.setGoodsNum(1);
				gwcList.add(gi);
			}else{
				//�������ۼ�
				GoodsInfo g = gwcList.get(index);
				g.setGoodsNum(g.getGoodsNum()+1);
			}
			
		}
		
		
		//ˢ�¹��ﳵ
		session.setAttribute("GWCLIST", gwcList);
		
		//��������
		response.sendRedirect("goods.jsp");
		
	}
	
}
