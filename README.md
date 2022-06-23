# Roger's Sauce Day

<img src="./imgs/sauce_logo.png" alt="rogers-logo" width="400"/>
<div>&nbsp;</div>
<img src="./imgs/rogers_logo.png" alt="rogers-logo" width="400"/>
<div>&nbsp;</div>

In this automation best practices workshop you will learn the fundamentals of testing and some techniques to drastically improve your testing!

We will mostly focus on functional web testing but will discuss other things along the way

## 🧠 &nbsp; You will learn:

- Use industry-standard best practices
- Create functional browser tests using Selenium
- Automatically get robust test reports with logs + videos

## 🔧 &nbsp; Technologies you will use

- Sauce Labs
- Selenium
- Java
- Maven

## Table of Contents

- Introduction to workshop
- [Gitpod setup](#gitpod-setup)
- [E2E browser tests](./docs/E2E-TESTS.MD)

<!-- ## Requirements

> **This is NOT a beginners course and you will not learn Java testing fundamentals here. However, you will learn a number of amazing skills, techniques, and tools to help you test web applications**

- At least 1 year of Java programming
- Deep understanding of Selenium WebDriver
- Deep understanding of OOP
- Java 8 installed
- Java IDE installed
- [Git](https://git-scm.com/downloads)
- [Maven installed](https://maven.apache.org/install.html) -->

## Your Instructor: Chris Eccleston

<img src="./imgs/chris.jpg" alt="Chris Eccleston profile photo" width="200"/>

- 🏢 &nbsp; I’m a Solutions Architect at Sauce Labs
- 😄 &nbsp; Pronouns: he/him

📫 &nbsp; Links:
<span></span>

[![LinkedIn](https://img.shields.io/badge/LinkedIn-0077B5?style=for-the-badge&logo=linkedin&logoColor=white)](https://www.linkedin.com/in/chris-eccleston-42119541/)
[![Twitter](https://img.shields.io/badge/Twitter-1DA1F2?style=for-the-badge&logo=twitter&logoColor=white)](https://twitter.com/chriseccleston)
[![Github](https://img.shields.io/badge/Github-100000?style=for-the-badge&logo=github&logoColor=white)](https://www.github.com/c3ccl3ston)

## Setup

### Sign up for account

[![Sauce Labs](https://img.shields.io/badge/SauceLabs-FF221A?style=for-the-badge&logo=saucelabs&logoColor=white)](https://saucelabs.com/sign-up)

### Gitpod setup

[![Open in Gitpod](https://gitpod.io/button/open-in-gitpod.svg)](https://gitpod.io#https://github.com/c3ccl3ston/rogers-sauce-day)

> ℹ️ &nbsp; Gitpod lets you run an entire Dev environment from a browser! You can use this approach if you don't know how to setup a local Java environment.

- Sign in to Gitpod with the GitHub credentials
- Once the development environment is loaded, you should see 'Ready to test!' in the Terminal window in the lower portion of the window, run the following commands in that Terminal to set your `SAUCE_USERNAME` and `SAUCE_ACCESS_KEY`:

> ℹ️ &nbsp; You can get your Sauce Labs Username and Access Key by going to the [Sauce Labs user settings page](https://app.saucelabs.com/user-settings)

```bash
eval $(gp env -e SAUCE_USERNAME=<sauce_username>)
eval $(gp env -e SAUCE_ACCESS_KEY=<sauce_access_key>)
```

> ℹ️ &nbsp; Replace `<sauce_username>` and `<sauce_access_key>` with your credentials

Once you have run those 2 commands, you can run the following commands to test your environment variables:

```bash
echo $SAUCE_USERNAME
echo $SAUCE_ACCESS_KEY
```

Run example tests

```bash
mvn test -Dtest=E2ETests
```

  <details>
    <summary>
      <strong>Click here</strong> to see an example console output.
    </summary>

```bash
Tests run: 4, Failures: 0, Errors: 0, Skipped: 3, Time elapsed: 8.073 s - in com.saucedemo.exercises.E2ETests
[INFO]
[INFO] Results:
[INFO]
[WARNING] Tests run: 4, Failures: 0, Errors: 0, Skipped: 3
[INFO]
[INFO] ------------------------------------------------------------------------
[INFO] BUILD SUCCESS
[INFO] ------------------------------------------------------------------------
[INFO] Total time:  9.663 s
[INFO] Finished at: 2022-06-23T01:56:21Z
[INFO] ------------------------------------------------------------------------
```

  </details>

&nbsp;

### ✅ 👏 &nbsp; Environment setup is complete if tests passed

---

## Key

💡 this is a tip

🏋️‍♀️ this is an exercise for you to do

❓ this is a question for us to think and talk about. Try not to scroll beyond this question before we discuss
