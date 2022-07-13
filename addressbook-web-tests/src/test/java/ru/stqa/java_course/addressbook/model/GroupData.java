package ru.stqa.java_course.addressbook.model;
public class GroupData {

  private final String name;
  private final String header;
  private final String footer;

  public GroupData(String name, String header, String footer) {
    this.name = name;
    this.header = header;
    this.footer = footer;
  }

  //@Override
  public String getName() {
    return name;
  }

  //@Override
  public String getHeader() {
    return header;
  }

  //@Override
  public String getFooter() {
    return footer;
  }
}