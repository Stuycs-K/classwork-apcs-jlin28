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

  public static int pos(char dir) {
    if (dir == 'U') {
      return -3;
    }
    else if (dir == 'D') {
      return 3;
    }
    else if (dir == 'R') {
      return 1;
    }
    return -1;
  }

  public static int solve(ArrayList<String> lines) {
    String pass = "";
    int lastpos = 5;
    for (int x = 0; x < lines.size(); x++) {
      for (int i = 0; i < lines.get(x).length(); i++) {
        char temp = lines.get(x).charAt(i);
        if (temp == 'U' || temp == 'D') {
          if (lastpos + pos(temp) > 0 && lastpos + pos(temp) < 10) {
            lastpos = lastpos + pos(temp);
          }
        }
        else if ((lastpos == 1 || lastpos == 4 || lastpos == 7) && temp == 'R') {
          lastpos = lastpos + pos(temp);
        }
        else if ((lastpos == 3 || lastpos == 6 || lastpos == 9) && temp == 'L') {
          lastpos = lastpos + pos(temp);
        }
        else if ((lastpos == 2 || lastpos == 5 || lastpos == 8)){
          lastpos = lastpos + pos(temp);
        }
      }
      pass = pass + lastpos;
    }
    return Integer.parseInt(pass);
  }

  public static void main(String[] args) {
    System.out.println(solve(parse("input2.txt")));
  }
}
