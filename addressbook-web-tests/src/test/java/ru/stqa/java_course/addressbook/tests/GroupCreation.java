package ru.stqa.java_course.addressbook.tests;

import org.testng.annotations.*;
import ru.stqa.java_course.addressbook.model.GroupData;

public class GroupCreation extends TestBase {
  @Test
  public void testGroupsCreation() throws Exception {
    //hi hi
    app.getNavigationHelper().gotoGroupPage();
    app.getGroupHelper().createGroup(new GroupData("test8088", null, null));
  }
}