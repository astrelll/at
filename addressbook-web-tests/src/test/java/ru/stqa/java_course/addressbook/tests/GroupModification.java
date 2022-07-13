package ru.stqa.java_course.addressbook.tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import ru.stqa.java_course.addressbook.model.GroupData;

public class GroupModification extends TestBase{

  @Test
  public void testGroupModification(){
    app.getNavigationHelper().gotoGroupPage();
    int before = app.getGroupHelper().getGroupCount();
    if(! app.getGroupHelper().isThereAGroup()){
      app.getGroupHelper().createGroup(new GroupData("test009", null, null));
    }
    app.getGroupHelper().selectGroup();
    app.getGroupHelper().initGroupModification();
    app.getGroupHelper().fillGroupForm(new GroupData("new1", "1test0rt8", "1testrt06"));
    app.getGroupHelper().submitGroupModification();
    app.getGroupHelper().returnToGroupPage();
    int after = app.getGroupHelper().getGroupCount();
    Assert.assertEquals(after, before);
  }
}
