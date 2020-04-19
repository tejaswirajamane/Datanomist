$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("./src/test/java/com/datanomist/feature/MoneyControl.feature");
formatter.feature({
  "line": 1,
  "name": "Money Control",
  "description": "",
  "id": "money-control",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 3,
  "name": "Test Money Control",
  "description": "",
  "id": "money-control;test-money-control",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 5,
  "name": "Open money control site.",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "click on Most active shares.",
  "keyword": "Then "
});
formatter.step({
  "line": 7,
  "name": "click on see all most Active link",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "verify it opens most Active stocks screen",
  "keyword": "Then "
});
formatter.step({
  "line": 9,
  "name": "get data available in Most Actve stockes data table",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinationsForMoneyControl.open_money_control_site()"
});
formatter.result({
  "duration": 49421823500,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinationsForMoneyControl.click_on_Most_active_shares()"
});
formatter.result({
  "duration": 474861617,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinationsForMoneyControl.click_on_see_all_most_Active_link()"
});
formatter.result({
  "duration": 13908931824,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinationsForMoneyControl.verify_it_opens_most_Active_stocks_screen()"
});
formatter.result({
  "duration": 6371311,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinationsForMoneyControl.get_data_available_in_Most_Actve_stockes_data_table()"
});
formatter.result({
  "duration": 13110251153,
  "status": "passed"
});
});