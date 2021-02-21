package checkedException;

public class DataFetcher {
	public String fetchDataFormUrl(String url) throws CheckedException{
		if(url == null){
			throw new CheckedException("Url not found");
		}
		String data = null;
		return data;
	}
}

 class CheckedException extends Exception{
	public CheckedException(String message){
		super(message);
	}
}

 class DtatFetcherDemo{
	 private DataFetcher dataFetcher;
	 public void DataFetcherDemo(DataFetcher dataFetcher){
		 this.dataFetcher = dataFetcher;
	 }
	 
	 public void fetchData(){
		 String url = "http://google.com";
		 try{
			 String fetchedData = dataFetcher.fetchDataFormUrl(url);
			 System.out.println(fetchedData);
		 }catch(CheckedException e){
			 e.printStackTrace();
		 }
	 }
 }