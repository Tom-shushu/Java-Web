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
	
	
	//负责全显示商品信息的方法
	public void findAllGoods(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
		HttpSession session = request.getSession();
		//将所有的商品列表放入到session中,并且起了一个名字GOODSLIST
		session.setAttribute("GOODSLIST", gidao.findAll());
		
		response.sendRedirect("goods.jsp");
		
	}
	//将用户选中的商品加入到购物车中
	public void addGwc(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
		HttpSession session = request.getSession();
		//获取到用户传递过来的商品编号
		int goodsId = Integer.parseInt(request.getParameter("id"));
		//根据商品编号,获取到商品
		GoodsInfo gi = gidao.findById(goodsId);
		
		
		//判断有没有购物车,如果没有,则创建一个购物车,并且将第一个商品加入;否则,使用购物车,将商品加入购物车
		Object obj = session.getAttribute("GWCLIST");
		List<GoodsInfo> gwcList = null;
		if(obj==null){
			//创建一个新的集合,这个集合初始为空
			gwcList = new ArrayList<GoodsInfo>();
			//设置商品的数量为1
			gi.setGoodsNum(1);
			gwcList.add(gi);
		}else{
			//如果存在,那么使用
			gwcList = (List<GoodsInfo>)obj;
			//判断gi这个商品在gwclist中是否存在,如果存在,数量累加;否则就将gi加入到gwcList中
			int index = gwcList.indexOf(gi);
			if(index==-1){
				//设置商品的数量为1
				gi.setGoodsNum(1);
				gwcList.add(gi);
			}else{
				//将数量累加
				GoodsInfo g = gwcList.get(index);
				g.setGoodsNum(g.getGoodsNum()+1);
			}
			
		}
		
		
		//刷新购物车
		session.setAttribute("GWCLIST", gwcList);
		
		//继续购物
		response.sendRedirect("goods.jsp");
		
	}
	
}
