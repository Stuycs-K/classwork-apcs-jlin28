import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class Day1 {
  public static int tester (String filename) {
    int dir = 0;
    int blocksS = 0;
    int blocksN = 0;
    try {
      File file = new File(filename);
      Scanner input = new Scanner(file);
      while (input.hasNext()) {
        String block = input.next();
        int num;
        if (input.hasNext()) {
          num = Integer.parseInt(block.substring(1,block.length() - 1));
        }
        else {
          num = Integer.parseInt(block.substring(1, block.length()));
        }
        if (block.charAt(0) == 'R') {
          dir += 90;
          if (Math.abs(dir) == 360) {
            dir = 0;
          }
        }
        else {
          dir -= 90;
          if (Math.abs(dir) == 360) {
            dir = 0;
          }
        }
        if (dir == 90 || dir == -270) {
          blocksS += num;
        }
        else if (dir == 0) {
          blocksN += num;
        }
        else if (Math.abs(dir) == 180) {
          blocksN -= num;
        }
        else {
          blocksS -= num;
        }
      }
      input.close();
    } catch (FileNotFoundException e){
      System.out.println(e);
    }
    return Math.abs(blocksS) + Math.abs(blocksN);
  }

  public static void main (String[] args) {
    System.out.println(tester("input1.txt"));
  }
}
