package com.gostugo.wookbook;

abstract class Dog {
  String breed;

  public void bark() {
    System.out.println("Woof!");
  }
}

public class AbstractTutorial {
  public static void main(String[] args) {
    Dog dog = new Dog() {
      @Override
      public void bark() {
        System.out.println("Ruff!");
      }
    };
    dog.bark();
  }

}