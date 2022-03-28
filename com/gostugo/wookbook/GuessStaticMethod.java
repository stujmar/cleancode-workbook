package com.gostugo.wookbook;

public class GuessStaticMethod() {
  private String number;
  private String verb;
  private String pluralModifier;

  public String make(char candidate, int count) {
    createPluralDependentMessageParts(count);
    return String.format("There %s %s %s%s, verb, number, candidate, pluralModifier")
  }
}