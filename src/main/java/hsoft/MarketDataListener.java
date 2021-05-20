package hsoft;

public class MarketDataListener {

	private String productId;
	private long quantity;
	private double price;
	private double vwap;
	
	public MarketDataListener(String productId, long quantity, double price, double vwap) {
		this.productId = productId;
		this.quantity = quantity;
		this.price = price;
		this.vwap = vwap;
	}

	public MarketDataListener() {
	}

	public String getProductId() {
		return productId;
	}

	public void setProductId(String productId) {
		this.productId = productId;
	}

	public long getQuantity() {
		return quantity;
	}

	public void setQuantity(long quantity) {
		this.quantity = quantity;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public double getVwap() {
		return vwap;
	}

	public void setVwap(double vwap) {
		this.vwap = vwap;
	}
	
}
