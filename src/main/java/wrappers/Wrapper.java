package wrappers;

public interface Wrapper {
	
	public void invokeApp(String browser, String url);
	
	public void clickByXpath(String xpath);
	
	
	public void enterByXpath(String xpath,String data);
	
	public void waitTime(long time) ;
	
	public void closeBrowser();
	


}
