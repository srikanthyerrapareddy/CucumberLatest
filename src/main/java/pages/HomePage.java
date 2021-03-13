package pages;

import wrappers.GenericWrapper;

public class HomePage extends GenericWrapper{
	
	
	
	public HomePage clickOnCovidMessage() {
		
		clickByXpath("/html/body/app-root/app-home/div[1]/app-header/p-dialog[2]/div/div[2]/div/form/div[2]/button");
	
	  return this;
	
	}
	
	public RegisterPage clickOnRegister() {
		
		
		clickByXpath("/html/body/app-root/app-home/div[1]/app-header/p-dialog[2]/div/div[2]/div/form/div[2]/button");
	return new RegisterPage();
	
	}
	
	public HomePage clickOnStays() {
		clickByXpath("/html/body/app-root/app-home/div[1]/app-header/div[2]/div[2]/div[2]/nav/ul/li[5]/a");
		
		return this;
		
		
		
	}
	
	public AccomodationPage clickOnLounge() {
		
		clickByXpath("/html/body/app-root/app-home/div[1]/app-header/div[2]/div[2]/div[2]/nav/ul/li[5]/ul/li[3]/a/span");
		return new AccomodationPage();
	}
	
	

}
