package dao;

import java.util.ArrayList;
import java.util.List;

import bean.GoodsInfo;

public class GoodsInfoDAO {

	public List<GoodsInfo> findAll() {
		List<GoodsInfo> list = new ArrayList<GoodsInfo>();

		GoodsInfo gi1 = new GoodsInfo(1, "��ʾ��", 1887.5, 0);
		GoodsInfo gi2 = new GoodsInfo(2, "ũ��ɽȪ", 1.5, 0);
		GoodsInfo gi3 = new GoodsInfo(3, "�ɿڿ���", 3.2, 0);
		GoodsInfo gi4 = new GoodsInfo(4, "������װ", 117.5, 0);
		GoodsInfo gi5 = new GoodsInfo(5, "����", 4.3, 0);
		GoodsInfo gi6 = new GoodsInfo(6, "�����", 104.9, 0);
		GoodsInfo gi7 = new GoodsInfo(7, "�ֻ�", 2218.0, 0);
		GoodsInfo gi8 = new GoodsInfo(8, "ϴ��Һ", 9.4, 0);
		GoodsInfo gi9 = new GoodsInfo(9, "�յ�", 3188.2, 0);

		list.add(gi1);
		list.add(gi2);
		list.add(gi3);
		list.add(gi4);
		list.add(gi5);
		list.add(gi6);
		list.add(gi7);
		list.add(gi8);
		list.add(gi9);

		return list;
	}

	public GoodsInfo findById(int goodsId) {
		GoodsInfo gi = null;
		List<GoodsInfo> list = findAll();
		for (GoodsInfo g : list) {
			if (g.getGoodsId().equals(goodsId)) {
				gi = g;
				break;
			}
		}
		return gi;
	}

}
