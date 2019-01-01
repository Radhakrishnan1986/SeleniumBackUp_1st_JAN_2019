package Sample;

import cucumber.api.java.en.And;
import cucumber.api.java.en.But;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class SampleTest {
	
	@Given("^Open Browser$")
	public void openBrowser() {
		System.out.println("Browser opend succesfully");
	}
	
	@Then ("^Enter URL$")
	public void enterUrl() {
		System.out.println("Enter URL succesfully");
	}
	@Then ("^Enter User name$")
	public void enterUSerName() {
		System.out.println("Enter User name succesfully");
	}
	@And ("^Enter phone number$")
	public void enterPhoneNumber() {
		System.out.println("Enter Phone number");
	}
	@When ("^Select pickup address$")
	public void selectPickUpAddress() {
		System.out.println("Select Pickup place");
		int i = 1/0;
	}
	@Then ("^Select drop adress$")
	public void selectDropAddress() {
		System.out.println("Select Drop place");
	}
	@And ("^select vehicle type$")
	public void selectVehicleType() {
		System.out.println("Select vehicle type");
	}
	@But ("^Dont select book button$")
	public void dontSelectbookButton() {
		System.out.println("Dont select bookbutton");
	}
		
}
