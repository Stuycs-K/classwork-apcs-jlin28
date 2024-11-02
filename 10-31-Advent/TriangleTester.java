import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class TriangleTester {
  public static boolean isTriangle (int one, int two, int three) {
    return (one + two > three && two + three > one && one + three > two);
  }

  public static int countTrianglesA(String filename) {
    int count = 0;
    try {
      File file = new File(filename);
      Scanner input = new Scanner(file);
      int[] nums = new int[3];
      int x = 0;
      while (input.hasNextInt() || x == 3) {
        if (x == 3) {
          if (isTriangle(nums[0], nums[1], nums[2])) {
            count++;
          }
          x = 0;
        }
        else {
          nums[x] = input.nextInt();
          x++;
        }
      }
      input.close();
    }catch (FileNotFoundException ex) {
      System.out.println("File not found");
    }
    return count;
  }

  public static void main(String[] args) {
    System.out.println(countTrianglesA("inputA.txt"));
  }
}
