package com.gostugo.wookbook;

public class SuiteResponder {
  
  private String SUITE_SETUP_NAME;

  // contructor
  public SuiteResponder(String name) {
    this.SUITE_SETUP_NAME = name;
  }
  


  public String getSuiteSetupName() {
    return SUITE_SETUP_NAME;
  }
}
