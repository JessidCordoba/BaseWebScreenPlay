#Autor: Jessid Cordoba
#language: en

Feature: Login
  I as a user of the application
  I want to access the application with my username and password
  To make a purchase

  @Login @XRAYJ-2
  Background: Successful login
    Given that the User want do login in the application
    When he enter credentials
      | User | Password |
      | prueba1701@gmail.com | 123456789 |
    Then he must access the homepage
      |Answer|
      | TRUE |
    @Purchase @XRAYJ-1
    Scenario Outline: Purchase a book
      When he searches a book
        |<Book>|
      Then he finds this book
        |<Book>|
      And  he closes the session
      Examples:
      |Book|
      |NIKOLA TESLA EL SENOR DEL MUNDO|
