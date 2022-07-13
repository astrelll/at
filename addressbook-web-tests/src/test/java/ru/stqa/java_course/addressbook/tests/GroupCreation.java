package ru.stqa.java_course.addressbook.tests;

import org.testng.Assert;
import org.testng.annotations.*;
import ru.stqa.java_course.addressbook.appmanager.GroupHelper;
import ru.stqa.java_course.addressbook.model.GroupData;
import java.util.List;

public class GroupCreation extends TestBase {

  @Test
  public void testGroupsCreation() throws Exception {
    app.getNavigationHelper().gotoGroupPage();

    List<GroupData> before = app.getGroupHelper().getGroupList();
    app.getGroupHelper().createGroup(new GroupData("test8088", null, null));
    List<GroupData> after = app.getGroupHelper().getGroupList();
    Assert.assertEquals(after.size(), before.size() + 1);
  }
}