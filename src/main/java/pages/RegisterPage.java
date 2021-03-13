package pages;

import wrappers.GenericWrapper;

public class RegisterPage extends GenericWrapper{
	
	public RegisterPage enterUserName(String data) {
		
		enterByXpath("//*[@id=\"userName\"]", data);
		return this;
			
	}
	
	public RegisterPage waitingTime(long time) {
		
		waitTime(time);
		return this;
	}

}
