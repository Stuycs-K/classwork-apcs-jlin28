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
    Adventurer p1 = new Mage(userName);
    Adventurer p2 = new CodeWarrior();
    System.out.println();
    System.out.println("New character created: " + p1 + ", " + p1.getHP() + "/" + p1.getmaxHP() + " HP, " + p1.getSpecial() + "/" + p1.getSpecialMax() + " MP");
    System.out.println("An opponent CodeWarrior has appeared!");
    System.out.println("Type: (a)ttack / (sp)ecial / (su)pport / quit");
    String action = userInput.nextLine();
    String[] actions = {"a", "sp", "su"};
    boolean nobodyDead = true;
    boolean invalidInput = false;
    while (!(action.equals("quit")) && nobodyDead) {
      invalidInput = false;
      System.out.println();
      if (action.equals("a")) {
        System.out.println(p1.attack(p2));
        if (p2.getHP() <= 0) {
          nobodyDead = false;
        }
      }
      else if (action.equals("sp")) {
        System.out.println(p1.specialAttack(p2));
        if (p2.getHP() <= 0) {
          nobodyDead = false;
        }
      }
      else if (action.equals("su")) {
        System.out.println(p1.support());
      }
      else {
        System.out.println("Invalid action input!");
        invalidInput = true;
      }
      if (nobodyDead && !(invalidInput)) {
         int move = (int)(Math.random() * 3);
        if (actions[move].equals("a")) {
          System.out.println(p2.attack(p1));
          if (p1.getHP() <= 0) {
            nobodyDead = false;
          }
        }
        else if (actions[move].equals("sp")) {
          System.out.println(p2.specialAttack(p1));
          if (p1.getHP() <= 0) {
            nobodyDead = false;
          }
        }
        else {
          System.out.println(p2.support());
        }
      }
      if (nobodyDead) {
        System.out.println(p1 + "\'s current state: " + p1.getHP() + "/" + p1.getmaxHP() + " HP, " + p1.getSpecial() + "/" + p1.getSpecialMax() + " MP");
        System.out.println(p2 + "\'s current state: " + p2.getHP() + "/" + p2.getmaxHP() + " HP, " + p2.getSpecial() + "/" + p2.getSpecialMax() + " MP");
        action = userInput.nextLine();
      }
      else {
        if (p1.getHP() <= 0) {
          System.out.println(p2 + " has won!");
        }
        else {
          System.out.println(p1 + " has won!");
        }
      }
    }
  }
}
