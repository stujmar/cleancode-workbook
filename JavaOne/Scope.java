package JavaOne;

public class Scope {
  static int globalAge = 10;
  public static void main(String[] args) {
    int inputtedNum = 5;
    if (inputtedNum < 100) {
      int favoriteNumber = 5;
      System.out.println("Your favorite number is " + favoriteNumber);
      favoriteNumber = 10;
      System.out.println("Your favorite number is " + favoriteNumber);
      // In scope (accessible) for favoriteNumber
    } else {
      System.out.println("out of scope");
      // Not in scope (not accessible) for favoriteNumber
    }
    // Not in scope (not accessible) for favoriteNumber
    System.out.println("out of scope and out of if/else");
    System.out.println(globalAge);
  }

}
