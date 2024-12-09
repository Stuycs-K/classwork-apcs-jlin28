public class Driver {
  public static void main(String[] args) {
    Adventurer p1 = new Mage("Mage1",100,100);
    Adventurer p2 = new Mage("Mage2",200,50);

    System.out.println("Player 1: " + p1 + ", HP: " + p1.getHP() + ", MP: " + p1.getSpecial());
    System.out.println("Player 2: " + p2 + ", HP: " + p2.getHP() + ", MP: " + p2.getSpecial());
  }
}
