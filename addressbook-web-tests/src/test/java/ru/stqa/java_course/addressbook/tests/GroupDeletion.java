package ru.stqa.java_course.addressbook.tests;

import org.testng.Assert;
import org.testng.annotations.*;
import ru.stqa.java_course.addressbook.appmanager.GroupHelper;
import ru.stqa.java_course.addressbook.model.GroupData;

import java.util.List;

public class GroupDeletion extends TestBase {
  @Test
  public void testGroupDeletion() throws Exception {
    app.getNavigationHelper().gotoGroupPage();
    if (!app.getGroupHelper().isThereAGroup()) {
      app.getGroupHelper().createGroup(new GroupData("test009", null, null));
    }
    List<GroupData> before = app.getGroupHelper().getGroupList();
    app.getGroupHelper().selectGroup(before.size() - 1);
    app.getGroupHelper().deleteSelectedGroups();
    app.getGroupHelper().returnToGroupPage();
    List<GroupData> after = app.getGroupHelper().getGroupList();
    Assert.assertEquals(after.size(), before.size() - 1);
  }
}