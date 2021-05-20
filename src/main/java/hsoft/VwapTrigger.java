package hsoft;

import java.util.ArrayList;

public class VwapTrigger {
	
  public static void main(String[] args) {
	  
    DataProvider provider = DataProviderFactory.getDataProvider();
    
    ArrayList transactionsList = new ArrayList();
    
    provider.addPricingDataListener(new PricingDataListener() {
      public void fairValueChanged(String productId, double fairValue) {
        // TODO Start to code here when a fair value changed
    	  
    	  PricingDataListener pdl = new PricingDataListener();
    	  pdl.setProductId(productId);
    	  pdl.setFairValue(fairValue);
    	  
    	  transactionsList.add(pdl);
    	  
    	  System.out.println("Fair value for " + productId + " is " + fairValue);
      }
    });
    
    provider.addMarketDataListener(new MarketDataListener() {
    	    	
      public void transactionOccured(String productId, long quantity, double price) {
        // TODO Start to code here when a transaction occurred
    	  
    	  double vwap;
    	  vwap = price / quantity;
    	  
    	  MarketDataListener mdl = new MarketDataListener();
    	  mdl.setVwap(vwap);
    	  mdl.setProductId(productId);
    	  mdl.setQuantity(quantity);
    	  mdl.setPrice(price);
    	  
    	  transactionsList.add(mdl);
    	  
    	// Method to calculate the Volume Weighted Average Price (VWAP) 
    	// over the 5 last transactions received for each product.
    	  
    	  System.out.println("VWAP for " + productId + " = " + price + " / " + quantity + " = " + vwap );
    	  
      }
    });
    

    
    provider.listen();
    // When this method returns, the test is finished and you can check your results
  }
}