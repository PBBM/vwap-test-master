package hsoft;

public class DataProviderFactory {

	public static DataProvider getDataProvider() {
		// TODO Auto-generated method stub
		return createDataProvider();
	}
	
	private static DataProvider createDataProvider() {
		return new DataProvider();
	}

}
