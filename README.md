Apache Maven should be installed, to check it execute "mvn -v". Instruction how to setup Maven You can find here: https://maven.apache.org/install.html;
Build tests: "mvn package";
###For tests building required parameters should be set:

"-Denvironment" — Environment for which You would like to run tests, e.g. "-Denvironment=qatest"
"-DrunnerFile" — Runner file which specifies browsers strategy for test execution:
"-DrunnerFile=all_browsers" — It means that tests will be executed in all available browsers;
"-DrunnerFile=select_browser" - It means that tests will be executed in one of the specific browser that You can set using "-Dbrowser" parameter e.g. "-Dbrowser=Chrome";
For example if You want to run tests for "........" only in Chrome You can use the following command: "mvn package -Denvironment=qatest -DrunnerFile=select_browser -Dbrowser=Chrome"; For run tests in all available browsers: "mvn package -Denvironment=qatest -DrunnerFile=all_browsers";

####Note:

Web Browsers Drivers will be downloaded automatically using dependencies in the "pom.xml" file;
Test execution report You can find in the "target/surefire-reports/emailable-report.html";
For run specific test suites You can use "*.xml" files in the "runner" folder and set name of the specific test case;
Available browsers: Chrome, Firefox, Edge, IE11 (Tests in IE11 and Edge currently aren't working, should be provided solution soon);