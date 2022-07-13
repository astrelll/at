package ru.stqa.java_course.addressbook.tests;

import org.testng.Assert;
import org.testng.annotations.*;
import ru.stqa.java_course.addressbook.model.GroupData;

public class GroupCreation extends TestBase {

  @Test
  public void testGroupsCreation() throws Exception {
    app.getNavigationHelper().gotoGroupPage();
    int before = app.getGroupHelper().getGroupCount();
    app.getGroupHelper().createGroup(new GroupData("test8088", null, null));
    int after = app.getGroupHelper().getGroupCount();
    Assert.assertEquals(after, before + 1);
  }
}