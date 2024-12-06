public class Mage extends Adventurer {
  private int maxMP;
  private int mp;

  public Mage (String name) {
    super(name);
  }

  public Mage (String name, int hp, int mp) {
    super(name, hp);
    this.mp = mp;
    this.maxMP = mp;
  }

  public String getSpecialName() {
    return "mp";
  }

  public int getSpecial() {
    return mp;
  }

  public void setSpecial(int n) {
    if (n > 0 && n < maxMP) {
      this.mp = n;
    }
    else {
      throw new IllegalArgumentException("MP cannot be negative or above max MP of" + maxMP);
    }
  }

  public int getSpecialMax() {
    return maxMP;
  }
}
