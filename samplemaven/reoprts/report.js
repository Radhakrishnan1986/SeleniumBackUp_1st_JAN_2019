$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Sample/Home.feature");
formatter.feature({
  "line": 2,
  "name": "Validate NTL taxi home page",
  "description": "",
  "id": "validate-ntl-taxi-home-page",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@sample"
    }
  ]
});
formatter.scenario({
  "line": 3,
  "name": "Validate NTL home page with valid data",
  "description": "",
  "id": "validate-ntl-taxi-home-page;validate-ntl-home-page-with-valid-data",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 4,
  "name": "Open Browser",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "Enter URL",
  "keyword": "Then "
});
formatter.step({
  "line": 6,
  "name": "Enter User name",
  "keyword": "Then "
});
formatter.step({
  "line": 7,
  "name": "Enter phone number",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "Select pickup address",
  "keyword": "When "
});
formatter.step({
  "line": 9,
  "name": "Select drop adress",
  "keyword": "Then "
});
formatter.step({
  "line": 10,
  "name": "select vehicle type",
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "Dont select book button",
  "keyword": "But "
});
formatter.step({
  "line": 12,
  "name": "click submit button",
  "keyword": "But "
});
formatter.match({
  "location": "SampleTest.openBrowser()"
});
formatter.result({
  "duration": 583375964,
  "status": "passed"
});
formatter.match({
  "location": "SampleTest.enterUrl()"
});
formatter.result({
  "duration": 296106,
  "status": "passed"
});
formatter.match({
  "location": "SampleTest.enterUSerName()"
});
formatter.result({
  "duration": 346026,
  "status": "passed"
});
formatter.match({
  "location": "SampleTest.enterPhoneNumber()"
});
formatter.result({
  "duration": 797013,
  "status": "passed"
});
formatter.match({
  "location": "SampleTest.selectPickUpAddress()"
});
formatter.result({
  "duration": 1361919,
  "error_message": "java.lang.ArithmeticException: / by zero\r\n\tat Sample.SampleTest.selectPickUpAddress(SampleTest.java:31)\r\n\tat ✽.When Select pickup address(Sample/Home.feature:8)\r\n",
  "status": "failed"
});
formatter.match({
  "location": "SampleTest.selectDropAddress()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "SampleTest.selectVehicleType()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "SampleTest.dontSelectbookButton()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
});