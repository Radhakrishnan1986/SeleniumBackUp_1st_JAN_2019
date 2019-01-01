package sample;

import cucumber.api.java.en.And;
import cucumber.api.java.en.But;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class SampleTestcase {

	@Given("^Open the Browser as (.*) as (.*)$")
	public void openbrowser(String Browser, String Sample1){
		System.out.println(Browser +" "+ Sample1);
	}
	@When("^Launch the Url as (.*)$")
	public void launchUrl(String URL) {
		System.out.println(URL);
	}
	
	@Then("^Enter the UserName as (.*)$")
	public void userName(String username) {
		System.out.println(username);
	}
	
	@And("^Enter the MobileNumber as (.*)$")
	public void mobileNumber(int mobilenumber) {
		System.out.println(mobilenumber);
	}
	@Then("^Enter PickUp address as (.*)$")
	public void pickupAddress(String pickupaddress) {
		System.out.println(pickupaddress);
	}
	@Then("^Enter DropAddress as (.*)$")
	public void dropAddress(String dropaddress) {
		System.out.println(dropaddress);
	}
	@And("^Select VehicleType as (.*)$")
	public void vehicleType(String vehicletype) {
		System.out.println(vehicletype);
	}
	@But("^Donot select the submitbutton$")
	public void submitbutton() {
		
	}
}
