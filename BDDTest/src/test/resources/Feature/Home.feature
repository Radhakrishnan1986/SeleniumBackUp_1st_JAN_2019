@sample
Feature: Validate NTL taxi home page
Scenario Outline: Validate NTL home page with valid data
Given Open Browser as <BROWSER>
Then Enter URL as <URL>
Then Enter User name as <USERNAME>
And Enter phone number as <MOBILENUMBER>
When Select pickup address as <PICKADRESS>
Then Select drop adress as <DROPADDRESS>
And Select vehicle type as <VEHICLETYPE>
But Dont select book button
Examples:
|BROWSER|URL|USERNAME|MOBILENUMBER|PICKADRESS|DROPADDRESS|VEHICLETYPE|
|FIREFOX|http://www.ntltaxi.com/|Radhakrishnan|99999999999|Adaya|Tambaram|Sedan|
|FIREFOX|http://www.ntltaxi.com/|ABC|2222222222|Adaya|Tambaram|Sedan|
|FIREFOX|http://www.ntltaxi.com/|abcd|3333333333|Adaya|Tambaram|Sedan|
|FIREFOX|http://www.ntltaxi.com/|Test|4444444444|Adaya|Tambaram|Sedan|

#Scenario: Validate NTL home page with valid data
#Given Open Browser as FIREFOX
#Then Enter URL as http://www.ntltaxi.com/
#Then Enter User name as Radhakrishnan
#And Enter phone number as 9999999999
#When Select pickup address as Adayar
#Then Select drop adress as Tambaram
#And Select vehicle type as Sedan
#But Dont select book button