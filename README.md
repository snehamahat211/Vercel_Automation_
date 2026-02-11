# Vercel_Automation_
### 1. Project Overview
 Our objective is to achieve an entirely self-operated process: starting at the first input stage through completion of all submissions without requiring human assistance. Automated systems handle submission of forms on every sign-up page, incorporating safeguards such as email-based One-Time Passwords for security.

 ### 2. Environment & Prerequisites
 
 Essential resources for executing this endeavor include: an appropriate setting and necessary software. :

##### Language:
Java (JDK 25 ).

##### Framework: 
TestNG (Testing Framework).

##### Automation Tool: 
Selenium WebDriver (Selenium 4),Mailosaur.

##### Crafting tool:
Apache Maven (via pom. ).

##### Driver: 
Chrome (Version 144) using ChromeDriver.

##### Version Control: 
Git/GitHub for source code management.


### 3. Core Features & Task Requirements
As per the task the script must:


-Automatically Process Sign-Up: Cover Every Step in the Registration Sequence.

-Ensure correct filling of forms by submitting different data entries such as selecting options in drop-down menus and checking boxes.

-OTP security involves automating the process of extracting and entering email-based One-Time Passwords.

-Support Across Multiple Browsers: The present configuration employs Google Chrome; however, the endeavor aims at being adaptable for comprehensive browser evaluation including Internet Explorer and Mozilla Firefox.


### 4. Setup and Execution Instructions
#### A. Repository Setup:
-Clone the repository from GitHub: git clone .


#### B. Running the Script:
-Use Maven: Execute the 'mvn test' task within your project's main folder.

#### C.Using the TestNG framework: 

-Select "Right-Click" on the TestNG project. 
-Open an XML file or choose the primary testing script, then execute it by clicking on "Run.

### 5. Technical Implementation Details

-The Page Object Model (POM) facilitates separation of page elements' locators by employing methods such as "By. CSS selector and Selenium WebDriver methods. By refining test procedures through logical enhancements, we aim for improved code manageability.


-Concurrency control: Employing explicit waits (such as WebDriverWait in Selenium WebDriver), we manage dynamically changing UI components and navigation processes on web pages.


-Project setup using Maven and TestNG ensures compatibility with CI/CD platforms such as Jenkins or GitHub Actions for seamless automation of builds and tests.


### 7. Test Passed

#### 1.final test passed
![Output](img.png)





 





