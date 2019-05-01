# Web Automation Framework with Gherkin, Cucumber, Selenium and Java language

Technology:
-----------
- Java - version 1.8
- Selenium
- Cucumber
- Gherkin
- Intelli IDEA - version(2018.3.3)

Run Automation:
--------------
- Both MAC and Windows platform 
- Browser Goggle Chrome and Mozilla Firefox (Default browser: Google Chrome)

How to run:
-----------
1. Install latest maven then set environment path.
2. Go to project directory by $cd Web-Gherkin-Cucumber-Selenium-Java.
3. Follow the following steps.

To build and run this project
-----------------------------
mvn clean install

To run a single feature file or a single test case:
--------------------------------------------------
mvn test -Dcucumber.options="--tags @TestTag"