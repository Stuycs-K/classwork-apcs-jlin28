public class Driver {
  public static void main(String[] args) {
    Adventurer p1 = new Mage("Mage1",100,100);
    Adventurer p2 = new Mage("Mage2",200,50);

    System.out.println("Player 1: " + p1 + ", HP: " + p1.getHP() + ", " + p2.getSpecialName() + ": " + p1.getSpecial());
    System.out.println("Player 1 has a max MP of: " + p1.getSpecialMax());
    System.out.println("Player 2: " + p2 + ", HP: " + p2.getHP() + ", " + p2.getSpecialName() + ": " + p2.getSpecial());
    System.out.println("Player 2 has a max MP of: " + p2.getSpecialMax());

    System.out.println(p1.attack(p2));
    System.out.println(p2 + " now has " + p2.getHP() + " HP!");

    System.out.println(p1.support(p2));
    System.out.println(p2 + " now has " + p2.getHP() + " HP!");

    System.out.println(p1.support());
    System.out.println(p1 + " now has a max HP of " + p1.getmaxHP() + " and " + p1.getSpecial() + " MP!");

    System.out.println(p1.specialAttack(p2));
    System.out.println(p2 + " now has " + p2.getHP() + " HP!");
    System.out.println(p1 + " now has " + p1.getSpecial() + " MP!");

    p1.setSpecial(0);
    System.out.println(p1.support());
    System.out.println(p1.specialAttack(p2));
    System.out.println(p2 + " now has " + p2.getHP() + " HP!");
    System.out.println(p1 + " now has a max HP of " + p1.getmaxHP() + " and " + p1.getSpecial() + " MP!");
  }
}
