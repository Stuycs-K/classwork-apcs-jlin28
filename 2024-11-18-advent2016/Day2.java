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

  public static int pos2(char dir) {
    if (dir == 'U') {
      return -4;
    }
    else if (dir == 'D') {
      return 4;
    }
    else if (dir == 'R') {
      return 1;
    }
    return -1;
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
          if (temp == 'D' && (lastpos == 1 || lastpos == 11)) {
            lastpos = lastpos + pos(temp) - 2;
          }
          else if (temp == 'U' && (lastpos == 13 || lastpos == 3)) {
            lastpos = lastpos + pos(temp) + 2;
          }
          else if (lastpos + pos(temp) > 0 && lastpos + pos(temp) < 10) {
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

  public static String solve2(ArrayList<String> lines) {
    String[] keys = {"1", "2", "3", "4", "5", "6", "7", "8", "9", "A", "B", "C", "D"};
    String pass = "";
    int lastpos = 5;
    for (int x = 0; x < lines.size(); x++) {
      for (int i = 0; i < lines.get(x).length(); i++) {
        char temp = lines.get(x).charAt(i);
        if (temp == 'U' || temp == 'D') {
          if (lastpos != 5 && lastpos != 9) {
            if (lastpos + pos2(temp) > 0 && lastpos + pos2(temp) < 14) {
              if (lastpos != 1 && lastpos != 13) {
                lastpos = lastpos + pos2(temp);
              }
              else {
                lastpos = lastpos + pos2(temp)/2;
              }
            }
            else if (lastpos == 3 || lastpos == 11) {
              lastpos = lastpos + pos2(temp)/2;
            }
          }
        }
        else if (lastpos != 1 && lastpos != 2 && lastpos != 5 && lastpos != 10 && lastpos != 13 && temp == 'L') {
          lastpos = lastpos + pos2(temp);
        }
        else if (lastpos != 1 && lastpos != 4 && lastpos != 9 && lastpos != 12 && lastpos != 13 && temp == 'R') {
          lastpos = lastpos + pos2(temp);
        }
      }
      pass = pass + keys[lastpos-1];
    }
    return pass;
  }

  public static void main(String[] args) {
    System.out.println(solve(parse("input2.txt")));
    System.out.println(solve2(parse("input2.txt")));
  }

}
