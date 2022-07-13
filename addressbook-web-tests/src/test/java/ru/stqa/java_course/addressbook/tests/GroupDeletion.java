package ru.stqa.java_course.addressbook.tests;

import org.testng.annotations.*;
import ru.stqa.java_course.addressbook.model.GroupData;

public class GroupDeletion extends TestBase {
   @Test
  public void testGroupDeletion() throws Exception {
    app.getNavigationHelper().gotoGroupPage();
    if(! app.getGroupHelper().isThereAGroup()){
      app.getGroupHelper().createGroup(new GroupData("test009", null, null));
    }
    app.getGroupHelper().selectGroup();
    app.getGroupHelper().deleteSelectedGroups();
    app.getGroupHelper().returnToGroupPage();
  }
}