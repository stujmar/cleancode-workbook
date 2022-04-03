package com.gostugo.wookbook.entities;

public class PageData {
  public String title = "";

  public WikiPage getWikiPage() {
    return new WikiPage();
  }

  public boolean hasAttribute(String attribute) {
    return false;
  }

}
