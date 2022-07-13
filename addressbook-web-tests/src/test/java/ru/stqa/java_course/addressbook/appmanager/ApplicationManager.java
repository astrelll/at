package ru.stqa.java_course.addressbook.appmanager;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.BrowserType;

import java.time.Duration;

import static org.testng.Assert.fail;

public class ApplicationManager {
  WebDriver driver;
  private NavigationHelper navigationHelper;
  private ContactHelper contactHelper;
  private GroupHelper groupHelper;
  private SessionHelper sessionHelper;
  private String baseUrl;
  private boolean acceptNextAlert = true;
  private StringBuffer verificationErrors = new StringBuffer();
  private JavascriptExecutor js;

  public void init() {
//    less 3.1
//    String browser = BrowserType.CHROME;
//    if (browser == BrowserType.CHROME()){}
    System.setProperty("webdriver.chrome.driver", "C:/tools/chromedriver_win32/chromedriver.exe");
    driver = new ChromeDriver();
    baseUrl = "http://localhost/addressbook/";
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(0));
    driver.get("http://localhost/addressbook/group.php");
    groupHelper = new GroupHelper(driver);
    js = (JavascriptExecutor) driver;
    navigationHelper = new NavigationHelper(driver);
    sessionHelper = new SessionHelper(driver);
    contactHelper = new ContactHelper(driver);
    sessionHelper.login("admin", "secret");
  }

  public void stop() {
    driver.quit();
    String verificationErrorString = verificationErrors.toString();
    if (!"".equals(verificationErrorString)) {
      fail(verificationErrorString);
    }
  }

  public GroupHelper getGroupHelper() {
    return groupHelper;
  }

  public NavigationHelper getNavigationHelper() {
    return navigationHelper;
  }

  public ContactHelper getContactHelper() {
    return contactHelper;
  }

}
