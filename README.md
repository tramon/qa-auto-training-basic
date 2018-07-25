This is a super basic Test Automation project stub on Java for Windows OS on Chrome browser.

Make sure you have:
1. Git installed.
2. Java 1.8 installed and system system variables set.
3. Maven installed
4. latest Chrome browser intalled.

To start test automation framework
1.  Download project:
1.1 Open command line (Git Bash)
1.2 Enter: git clone https://github.com/tramon/qa-auto-training-basic.git
2.  Download latest version of chromedriver and put it in the project in \\drivers directory.
4.  Pass following system variables to start a test:
    (it can be done in Idea by passing them as an arguments to your runner)
    -Dwebdriver.driver=chrome
    -Dwebdriver.chrome.driver=drivers/chromedriver.exe
