package dao;

import java.util.ArrayList;
import java.util.List;

import bean.GoodsInfo;

public class GoodsInfoDAO {

	public List<GoodsInfo> findAll() {
		List<GoodsInfo> list = new ArrayList<GoodsInfo>();

		GoodsInfo gi1 = new GoodsInfo(1, "显示器", 1887.5, 0);
		GoodsInfo gi2 = new GoodsInfo(2, "农夫山泉", 1.5, 0);
		GoodsInfo gi3 = new GoodsInfo(3, "可口可乐", 3.2, 0);
		GoodsInfo gi4 = new GoodsInfo(4, "键鼠套装", 117.5, 0);
		GoodsInfo gi5 = new GoodsInfo(5, "灯泡", 4.3, 0);
		GoodsInfo gi6 = new GoodsInfo(6, "电风扇", 104.9, 0);
		GoodsInfo gi7 = new GoodsInfo(7, "手机", 2218.0, 0);
		GoodsInfo gi8 = new GoodsInfo(8, "洗手液", 9.4, 0);
		GoodsInfo gi9 = new GoodsInfo(9, "空调", 3188.2, 0);

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
