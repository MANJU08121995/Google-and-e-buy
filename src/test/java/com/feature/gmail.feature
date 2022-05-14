Feature: Gmail Application

Scenario Outline: Gmail Page
Given user Launch The Url
When user EnterThe Valid Email In "<email>" Field
Then user Click TheNext Button And Navigate To Password Page
Examples:
|email|
|manju12|
|manju08|
|manjumani081295@gmail.com|
Scenario Outline: Password Page
When user EnterThe Valid Password In "<password>" Field
Then user Click TheNext Button And Navigate To GoogleAccount Home Page
Examples:
|password|
|anish@123|
|tamil123|
|8428500675m|
Scenario: Ebay page Application
Given user Navigate to The Ebay Url
When user Enter The "Electric Guitar" In Search Text Field
Then user Click The Search Button And Navigate to Electric Guitar Page
Scenario: Electric Guitar Page
When user Get The Guitar Price
