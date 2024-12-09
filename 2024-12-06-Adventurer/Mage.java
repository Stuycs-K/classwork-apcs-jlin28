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

  public String attack(Adventurer other) {
    if (other.getHP() - 10 > 0) {
      other.applyDamage(10);
    }
    else {
      other.setHP(0);
    }
    return "10 damage dealt with Basic Attack!";
  }

  public String support(Adventurer other) {
    if (other.getHP() + 10 < other.getmaxHP()) {
      other.setHP(other.getHP() + 10);
    }
    else {
      other.setHP(other.getmaxHP());
    }
    return other.getName() + "was healed for 10 HP!";
  }

  public String support() {
    setmaxHP(getmaxHP() + 5);
    setHP(getHP() + 5);
    if (getMP() - 10 > 0) {
      setMP(getMP() - 10);
    }
    else {
      return "Insufficient MP!";
    }
    return "Your total health has increased by 5 points!";
  }

  public String specialAttack(Adventurer other) {
    if (other.getHP() - 30 > 0) {
      other.applyDamage(30);
    }
    else {
      other.setHP(0);
    }
    if (getMP() - 20 > 0) {
      setMP(getMP() - 20);
    }
    else {
      return "Insufficient MP!";
    }
    return "30 damage dealt with Fireball!";
  }

  public int getMP(){
      return mp;
  }

  public int getmaxMP(){
      return maxMP;
  }

  public void setMP(int mp){
      this.mp = mp;
  }
}
