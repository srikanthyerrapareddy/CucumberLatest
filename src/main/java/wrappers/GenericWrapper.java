package wrappers;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import utils.Reporting;

public class GenericWrapper extends Reporting implements Wrapper{
	
	
	public static RemoteWebDriver driver;

	public void invokeApp(String browser, String url) {
		// TODO Auto-generated method stub
		try {
			if(browser.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
			driver = new ChromeDriver();
			}
			
			driver.manage().window().maximize();
			driver.get(url);
			logStep("pass", "The given browser "+browser+" is launched with given url "+url+" successfully");
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	public void clickByXpath(String xpath) {
		// TODO Auto-generated method stub
		
		try {
			driver.findElementByXPath(xpath).click();
			
			logStep("pass", "The webElement with xpath "+xpath+" is clicked successfully");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	public void enterByXpath(String xpath,String data) {
		// TODO Auto-generated method stub
		
		try {
			driver.findElementByXPath(xpath).sendKeys(data);
			
			logStep("pass", "The webElement with xpath "+xpath+" is entered with the data "+data+" successfully");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	public void waitTime(long time) {
		// TODO Auto-generated method stub
		
		try {
			Thread.sleep(time);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public long takeSnap() {
		// TODO Auto-generated method stub
		long number= 1;
	try {
		number= (long) (Math.floor(Math.random()*1000000)+1000000);	
		File temp=	driver.getScreenshotAs(OutputType.FILE);
		File dest = new File("./Reports/screenshot/"+number+".png");
		FileUtils.copyFile(temp, dest);
	} catch (WebDriverException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
		return number;
	}

	public void closeBrowser() {
		// TODO Auto-generated method stub
		driver.quit();
	}

}
