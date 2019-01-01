@sample
Feature: Validate NTL taxi home page
Scenario: Validate NTL home page with valid data
Given Open Browser
Then Enter URL
Then Enter User name
And Enter phone number
When Select pickup address
Then Select drop adress
And select vehicle type
But Dont select book button
But click submit button