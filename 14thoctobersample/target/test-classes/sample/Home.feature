@sample
Feature: To test the NTL taxi website
Scenario: To test the home page
Given Open the Browser as FIREFOX Test test as Sample
When Launch the Url as http://www.ntltaxi.com/
Then Enter the UserName as Radhakrishnan
And Enter the MobileNumber as 8888888888
Then Enter PickUp address as Chrompet
Then Enter DropAddress as Velachery
And Select VehicleType as Sedan
But Donot select the submitbutton



