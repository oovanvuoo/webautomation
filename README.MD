# WebAutomation

A Java Selenium automation framework for web application testing, built with Gradle and TestNG.

---

## 📁 Project Structure

```
src/
  main/java/
    config/           # Configuration classes (URLs, environment, etc.)
    elements/         # Element locators and test data
      selector/       # CSS selectors for web elements
      testdata/       # Test accounts and data
    pages/            # Page Object Model classes
    utils/            # Utilities and actions (scroll, click, etc.)
      actions/        # Common web actions
  test/java/
    base/             # Base test class
    tests/            # Test cases
build.gradle
settings.gradle
README.md
```

---

## 🚀 Getting Started

### Prerequisites

- Java 17 or higher
- Gradle
- Chrome/Firefox browser and driver (or use WebDriverManager)

### Install Dependencies

```sh
mvn test -Dbrowser=chrome -Dheadless=true
```
Default is QA Environment

### Run Tests

You can specify the environment (QA, dev, staging, prod, etc.):

```sh
mvn test -Dbrowser=chrome -Dheadless=true -Denv=dev
```

---

## 🧩 Key Components

- **BaseTest**: Initializes WebDriver and sets up environment URLs.
- **Account**: Stores test account data and can load from file.
- **LoginPage**: Page Object for login and challenge management.
- **Do**: Utility class for actions like scroll, right-click, etc.
- **WebItemsMgr**: Centralizes element keys for selectors.
- **CSSSelector**: Maps logical element names to CSS selectors.

---

## 📝 Example Usage

```java
// Login with a test account
loginPage.loginWithAccount(Account.Acc1.username, Account.Acc1.password);

// Scroll to an element by CSS selector
doAction.scrollDownToElement(WebItemsMgr.LOGIN_BUTTON_REGISTER, "css");

// Assert challenge details
Assert.assertEquals(loginPage.getChallengeName(), "V Challenge");
```

---

## 📄 Adding Test Accounts

Add new accounts in `elements/testdata/account.java`:

```java
public static final Account Acc3 = new Account("username", "password");
```

Or load from a file using:

```java
List<Account> accounts = Account.loadAccountsFromFile("accounts.txt");
```

Where `accounts.txt` contains:
```
user1,password1
user2,password2
```

---

## 🛠️ Customizing

- Update selectors in `elements/selector/CSSSelector.java`.
- Add new page objects in `pages/`.
- Add new test cases in `test/java/tests/`.

---

## 🧪 Writing a Test

Example TestNG test:

```java
@Test
public void testLogin() {
    loginPage.openLoginPage();
    loginPage.loginWithAccount(Account.Acc1.username, Account.Acc1.password);
    Assert.assertTrue(loginPage.isInDashboard(), "Login failed or not redirected to dashboard");
}
```

---

## 📊 Test Reports

After running your tests with Gradle, a detailed HTML report is generated automatically.

- **Location:**  
  `/build/reports/tests/test/packages/tests.html`

Open this file in your browser to view the results of your `LoginPageTest` (and other test classes).

**Example:**
```sh
open /build/reports/tests/test/packages/tests.html
```
(on Mac, use `open`; on Windows, use `start`)

You can also view the specific report at example:
```
build/reports/tests/test/classes/tests.LoginPageTest.html
```