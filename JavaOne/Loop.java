package JavaOne;
import java.util.Scanner;

public class Loop {
  static boolean isCurrentSongOnRepeat = true;
  static int count = 10;
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("How many times would you like to hear this song?");
    count = input.nextInt();
    input.close();
    while (isCurrentSongOnRepeat) {
      System.out.println("I'm in a loop! " + count);
      count--;
      if (count == 0) {
        isCurrentSongOnRepeat = false;
      }
    }
  System.out.println("I'm out of the loop!");
  }
}


