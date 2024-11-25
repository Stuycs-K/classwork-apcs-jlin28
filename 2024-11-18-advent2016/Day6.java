import java.util.*;
import java.io.*;

public class Day6 {
  public static ArrayList<ArrayList<String>> parse(String filename) {
    ArrayList<ArrayList<String>> lines = new ArrayList<ArrayList<String>>();
    for (int i = 0; i < 8; i++) {
      lines.add(new ArrayList<String>());
    }
    try {
      Scanner input = new Scanner(new File(filename));
      int x = 0;
      int i = 0;
      while (input.hasNextLine()) {
        String input2 = input.nextLine();
        while (i < input2.length()) {
          if (x < 7) {
            lines.get(x).add(input2.substring(i, i+1));
            x++;
          }
          else {
            lines.get(x).add(input2.substring(i, i+1));
            x = 0;
          }
          i++;
        }
        i = 0;
      }
      input.close();
    } catch(FileNotFoundException e) {
      System.out.println(e);
    }
    return lines;
  }

  public static String common(ArrayList<String> a) {
    String most = "";
    int counts = 0;
    String curr = a.get(0);
    int currcount = 0;
    while (a.size() > 0) {
      while(a.indexOf(curr) > -1 && a.size() > 0) {
        currcount++;
        a.remove(curr);
      }
      if (currcount > counts) {
        most = curr;
        counts = currcount;
      }
      if (a.size() > 0) {
        curr = a.get(0);
        currcount = 0;
      }
    }
    return most;
  }

  public static String solve(ArrayList<ArrayList<String>> b) {
    String code = "";
    for (int x = 0; x < b.size(); x++) {
      code = code + common(b.get(x));
    }
    return code;
  }

  public static void main (String[] args) {
    System.out.println(solve(parse("input6.txt")));
  }
}
