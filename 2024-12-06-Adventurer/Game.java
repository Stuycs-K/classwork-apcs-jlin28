import java.util.Scanner;

public class Game {
  public static void main(String[] args) {
    //do this once
    Scanner userInput = new Scanner(System.in);

    //You can do the rest many times:

    System.out.println("Enter username");
    //Read one line of user input
    String userName = userInput.nextLine();
    //Do something with the input
    Adventurer p1 = new Mage(userName, 100, 100);
    Adventurer p2 = new CodeWarrior();
    System.out.println("New character created: " + p1 + ", " + p1.getHP() + "/" + p1.getmaxHP() + " HP, " + p1.getSpecial() + "/" + p1.getSpecialMax() + " MP");
    System.out.println("An opponent CodeWarrior has appeared!");
    System.out.println("Type: (a)ttack / (sp)ecial / (su)pport / quit");
    String action = userInput.nextLine();
    while (!(action.equals("quit"))) {
      if (action.equals("a")) {
        p1.attack(p2);
      }
    }
  }
}
