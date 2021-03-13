package stepdef;

import io.cucumber.java.en.When;
import pages.HomePage;
import pages.RegisterPage;
import wrappers.GenericWrapper;

    public class Register  extends GenericWrapper{

	
	@When("click on register")
	public void click_on_register() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
		new HomePage().clickOnRegister();
	}

	@When("enter username")
	public void enter_username() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
		new RegisterPage().waitingTime(5000).enterUserName("Liberty");
	}
}
