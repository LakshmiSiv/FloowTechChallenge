# FloowTechChallenge
Technology Stack:

-----------------

- Note: Designed and Exceuted in Windows



- Test Design - Cucumber (Gherkin)



- Test Exceution - Cucumber JVM, Selenium Web Driver, Appium, Java



- Test Framework - Junit



- Project Configuration - Maven/POM




Framework Structure:

----------------------



- Features - Step Definitions - Step Implementations (Pom- Page Object Model.)



- Test Data Preparation and Management (Property File, Excel, Faker).




Directories:

------------



- Test Scenarios - src/test/features



- Step Definitions - src/test/java/stepDefinitions



- Step Implementations - src/main/java/stepImplmns




Pre-requisite to create Automation Framework:

----------------------------------------------


- Intellij IDEA - IDE


- Dependencies - Selenium, Junit, Appium, Cucumber, Apache POI


- Test Data - Excel, property file.



Test Sets:

-----------



- Account.feature 

- Navigation.feature 

- Orientation.feature 


Executing the Test scripts:

---------------------------


Pre-requisite:

Install Intellij IDEA

Open Project


Install Maven Locally to run from command prompt or from .bat file 



Execution Steps:

----------------



1. Import project to intellij idea and navigate to test directory and exceute the run file (/src/test/java/run)

   or locate the pom.xml directory using command prompt and use the command mvn test "Location of pom.xml" for execution.

