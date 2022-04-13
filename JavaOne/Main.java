package JavaOne;

import java.util.Scanner;

public class Main {
  
  public static void main(String[] args) {
    int studentAge = 15;
    double studentGPA = 3.45;
    boolean isStudentGraduated = true;
    String studentName = "John Smith";
    String firstName = "John";
    String lastName = "Smith";
    char firstInitial = firstName.charAt(0);
    char lastInitial = lastName.charAt(0);
    String initials = firstInitial + ". " + lastInitial + ". " + "has GPA of " + studentGPA;

    System.out.println("Hello World! I like tacos.");
    System.out.println(studentAge);
    System.out.println(studentGPA);
    System.out.println(isStudentGraduated);
    System.out.println(studentName);
    System.out.println(firstInitial);
    System.out.println(lastInitial);
    System.out.println(initials);

    System.out.println("Enter your GPA: ");
    Scanner input = new Scanner(System.in);
    studentGPA = input.nextDouble();

    if (studentGPA >= 3.5) {
      System.out.println("You are eligible to graduate.");
    } else {
      System.out.println("You are not eligible to graduate.");
    }
    input.close();

  }

}
