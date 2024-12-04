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

  public static void sleep(int milli){
      try{
              Thread.sleep(milli);
      }catch(Exception e){
      }
  }

  public static void main(String[] args) {
    color(36, 49, 1);
    System.out.println("     ______________                 ______________     ");
    System.out.println("    /              \\               /              \\  ");
    System.out.println("   |                |             |                |");
    System.out.println("   |      \u001b[32;42m[][]\u001b[36;49m      |-------------|      \u001b[32;42m[][]\u001b[36;49m      |");
    System.out.println("   |                |             |                |");
    System.out.println("    \\              /               \\              /  ");
    System.out.println("     --------------                 --------------     ");
    System.out.println();
    color(37, 49, 1);
    System.out.println("               \u001b[47m-------------\u001b[93;103m---\u001b[37;47m---------\u001b[49m");
    System.out.println("                 \u001b[31;41m---------------------\u001b[49m");
    System.out.println("                   \u001b[31;41m-----------------\u001b[49m");
    System.out.println("                     \u001b[31;41m-----\u001b[91;101m---\u001b[31;41m-----\u001b[49m");
    System.out.print("\u001b[H");
    color(31, 49, 1);
    sleep(1000);
    System.out.println("         \u001b[41m.... \u001b[49m      \u001b[41m.....\u001b[49m");
    System.out.println("       \u001b[41m....................\u001b[49m");
    System.out.println("       \u001b[41m....................\u001b[49m");
    System.out.println("         \u001b[41m................\u001b[49m");
    System.out.println("           \u001b[41m............\u001b[49m");
    System.out.println("             \u001b[41m........\u001b[49m");
    System.out.println("               \u001b[41m....\u001b[49m");

    // resetting terminal to defaults
    System.out.print("\u001b[0m");
    sleep(2500);
    System.out.print("\u001b[2J");
  }
}
