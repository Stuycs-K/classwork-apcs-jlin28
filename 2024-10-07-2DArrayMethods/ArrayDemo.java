import java.util.Arrays;
public class ArrayDemo{
  public static void main(String[]args){
    //write your tests here!
    //You can now use Arrays.toString(yourArray) instead of writing arrayToString again.
    //Compare Arrays.toString(yourArray) to YOUR arrayToString() method to make sure yours is correct
    //do not use any other Arrays.method()

    // Test Cases arrToString (non-2D)
    int [] a = new int[]{3254, 235, 235};
    System.out.println("Is " + Arrays.toString(a) + " equal to " + arrToString(a) + ": " + Arrays.toString(a).equals(arrToString(a)));
    a = new int[]{3, 432, 5322};
    System.out.println("Is " + Arrays.toString(a) + " equal to " + arrToString(a) + ": " + Arrays.toString(a).equals(arrToString(a)));

    // Test Cases arrToString (2D)
    System.out.println(" ");
    int[][] b = new int[][]{{2131,413}, {2345}, {23455,235,0}};
    String c = "[";
    for (int x = 0; x < b.length; x++) {
      if (x != b.length - 1) {
        c += Arrays.toString(b[x]) + ", ";
      }
      else {
        c += Arrays.toString(b[x]) + "]";
      }
    }
    System.out.println("Is " + c + " equal to " + arrToString(b) + ": " + c.equals(arrToString(b)));
    b = new int[][] {{324}, {235}, {3}, {235}};
    c = "[";
    for (int x = 0; x < b.length; x++) {
      if (x != b.length - 1) {
        c += Arrays.toString(b[x]) + ", ";
      }
      else {
        c += Arrays.toString(b[x]) + "]";
      }
    }
    System.out.println("Is " + c + " equal to " + arrToString(b) + ": " + c.equals(arrToString(b)));

    // Test Cases countZeros2D
    System.out.println(" ");
    b = new int[][] {{0,0,0}, {0}};
    int expected = 4;
    System.out.println("Is " + expected + " equal to " + countZeros2D(b) + ": " + (expected == countZeros2D(b)));
    b = new int[][] {{0}, {0}, {21}};
    expected = 2;
    System.out.println("Is " + expected + " equal to " + countZeros2D(b) + ": " + (expected == countZeros2D(b)));

    // Test Cases arr2DSum
    System.out.println(" ");
    b = new int[][]{{2},{20},{0}};
    expected = 22;
    System.out.println("Is " + expected + " equal to " + arr2DSum(b) + ": " + (expected == arr2DSum(b)));
    b = new int[][]{{2},{22, 34},{2, 528, 582}};
    expected = 1170;
    System.out.println("Is " + expected + " equal to " + arr2DSum(b) + ": " + (expected == arr2DSum(b)));
    b = new int[][]{{2}};
    expected = 2;
    System.out.println("Is " + expected + " equal to " + arr2DSum(b) + ": " + (expected == arr2DSum(b)));

    // Test Cases replaceNegative
    System.out.println(" ");
    b = new int[][]{{-1,-1}, {-1, -1, -1}};
    int[][] d = copy(b);
    replaceNegative(d);
    String expected2 = arrToString(new int[][]{{1,0}, {0,1,0}});
    System.out.println(arrToString(b) + " = " + arrToString(d) + ", are negatives changed: " + arrToString(d).equals(expected2));
    b = new int[][]{{-1}, {-1}};
    d = copy(b);
    replaceNegative(d);
    expected2 = arrToString(new int[][]{{1}, {0}});
    System.out.println(arrToString(b) + " = " + arrToString(d) + ", are negatives changed: " + arrToString(d).equals(expected2));
    b = new int[][]{{0}, {-1, 0}};
    d = copy(b);
    replaceNegative(d);
    expected2 = arrToString(new int[][]{{0}, {0, 0}});
    System.out.println(arrToString(b) + " = " + arrToString(d) + ", are negatives changed: " + arrToString(d).equals(expected2));
  }

  //0. Include your prior methods to help you print a 1D/2D array of ints.
  public static String arrToString(int[]ary){
    String str = "[";
    for (int i = 0; i < ary.length; i++){
      if (i < ary.length - 1){
        str += ary[i] + ", ";
      }
      else
      str += ary[i];
    }
    str += "]";
    return str;
  }

  //The name of different methods can be the same,
  //as long as the parameters are different! (type and/or quantity must be different)
  //Pro tip: you should be using your 1D arrToString in this method!
  public static String arrToString(int[][]ary){
    String str = "[";
    for (int i = 0; i < ary.length; i++){
      if (i < ary.length - 1){
        str += arrToString(ary[i]) + ", ";
      }
      else {
        str += arrToString(ary[i]);
      }
    }
    return str + "]";
  }

  //1. Calculate and return how many elements equal zero in the 2D array.
  public static int countZeros2D(int[][] nums){
    int count = 0;
    for (int row = 0; row < nums.length; row++) {
      for (int col = 0; col < nums[row].length; col++) {
        if (nums[row][col] == 0) {
          count++;
        }
      }
    }
    return count;
  }

  //2. Calculate the sum of a 2d array
  /*Return the sum of all of the values in the 2D array
   *Use a nested loop instead of a helper method*/
  public static int arr2DSum(int[][]nums){
    int sum = 0;
    for (int x = 0; x < nums.length; x++) {
      for (int i = 0; i < nums[x].length; i++) {
        sum += nums[x][i];
      }
    }
    return sum;
  }

  //3. Modify a given 2D array of integer as follows:
  //Replace all the negative values:
  //-When the row number is the same as the column number replace
  //that negative with the value 1
  //-All other negatives replace with 0
  public static void replaceNegative(int[][] vals){
    for (int row = 0; row < vals.length; row++) {
      for (int col = 0; col < vals[row].length; col++) {
        if (row == col && vals[row][col] < 0) {
          vals[row][col] = 1;
        }
        else if (vals[row][col] < 0) {
          vals[row][col] = 0;
        }
      }
    }
  }

  //4. Make a copy of the given 2d array.
  //When testing : make sure that changing the original does NOT change the copy.
  //DO NOT use any built in methods that "copy" an array.
  //You SHOULD write a helper method for this.
  //If you don't see a good way to do that, you should stop and look at prior methods.
  public static int[][] copy(int[][] nums){
    int[][] copy = new int[nums.length][];
    for (int x = 0; x < nums.length; x++) {
      copy[x] = copyHelper(nums[x]);
    }
    return copy;
  }

  public static int[] copyHelper(int[] nums) {
    int[] copy = new int[nums.length];
    for (int x = 0; x < nums.length; x++) {
      copy[x] = nums[x];
    }
    return copy;
  }

  //5. Rotate an array by returning a new array with the rows and columns swapped.
  //   You may assume the array is rectangular and neither rows nor cols is 0.
  //   e.g. swapRC({{1,2,3},{4,5,6}}) returns {{1,4},{2,5},{3,6}}
  public static int[][] swapRC(int[][]nums){
    int[][] arr = new int[nums[0].length][nums.length];
    for (int i = 0; i < nums[0].length; i++){
      for (int j = 0; j < nums.length; j++){
        arr[i][j] = nums[j][i];
      }
    }
    return arr;
  }

  //6. Make an HTML table by putting a table tag around the entire 2d array,
  //   tr tags around each row, and td tags around each value.
  //   You may use a helper method
  //   Note there is no whitespace in the string, it all one line with no spaces/tabs.
  //   e.g. htmlTable(new int[][]{{1,2},{3}})  returns:
  // "<table><tr><td>1</td><td>2</td></tr><tr><td>3</td></tr></table>"
  public static String htmlTable(int[][]nums){
    String table = "<table>";
    for (int row = 0; row < nums.length; row++) {
      if (row == 0) {
        table += "<tr>";
      }
      for (int col = 0; col < nums[row].length; col++) {
        table += "<td>" + nums[row][col] + "</td>";
      }
      if (row == nums.length - 1) {
        table += "</tr>";
      }
    }
    return table + "</table>";
  }
}
