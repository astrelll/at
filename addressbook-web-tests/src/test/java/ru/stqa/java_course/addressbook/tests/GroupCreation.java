package ru.stqa.java_course.addressbook.tests;

import org.testng.Assert;
import org.testng.annotations.*;
import ru.stqa.java_course.addressbook.appmanager.GroupHelper;
import ru.stqa.java_course.addressbook.model.GroupData;

import java.util.Comparator;
import java.util.HashSet;
import java.util.List;

public class GroupCreation extends TestBase {

  @Test
  public void testGroupsCreation() throws Exception {
    app.getNavigationHelper().gotoGroupPage();

    List<GroupData> before = app.getGroupHelper().getGroupList();

    GroupData group = new GroupData("test87", null, null);
    app.getGroupHelper().createGroup(group);

    List<GroupData> after = app.getGroupHelper().getGroupList();
    Assert.assertEquals(after.size(), before.size() + 1);
    before.add(group);

    Comparator<? super GroupData> byId = (g1, g2) -> Integer.compare(g1.getId(), g2.getId());
    before.sort(byId);
    after.sort(byId);
    Assert.assertEquals(before, after);
  }
}