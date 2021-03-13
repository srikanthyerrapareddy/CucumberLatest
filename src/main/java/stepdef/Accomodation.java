package stepdef;

import io.cucumber.java.en.When;
import pages.HomePage;
import wrappers.GenericWrapper;

public class Accomodation extends GenericWrapper{
	
	@When("click on covid message")
	public void click_on_covid_message() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
		new HomePage().clickOnCovidMessage();
	}

	@When("click on stays")
	public void click_on_stays() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
		new HomePage().clickOnStays();
	}

	@When("click on lounge")
	public void click_on_lounge() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
		new HomePage().clickOnLounge();
	}

	


}
