package ru.stqa.java_course.addressbook.tests;

import org.testng.annotations.Test;
import ru.stqa.java_course.addressbook.model.ContactData;

public class ContactCreation extends TestBase {

  @Test
  public void testContactCreation() {
    app.getNavigationHelper().gotoHomePage();
    app.getContactHelper().initContactCreation();
    app.getContactHelper().fillContactForm(new ContactData("test_name20", "test_surname20", "test888"), true);
    app.getContactHelper().submitContactCreation();

//    метод returnToGroupPage() для этого теста выдаёт ошибку
//    а для теста testGroupsCreation работает ок

//    app.getGroupHelper().returnToGroupPage();
  }
}
