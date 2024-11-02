import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.ArrayList;

public class TriangleTester {
  public static int countTrianglesA(String filename) {
    int count = 0;
    ArrayList<ArrayList<String>> triangles = new ArrayList<ArrayList<String>>(filename.length()/2);
    for (int x = 0; x < filename.length(); x++) {
      String number = "";
      int triangle = 0;
      if (filename.substring(x, x+1).equals(" ")) {
        triangles.get(triangle).add(number);
      }
      else if (filename.substring(x, x+1).equals("\\")) {
        triangle++;
        number = "";
        x++;
      }
      else {
        number += filename.substring(x,x+1);
      }
    }
    System.out.println(triangles);
    return 0;
  }
  public static void main(String[] args) {
    try {
      File file = new File("inputTri.txt");
      Scanner input = new Scanner(file);
      String fil = "";
      while (input.hasNextLine()) {
        fil += input.nextLine() + "\n";
      }
      input.close();
      countTrianglesA(fil);
    }catch (FileNotFoundException ex) {
      System.out.println("File not found");
      return;
    }
  }
}
