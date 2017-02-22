$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("1-registration-finctionality.feature");
formatter.feature({
  "line": 1,
  "name": "Registration finctionality",
  "description": "",
  "id": "registration-finctionality",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 5,
  "name": "Registration with valid credentials",
  "description": "",
  "id": "registration-finctionality;registration-with-valid-credentials",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 4,
      "name": "@POR-2"
    },
    {
      "line": 4,
      "name": "@OPEN"
    }
  ]
});
formatter.step({
  "line": 7,
  "name": "Open Chrome and start portal",
  "keyword": "Given "
});
formatter.step({
  "line": 8,
  "name": "I enter valid credentials",
  "keyword": "When "
});
formatter.step({
  "line": 9,
  "name": "User should be able to register",
  "keyword": "Then "
});
formatter.match({
  "location": "RegistrationTests.open_Chrome_and_start_portal()"
});
formatter.result({
  "duration": 8294796418,
  "status": "passed"
});
formatter.match({
  "location": "RegistrationTests.i_enter_valid_credentials()"
});
formatter.result({
  "duration": 2665356625,
  "status": "passed"
});
formatter.match({
  "location": "RegistrationTests.user_should_be_able_to_register()"
});
formatter.result({
  "duration": 6353316,
  "status": "passed"
});
formatter.scenario({
  "line": 13,
  "name": "Registration with invalid credentials",
  "description": "",
  "id": "registration-finctionality;registration-with-invalid-credentials",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 12,
      "name": "@POR-2"
    },
    {
      "line": 12,
      "name": "@OPEN"
    }
  ]
});
formatter.step({
  "line": 15,
  "name": "Open Chrome and start portal",
  "keyword": "Given "
});
formatter.step({
  "line": 16,
  "name": "I enter invalid credentials",
  "keyword": "When "
});
formatter.step({
  "line": 17,
  "name": "User should not be able to register",
  "keyword": "Then "
});
formatter.match({
  "location": "RegistrationTests.open_Chrome_and_start_portal()"
});
formatter.result({
  "duration": 7091158691,
  "status": "passed"
});
formatter.match({
  "location": "RegistrationTests.i_enter_invalid_credentials()"
});
formatter.result({
  "duration": 2509375495,
  "status": "passed"
});
formatter.match({
  "location": "RegistrationTests.user_should_not_be_able_to_register()"
});
formatter.result({
  "duration": 105622111,
  "status": "passed"
});
});