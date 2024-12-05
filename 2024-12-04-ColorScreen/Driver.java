public class Driver {
  public static void row(int len) {
    for (int x = 0; x < len; x++) {
      int col = (int)(Math.random() * 7) + 31;
      Text.color(col, Text.background(col), (int)(Math.random() * 2) + 1);
      System.out.print(".");
    }
  }

  public static void col(int len, int space) {
    for (int x = 0; x < len; x++) {
      int col = (int)(Math.random() * 7) + 31;
      Text.color(col, Text.background(col), (int)(Math.random() * 2) + 1);
      System.out.println();
      System.out.print(".");
      Text.color(39,49);
      for (int i = 0; i < space; i++) {
        System.out.print(" ");
      }
      Text.color(col, Text.background(col), (int)(Math.random() * 2) + 1);
      System.out.print(".");
    }
  }

  public static void printAry(int[] ary, int rowlen) {
    int col = (int)(Math.random() * 7) + 31;
    Text.color(col, Text.background(col), (int)(Math.random() * 2) + 1);
    System.out.println();
    System.out.print(".");
    for (int x = 0; x < ary.length; x++) {
      Text.color(39,49);
      for (int i = 0; x == 0 && i < (rowlen - 2) / 4; i++) {
        System.out.print(" ");
      }
      if (ary[x] < 25) {
        Text.color(Text.RED, Text.BRIGHT);
      }
      else if (ary[x] > 75) {
        Text.color(Text.GREEN, Text.BRIGHT);
      }
      System.out.print(ary[x]);
      for (int i = 0;i < (rowlen - 2) / 4; i++) {
        System.out.print(" ");
      }
    }
    Text.color(col, Text.background(col), (int)(Math.random() * 2) + 1);
    System.out.print(".");
  }

  public static void printBorder(int len) {
    int col = (int)(Math.random() * 7) + 31;
    Text.color(col, Text.background(col), (int)(Math.random() * 2) + 1);
    System.out.println();
    System.out.print(".");
    for (int x = 0; x < len; x++) {
      Text.color((int)(Math.random() * 7) + 31);
      System.out.print("-");
    }
    Text.color(col, Text.background(col), (int)(Math.random() * 2) + 1);
    System.out.print(".");
  }

  public static void print(int count, String val) {
    for (int x = 0; x < count; x++) {
      System.out.print(val);
    }
  }

  public static void main(String[] args) {
    int[] ary = new int[]{(int)(Math.random()*100),(int)(Math.random()*100),(int)(Math.random()*100)};
    System.out.print(Text.CLEAR_SCREEN);
    Text.go(0,0);
    row(80);
    Text.go(1,0);
    printAry(ary, 76);
    Text.go(2,0);
    printBorder(78);
    Text.go(3,0);
    col(7,78);
    for (int i = 11; i < 14; i++) {
      Text.go(i,0);
      int col = (int)(Math.random() * 7) + 31;
      Text.color(col, Text.background(col), (int)(Math.random() * 2) + 1);
      System.out.print(".");
      Text.color(39,49);
      print(16, " ");
      Text.color(Text.WHITE,Text.background(Text.WHITE));
      print(15, "*");
      Text.color(39,49);
      print(16, " ");
      Text.color(Text.WHITE,Text.background(Text.WHITE));
      print(15 , "*");
      Text.color(39,49);
      print(16, " ");
      Text.color(col, Text.background(col), (int)(Math.random() * 2) + 1);
      System.out.print(".");
    }
    for (int i = 14; i < 17; i++) {
      Text.go(i,0);
      int col = (int)(Math.random() * 7) + 31;
      Text.color(col, Text.background(col), (int)(Math.random() * 2) + 1);
      System.out.print(".");
      Text.color(39,49);
      print(16, " ");
      Text.color(Text.WHITE,Text.background(Text.WHITE));
      print(10, "*");
      Text.color(Text.BLACK,Text.background(Text.BLACK));
      print(5, "*");
      Text.color(39,49);
      print(16, " ");
      Text.color(Text.WHITE,Text.background(Text.WHITE));
      print(10, "*");
      Text.color(Text.BLACK,Text.background(Text.BLACK));
      print(5, "*");
      Text.color(39,49);
      print(16, " ");
      Text.color(col, Text.background(col), (int)(Math.random() * 2) + 1);
      System.out.print(".");
    }
    Text.go(16,0);
    col(2,78);
    Text.go(19,0);
    int col = (int)(Math.random() * 7) + 31;
    Text.color(col, Text.background(col), (int)(Math.random() * 2) + 1);
    System.out.print(".");
    Text.color(39,49);
    print(14, " ");
    Text.color(Text.BLACK,Text.background(Text.BLACK));
    print (50, "*");
    Text.color(39,49);
    print(14, " ");
    Text.color(col, Text.background(col), (int)(Math.random() * 2) + 1);
    System.out.print(".");
    Text.go(20,0);
    col(10,78);
    Text.go(30,0);
    row(79);
    Text.go(31,0);
  }
}
