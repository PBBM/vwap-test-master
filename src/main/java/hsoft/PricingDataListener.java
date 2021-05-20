package hsoft;

public class PricingDataListener {

	private String productId;
	private double fairValue;
	
	public PricingDataListener(String productId, double fairValue) {
		this.productId = productId;
		this.fairValue = fairValue;
	}
	public PricingDataListener() {
	}
	
	public String getProductId() {
		return productId;
	}
	public void setProductId(String productId) {
		this.productId = productId;
	}
	public double getFairValue() {
		return fairValue;
	}
	public void setFairValue(double fairValue) {
		this.fairValue = fairValue;
	}
	
	
}
