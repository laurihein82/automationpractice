Setup for running tests

1. Java 1.8
2. Eclipse (probably some other IDE is also fine)
3. Chrome
4. Selenium Client & WebDriver Language Bindings for Java
https://www.selenium.dev/downloads/
extract to convenient folder and add external JARs to project's Java build path
5. Chromedriver
https://sites.google.com/a/chromium.org/chromedriver/
extract straight to drive C: or if different location is preferred then path should be changed in RunTests.java main method
6. If not done automatically with project import then JUnit5 library should be added to project's Java build path
7. To start tests run RunTests.java

If for some reason report should not open in the end of test runs it can be found in the root folder of the project
