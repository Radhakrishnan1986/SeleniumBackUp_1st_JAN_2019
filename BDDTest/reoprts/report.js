$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Home.feature");
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
formatter.scenarioOutline({
  "line": 3,
  "name": "Validate NTL home page with valid data",
  "description": "",
  "id": "validate-ntl-taxi-home-page;validate-ntl-home-page-with-valid-data",
  "type": "scenario_outline",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 4,
  "name": "Open Browser as \u003cBROWSER\u003e",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "Enter URL as \u003cURL\u003e",
  "keyword": "Then "
});
formatter.step({
  "line": 6,
  "name": "Enter User name as \u003cUSERNAME\u003e",
  "keyword": "Then "
});
formatter.step({
  "line": 7,
  "name": "Enter phone number as \u003cMOBILENUMBER\u003e",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "Select pickup address as \u003cPICKADRESS\u003e",
  "keyword": "When "
});
formatter.step({
  "line": 9,
  "name": "Select drop adress as \u003cDROPADDRESS\u003e",
  "keyword": "Then "
});
formatter.step({
  "line": 10,
  "name": "select vehicle type as \u003cVEHICLETYPE\u003e",
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "Dont select book button",
  "keyword": "But "
});
formatter.examples({
  "line": 12,
  "name": "",
  "description": "",
  "id": "validate-ntl-taxi-home-page;validate-ntl-home-page-with-valid-data;",
  "rows": [
    {
      "cells": [
        "BROWSER",
        "URL",
        "USERNAME",
        "MOBILENUMBER",
        "PICKADRESS",
        "DROPADDRESS",
        "VEHICLETYPE"
      ],
      "line": 13,
      "id": "validate-ntl-taxi-home-page;validate-ntl-home-page-with-valid-data;;1"
    },
    {
      "cells": [
        "FIREFOX",
        "http://www.ntltaxi.com/",
        "Radhakrishnan",
        "99999999999",
        "Adaya",
        "Tambaram",
        "Bedan"
      ],
      "line": 14,
      "id": "validate-ntl-taxi-home-page;validate-ntl-home-page-with-valid-data;;2"
    },
    {
      "cells": [
        "FIREFOX",
        "http://www.ntltaxi.com/",
        "ABC",
        "2222222222",
        "Adaya",
        "Tambaram",
        "Sedan"
      ],
      "line": 15,
      "id": "validate-ntl-taxi-home-page;validate-ntl-home-page-with-valid-data;;3"
    },
    {
      "cells": [
        "FIREFOX",
        "http://www.ntltaxi.com/",
        "abcd",
        "3333333333",
        "Adaya",
        "Tambaram",
        "Sedan"
      ],
      "line": 16,
      "id": "validate-ntl-taxi-home-page;validate-ntl-home-page-with-valid-data;;4"
    },
    {
      "cells": [
        "FIREFOX",
        "http://www.ntltaxi.com/",
        "Test",
        "4444444444",
        "Adaya",
        "Tambaram",
        "Sedan"
      ],
      "line": 17,
      "id": "validate-ntl-taxi-home-page;validate-ntl-home-page-with-valid-data;;5"
    }
  ],
  "keyword": "Examples"
});
formatter.scenario({
  "line": 14,
  "name": "Validate NTL home page with valid data",
  "description": "",
  "id": "validate-ntl-taxi-home-page;validate-ntl-home-page-with-valid-data;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 1,
      "name": "@sample"
    }
  ]
});
formatter.step({
  "line": 4,
  "name": "Open Browser as FIREFOX",
  "matchedColumns": [
    0
  ],
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "Enter URL as http://www.ntltaxi.com/",
  "matchedColumns": [
    1
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 6,
  "name": "Enter User name as Radhakrishnan",
  "matchedColumns": [
    2
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 7,
  "name": "Enter phone number as 99999999999",
  "matchedColumns": [
    3
  ],
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "Select pickup address as Adaya",
  "matchedColumns": [
    4
  ],
  "keyword": "When "
});
formatter.step({
  "line": 9,
  "name": "Select drop adress as Tambaram",
  "matchedColumns": [
    5
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 10,
  "name": "select vehicle type as Bedan",
  "matchedColumns": [
    6
  ],
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "Dont select book button",
  "keyword": "But "
});
formatter.match({
  "arguments": [
    {
      "val": "FIREFOX",
      "offset": 16
    }
  ],
  "location": "SampleTest.openBrowser(String)"
});
formatter.result({
  "duration": 6539561976,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "http://www.ntltaxi.com/",
      "offset": 13
    }
  ],
  "location": "SampleTest.enterUrl(String)"
});
formatter.result({
  "duration": 1399100503,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Radhakrishnan",
      "offset": 19
    }
  ],
  "location": "SampleTest.enterUSerName(String)"
});
formatter.result({
  "duration": 489257187,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "99999999999",
      "offset": 22
    }
  ],
  "location": "SampleTest.enterPhoneNumber(String)"
});
formatter.result({
  "duration": 286618940,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Adaya",
      "offset": 25
    }
  ],
  "location": "SampleTest.selectPickUpAddress(String)"
});
formatter.result({
  "duration": 134422441,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Tambaram",
      "offset": 22
    }
  ],
  "location": "SampleTest.selectDropAddress(String)"
});
formatter.result({
  "duration": 170303782,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Bedan",
      "offset": 23
    }
  ],
  "location": "SampleTest.selectVehicleType(String)"
});
formatter.result({
  "duration": 373451042,
  "error_message": "org.openqa.selenium.NoSuchElementException: Cannot locate element with text: Bedan\nFor documentation on this error, please visit: http://seleniumhq.org/exceptions/no_such_element.html\nBuild info: version: \u00272.53.1\u0027, revision: \u0027a36b8b1cd5757287168e54b817830adce9b0158d\u0027, time: \u00272016-06-30 19:26:09\u0027\nSystem info: host: \u0027DESKTOP-KNVC375\u0027, ip: \u0027192.168.1.8\u0027, os.name: \u0027Windows 10\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u002710.0.2\u0027\nDriver info: driver.version: unknown\r\n\tat org.openqa.selenium.support.ui.Select.selectByVisibleText(Select.java:150)\r\n\tat pages.HomePage.selectCartype(HomePage.java:33)\r\n\tat testCases.SampleTest.selectVehicleType(SampleTest.java:80)\r\n\tat ✽.And select vehicle type as Bedan(Home.feature:10)\r\n",
  "status": "failed"
});
formatter.match({
  "location": "SampleTest.dontSelectbookButton()"
});
formatter.result({
  "status": "skipped"
});
formatter.embedding("image/jpeg", "embedded0.jpg");
formatter.after({
  "duration": 773740236,
  "status": "passed"
});
formatter.scenario({
  "line": 15,
  "name": "Validate NTL home page with valid data",
  "description": "",
  "id": "validate-ntl-taxi-home-page;validate-ntl-home-page-with-valid-data;;3",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 1,
      "name": "@sample"
    }
  ]
});
formatter.step({
  "line": 4,
  "name": "Open Browser as FIREFOX",
  "matchedColumns": [
    0
  ],
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "Enter URL as http://www.ntltaxi.com/",
  "matchedColumns": [
    1
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 6,
  "name": "Enter User name as ABC",
  "matchedColumns": [
    2
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 7,
  "name": "Enter phone number as 2222222222",
  "matchedColumns": [
    3
  ],
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "Select pickup address as Adaya",
  "matchedColumns": [
    4
  ],
  "keyword": "When "
});
formatter.step({
  "line": 9,
  "name": "Select drop adress as Tambaram",
  "matchedColumns": [
    5
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 10,
  "name": "select vehicle type as Sedan",
  "matchedColumns": [
    6
  ],
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "Dont select book button",
  "keyword": "But "
});
formatter.match({
  "arguments": [
    {
      "val": "FIREFOX",
      "offset": 16
    }
  ],
  "location": "SampleTest.openBrowser(String)"
});
formatter.result({
  "duration": 130133,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "http://www.ntltaxi.com/",
      "offset": 13
    }
  ],
  "location": "SampleTest.enterUrl(String)"
});
formatter.result({
  "duration": 577598407,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "ABC",
      "offset": 19
    }
  ],
  "location": "SampleTest.enterUSerName(String)"
});
formatter.result({
  "duration": 135418280,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "2222222222",
      "offset": 22
    }
  ],
  "location": "SampleTest.enterPhoneNumber(String)"
});
formatter.result({
  "duration": 224573153,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Adaya",
      "offset": 25
    }
  ],
  "location": "SampleTest.selectPickUpAddress(String)"
});
formatter.result({
  "duration": 126721118,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Tambaram",
      "offset": 22
    }
  ],
  "location": "SampleTest.selectDropAddress(String)"
});
formatter.result({
  "duration": 143394803,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Sedan",
      "offset": 23
    }
  ],
  "location": "SampleTest.selectVehicleType(String)"
});
formatter.result({
  "duration": 675378763,
  "status": "passed"
});
formatter.match({
  "location": "SampleTest.dontSelectbookButton()"
});
formatter.result({
  "duration": 26880,
  "status": "passed"
});
formatter.after({
  "duration": 21760,
  "status": "passed"
});
formatter.scenario({
  "line": 16,
  "name": "Validate NTL home page with valid data",
  "description": "",
  "id": "validate-ntl-taxi-home-page;validate-ntl-home-page-with-valid-data;;4",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 1,
      "name": "@sample"
    }
  ]
});
formatter.step({
  "line": 4,
  "name": "Open Browser as FIREFOX",
  "matchedColumns": [
    0
  ],
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "Enter URL as http://www.ntltaxi.com/",
  "matchedColumns": [
    1
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 6,
  "name": "Enter User name as abcd",
  "matchedColumns": [
    2
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 7,
  "name": "Enter phone number as 3333333333",
  "matchedColumns": [
    3
  ],
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "Select pickup address as Adaya",
  "matchedColumns": [
    4
  ],
  "keyword": "When "
});
formatter.step({
  "line": 9,
  "name": "Select drop adress as Tambaram",
  "matchedColumns": [
    5
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 10,
  "name": "select vehicle type as Sedan",
  "matchedColumns": [
    6
  ],
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "Dont select book button",
  "keyword": "But "
});
formatter.match({
  "arguments": [
    {
      "val": "FIREFOX",
      "offset": 16
    }
  ],
  "location": "SampleTest.openBrowser(String)"
});
formatter.result({
  "duration": 82346,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "http://www.ntltaxi.com/",
      "offset": 13
    }
  ],
  "location": "SampleTest.enterUrl(String)"
});
formatter.result({
  "duration": 1050070123,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "abcd",
      "offset": 19
    }
  ],
  "location": "SampleTest.enterUSerName(String)"
});
formatter.result({
  "duration": 162980058,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "3333333333",
      "offset": 22
    }
  ],
  "location": "SampleTest.enterPhoneNumber(String)"
});
formatter.result({
  "duration": 260368733,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Adaya",
      "offset": 25
    }
  ],
  "location": "SampleTest.selectPickUpAddress(String)"
});
formatter.result({
  "duration": 196906415,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Tambaram",
      "offset": 22
    }
  ],
  "location": "SampleTest.selectDropAddress(String)"
});
formatter.result({
  "duration": 142143818,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Sedan",
      "offset": 23
    }
  ],
  "location": "SampleTest.selectVehicleType(String)"
});
formatter.result({
  "duration": 669602982,
  "status": "passed"
});
formatter.match({
  "location": "SampleTest.dontSelectbookButton()"
});
formatter.result({
  "duration": 29013,
  "status": "passed"
});
formatter.after({
  "duration": 40533,
  "status": "passed"
});
formatter.scenario({
  "line": 17,
  "name": "Validate NTL home page with valid data",
  "description": "",
  "id": "validate-ntl-taxi-home-page;validate-ntl-home-page-with-valid-data;;5",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 1,
      "name": "@sample"
    }
  ]
});
formatter.step({
  "line": 4,
  "name": "Open Browser as FIREFOX",
  "matchedColumns": [
    0
  ],
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "Enter URL as http://www.ntltaxi.com/",
  "matchedColumns": [
    1
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 6,
  "name": "Enter User name as Test",
  "matchedColumns": [
    2
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 7,
  "name": "Enter phone number as 4444444444",
  "matchedColumns": [
    3
  ],
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "Select pickup address as Adaya",
  "matchedColumns": [
    4
  ],
  "keyword": "When "
});
formatter.step({
  "line": 9,
  "name": "Select drop adress as Tambaram",
  "matchedColumns": [
    5
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 10,
  "name": "select vehicle type as Sedan",
  "matchedColumns": [
    6
  ],
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "Dont select book button",
  "keyword": "But "
});
formatter.match({
  "arguments": [
    {
      "val": "FIREFOX",
      "offset": 16
    }
  ],
  "location": "SampleTest.openBrowser(String)"
});
formatter.result({
  "duration": 133547,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "http://www.ntltaxi.com/",
      "offset": 13
    }
  ],
  "location": "SampleTest.enterUrl(String)"
});
formatter.result({
  "duration": 572082041,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Test",
      "offset": 19
    }
  ],
  "location": "SampleTest.enterUSerName(String)"
});
formatter.result({
  "duration": 160521181,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "4444444444",
      "offset": 22
    }
  ],
  "location": "SampleTest.enterPhoneNumber(String)"
});
formatter.result({
  "duration": 217508415,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Adaya",
      "offset": 25
    }
  ],
  "location": "SampleTest.selectPickUpAddress(String)"
});
formatter.result({
  "duration": 122823949,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Tambaram",
      "offset": 22
    }
  ],
  "location": "SampleTest.selectDropAddress(String)"
});
formatter.result({
  "duration": 130046554,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Sedan",
      "offset": 23
    }
  ],
  "location": "SampleTest.selectVehicleType(String)"
});
formatter.result({
  "duration": 855671225,
  "status": "passed"
});
formatter.match({
  "location": "SampleTest.dontSelectbookButton()"
});
formatter.result({
  "duration": 46507,
  "status": "passed"
});
formatter.after({
  "duration": 59306,
  "status": "passed"
});
});