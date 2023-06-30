# assignmentSubmission

**Instructions on how to use:**

1. After downloading the project, can go to src -> test -> java and see the files there. I've attempted to use the Page Object Model to cover the test cases I've written out [here](https://docs.google.com/spreadsheets/d/1lT6hjVjEnpZVkWTFYl9nxTKoSVDd-V-a32TzP5Kr-nA/edit?usp=sharing).
   
2. To run the first test case in the google sheet, you can open up clickAQuickLinkTest.java and in there you will see the precondition (ie going to the tvolearn website, clicking 'k-8', clicking 'grade 7' and then clicking on the 'language' card) performed in the setup() method. This webpage is represented in the subjCardPageLearnForward.java file in the 'webpages' package (src -> test -> java -> webpages)
   
3. Run this clickAQuickLinkTest.java as a JUnit test. Your Firefox browser should open up and execute the test case
   
4. If you would like to execute the test case in Google Chrome browser instead of Mozilla Firefox, you can comment out line 26 in the clickAQuickLinkTest.java and uncomment line 24 in this same file and re-run the JUnit test. Chrome should open up this time. This commenting and uncommenting of the "driver = new FirefoxDriver();" and "driver = new ChromeDriver();" lines can be done in any of the test case files found under the 'tests' package (src -> test -> java -> tests)
