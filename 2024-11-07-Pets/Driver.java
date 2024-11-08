public class Driver {
  /*
  After you override this method it uses the new method that override the old one
  Bird b2 cannot be a  new Animal because Bird extends Animal
  However, animal can be a bird
  */
  public static void main(String[] args) {
    Animal a = new Animal("a", 1, "a");
    a.speak();

    // Step 9
    Animal a1 = new Animal("a1", 1, "a1");
	a1.speak();
    Bird b1 = new Bird("b1", 1, "b1", 1.1, "b1");
	b1.speak();
    // Bird b2 = new Animal("b2", 1, "b2");
    Animal a2 = new Bird("a2", 1, "a2", 1.1, "a2");
	a2.speak();
  }
}
