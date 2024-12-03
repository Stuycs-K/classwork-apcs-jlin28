public class ColorDemo {
  public static final String clear =  "\u001b[2J";
  public static final String hide =  "\u001b[?25l";
  public static final String show =  "\u001b[?25h";

  public static void go(int x,int y){
    System.out.print("\u001b[" + y + ";" + x + "f");
  }

  public static void color(int fg, int bg, int modifier) {
    System.out.println("\u001b[" + fg + ";" + bg + ";" + modifier + "m");
  }

  public static void main(String[] args) {
    go(20, 20);
    color()
    // resetting terminal to defaults
    System.out.print("\u001b[0m");
  }
}
