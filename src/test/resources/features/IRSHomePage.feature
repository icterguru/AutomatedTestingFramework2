
Feature: IRS Menu Link Test
I want to test IRS menu Links

Background:
Given I go to IRS Home page

Scenario: File Link test
When I click on the File link
Then I see the File page

Scenario: Pay Link test
When I click on the Pay link
Then I see the Pay page


Scenario: Refunds Link test
When: I click on the Refunds link
Then: I see the Refunds page

Scenario Outline: Selecting different menu link and checking the corresponding page     
	When I clicked on the link "<menuLinkText>"     
	Then I saw the page "<menuLinkPage>" 
 
  Examples:        
  |menuLinkText|menuLinkPage|
  |File|File|
  |Pay|Pay|
  |Refunds|Refunds|
  