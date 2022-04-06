package com.gostugo.wookbook;
import java.lang.String;
import java.util.Dictionary;
import java.util.HashMap;

import com.gostugo.wookbook.entities.*;

public class HtmlUtil {

  // Before
  SuiteResponder suiteResponder = new SuiteResponder();

  public static String testableHtml( PageData pageData, boolean includeSuiteSetup) throws Exception {

    WikiPage wikiPage = pageData.getWikiPage();
    StringBuffer buffer = new StringBuffer();
    if (pageData.hasAttribute("Test")) {
    if (includeSuiteSetup) {
    WikiPage suiteSetup =
    PageCrawlerImpl.getInheritedPage(
    suiteResponder.getSuiteSetupName(), wikiPage
    );
      if (suiteSetup != null) {
      WikiPagePath pagePath =
      suiteSetup.getPageCrawler().getFullPath(suiteSetup);
      String pagePathName = PathParser.render(pagePath);
      buffer.append("!include -setup .")
      .append(pagePathName)
      .append("\n");
    }
  }
  WikiPage setup =
  PageCrawlerImpl.getInheritedPage("SetUp", wikiPage);
  if (setup != null) {
  WikiPagePath setupPath =
  wikiPage.getPageCrawler().getFullPath(setup);
  String setupPathName = PathParser.render(setupPath);
  buffer.append("!include -setup .")
  .append(setupPathName)
  .append("\n");
  }
  }
  buffer.append(pageData.getContent());
  if (pageData.hasAttribute("Test")) {
  WikiPage teardown =
  PageCrawlerImpl.getInheritedPage("TearDown", wikiPage);
  if (teardown != null) {
  WikiPagePath tearDownPath =
  wikiPage.getPageCrawler().getFullPath(teardown);
  String tearDownPathName = PathParser.render(tearDownPath);
  buffer.append("\n")
  .append("!include -teardown .")
  .append(tearDownPathName)
  .append("\n");
  }

  // After

  public static String renderPageWithSetupsAndTeardowns( PageData pageData, boolean isSuite) throws Exception {
    boolean isTestPage = pageData.hasAttribute("Test");
    if (isTestPage) {
      WikiPage testPage = pageData.getWikiPage();
      StringBuffer newPageContent = new StringBuffer();
      includeSetupPages(testPage, newPageContent, isSuite);
      newPageContent.append(pageData.getContent());
      includeTeardownPages(testPage, newPageContent, isSuite);
      pageData.setContent(newPageContent.toString());
    }
    return pageData.getHtml();
  }
}
