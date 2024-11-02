import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.ArrayList;

public class TriangleTester {
  public static boolean isTriangle (int one, int two, int three) {
    return (one + two > three && two + three > one && one + three > two);
  }

  public static int countTrianglesA(String filename) {
    int count = 0;
    try {
      File file = new File(filename);
      Scanner input = new Scanner(file);
      while (input.hasNextLine()) {
        String line = input.nextLine();
        String[] nums = new String[] {"", "", ""};
        for (int x = 0, i = 0; x < line.length(); x++) {
          if (line.substring(x, x+1).equals(" ")) {
            i++;
          }
          else {
            nums[i] += line.substring(x,x+1);
          }
        }
        if (isTriangle(Integer.parseInt(nums[0]), Integer.parseInt(nums[1]), Integer.parseInt(nums[2]))) {
          count++;
        }
      }
      input.close();
    }catch (FileNotFoundException ex) {
      System.out.println("File not found");
    }
    return count;
  }
  
  public static void main(String[] args) {
    System.out.println(countTrianglesA("inputTri.txt"));
  }
}
