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
  "name": "Select vehicle type as \u003cVEHICLETYPE\u003e",
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
        "Sedan"
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
  "name": "Select vehicle type as Sedan",
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
  "duration": 5892928000,
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
  "duration": 34557985280,
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
  "duration": 598146560,
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
  "duration": 274550187,
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
  "duration": 129768533,
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
  "duration": 121582080,
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
  "duration": 865687467,
  "status": "passed"
});
formatter.match({
  "location": "SampleTest.dontSelectbookButton()"
});
formatter.result({
  "duration": 45654,
  "status": "passed"
});
formatter.after({
  "duration": 125440,
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
  "name": "Select vehicle type as Sedan",
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
  "duration": 116480,
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
  "duration": 1080899840,
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
  "duration": 148415573,
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
  "duration": 311621120,
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
  "duration": 208397653,
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
  "duration": 526646187,
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
  "duration": 598397440,
  "status": "passed"
});
formatter.match({
  "location": "SampleTest.dontSelectbookButton()"
});
formatter.result({
  "duration": 18346,
  "status": "passed"
});
formatter.after({
  "duration": 33280,
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
  "name": "Select vehicle type as Sedan",
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
  "duration": 77227,
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
  "duration": 650018134,
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
  "duration": 153933653,
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
  "duration": 232580693,
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
  "duration": 114319360,
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
  "duration": 128229120,
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
  "duration": 839101014,
  "status": "passed"
});
formatter.match({
  "location": "SampleTest.dontSelectbookButton()"
});
formatter.result({
  "duration": 84480,
  "status": "passed"
});
formatter.after({
  "duration": 96000,
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
  "name": "Select vehicle type as Sedan",
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
  "duration": 75947,
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
  "duration": 706435840,
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
  "duration": 129500160,
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
  "duration": 195979947,
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
  "duration": 121017600,
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
  "duration": 132804267,
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
  "duration": 816649813,
  "status": "passed"
});
formatter.match({
  "location": "SampleTest.dontSelectbookButton()"
});
formatter.result({
  "duration": 29440,
  "status": "passed"
});
formatter.after({
  "duration": 26026,
  "status": "passed"
});
});