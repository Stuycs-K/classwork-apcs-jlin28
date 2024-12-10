public class Mage extends Adventurer {
  private int maxMP;
  private int mp;

  public Mage (String name) {
    this(name, 10, 10);
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
    if (n >= 0 && n < maxMP) {
      this.mp = n;
    }
    else {
      throw new IllegalArgumentException("MP cannot be negative or above max MP of" + maxMP);
    }
  }

  public int getSpecialMax() {
    return maxMP;
  }

  public String attack(Adventurer other) {
    if (other.getHP() - 2 > 0) {
      other.applyDamage(2);
    }
    else {
      other.setHP(0);
    }
    return getName() + " has dealt 2 damage to " + other.getName() + " with Basic Attack!";
  }

  public String support(Adventurer other) {
    if (other.getHP() + 10 < other.getmaxHP()) {
      other.setHP(other.getHP() + 10);
    }
    else {
      other.setHP(other.getmaxHP());
    }
    return other.getName() + " was healed for 10 HP!";
  }

  public String support() {
    if (getSpecial() - 2 > 0) {
      setSpecial(getSpecial() - 2);
    }
    else {
      return "Insufficient MP!";
    }
    setmaxHP(getmaxHP() + 2);
    setHP(getHP() + 2);
    return getName() + "\'s total health has increased by 2 points!";
  }

  public String specialAttack(Adventurer other) {
    if (getSpecial() - 4 > 0) {
      setSpecial(getSpecial() - 4);
    }
    else {
      return "Insufficient MP! Basic Attack has been used instead: " + attack(other);
    }
    if (other.getHP() - 4 > 0) {
      other.applyDamage(4);
    }
    else {
      other.setHP(0);
    }
    return getName() + " has dealt 4 damage to " + other.getName() + " with Fireball!";
  }

}
