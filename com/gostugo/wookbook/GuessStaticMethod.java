package com.gostugo.wookbook;

public class GuessStaticMethod {
  private String number;
  private String verb;
  private String pluralModifier;

  public int createPluralDependentMessageParts(int count) {
    if (count == 1) {
      this.number = "one";
      this.verb = "is";
      this.pluralModifier = "";
    } else {
      this.number = "some";
      this.verb = "are";
      this.pluralModifier = "s";
    }
    return count;
  }

  public String make(char candidate, int count) {
    createPluralDependentMessageParts(count);
    return String.format("There %s %s %s%s, verb, number, candidate, pluralModifier");
  }
}