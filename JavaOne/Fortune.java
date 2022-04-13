package JavaOne;
import java.util.Scanner;

public class Fortune {
  
  public static void main(String[] args) {
    System.out.println("Hello World! I like tacos.");
    System.out.println("Pick a number between one and ten.");
    Scanner input = new Scanner(System.in);
    int number = input.nextInt();
    while (number =< 5) {
      System.out.println("You are unlucky.");
      System.out.println("Pick a number between one and ten.");
      number = input.nextInt();
    }
    System.out.println("You are lucky.");
    input.close();
  }

}
