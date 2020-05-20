#This is the study project to verify the core aspects of some GitHub parts using Selenium WebDriver.

To launch this code on your local machine you must have installed the following things:

JDK
Maven compiler and surefire plugins
At least one of the following browsers: Chrome, FireFox, IE 11.0, Edge, Opera
The following dependencies are used in pom.xml:

Selenium-java
TestNG
The following drivers: Chrome driver, Firefox driver, InternetExplorer driver, Edge driver, Opera driver
Webdrivermanager
Hamcrest
To push the code you should:

git init (do it once)
git add .
git commit -m "write what you did"
git push origin master
To run the tests use the following command: mvn package -DrunnerFile=select_browser -Dbrowser=CHROME (instead of CHROME you may also use the next browsers: FIREFOX, IE11, EDGE, OPERA)