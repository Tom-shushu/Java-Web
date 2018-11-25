package bean;

public class GoodsInfo {

	private Integer goodsId;
	private String goodsName;
	private Double goodsPrice;
	private Integer goodsNum;
	
	public GoodsInfo() {
	}
	
	public GoodsInfo(Integer goodsId, String goodsName, Double goodsPrice, Integer goodsNum) {
		this.goodsId = goodsId;
		this.goodsName = goodsName;
		this.goodsPrice = goodsPrice;
		this.goodsNum = goodsNum;
	}

	public Integer getGoodsId() {
		return goodsId;
	}
	public void setGoodsId(Integer goodsId) {
		this.goodsId = goodsId;
	}
	public String getGoodsName() {
		return goodsName;
	}
	public void setGoodsName(String goodsName) {
		this.goodsName = goodsName;
	}
	public Double getGoodsPrice() {
		return goodsPrice;
	}
	public void setGoodsPrice(Double goodsPrice) {
		this.goodsPrice = goodsPrice;
	}
	public Integer getGoodsNum() {
		return goodsNum;
	}
	public void setGoodsNum(Integer goodsNum) {
		this.goodsNum = goodsNum;
	}
	
	@Override
	public boolean equals(Object obj) {
		GoodsInfo g = (GoodsInfo)obj;
		return g.getGoodsId().equals(this.getGoodsId());
	}
	
}
