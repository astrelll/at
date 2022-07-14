package ru.stqa.java_course.addressbook.tests;

import org.testng.annotations.Test;
import ru.stqa.java_course.addressbook.model.ContactData;

public class ContactCreation extends TestBase {

  @Test
  public void testContactCreation() {
    app.getNavigationHelper().gotoHomePage();
    app.getContactHelper().initContactCreation();
    app.getContactHelper().fillContactForm(new ContactData("test_name45", "test_surname40", "test_contact"), true);
    app.getContactHelper().submitContactCreation();
    app.getContactHelper().returnToHomePage();
  }
}
