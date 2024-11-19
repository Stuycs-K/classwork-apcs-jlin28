import java.util.*;
import java.io.*;

public class Day2 {
  public static ArrayList<String> parse(String filename) {
    ArrayList<String> lines = new ArrayList<String>();
    try {
      Scanner input = new Scanner(new File(filename));
      while (input.hasNextLine()) {
        lines.add(input.nextLine());
      }
      input.close();
    } catch(FileNotFoundException e) {
      System.out.println(e);
    }
    return lines;
  }

  public static int solve(ArrayList<String> lines) {
    String[][] keys = new String { {1, 2, 3}, {4, 5, 6}, {7, 8, 9} };
    String pass = "";
    int posx, posy;
    for (int x = 0; x < lines.size; x++) {
      String line = lines.get(x);
      for (int i = 0; i < line.length(); i++) {
        if ()
      }
    }
  }

  public static void main(String[] args) {
    System.out.println(parse("input2.txt"));
  }
}
