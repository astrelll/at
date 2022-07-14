package ru.stqa.java_course.addressbook.tests;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import ru.stqa.java_course.addressbook.appmanager.ApplicationManager;

public class TestBase {

  protected static final ApplicationManager app = new  ApplicationManager();

  @BeforeSuite
  public void setUp() throws Exception {
    app.init();
  }

  @AfterSuite
  public void tearDown() throws Exception {
    app.stop();
  }
}