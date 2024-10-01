//1. Write both your names + emails at the top of the document as a comment.

// Nicolas Marchese - nicolasm73@nycstudents.net
// Joyce Lin - joycel78@nycstudents.net

public class ArrayMethods{

  //2. Copy your arrToString method from before.
  /**Return a String that represets the array in the format:
    * "[2, 3, 4, 9]"
    * Note the comma+space between values, and between values
    */
  public static String arrToString (int[] nums){
    String str = "[";
    for (int i = 0; i < nums.length; i++){
      if (i < nums.length - 1){
        str += nums[i] + ", ";
      }
      else
      str += nums[i];
    }
    str += "]";
    return str;
  }

  //3. Write arrToString, with a 2D array parameter.
  //Note: Different parameters are allowed with the same function name.
  /**Return a String that represets the 2D array in the format:
    * "[[2, 3, 4], [5, 6, 7], [2, 4, 9]]"
    * Note the comma+space between values, and between arrays
    * You are encouraged to notice that you may want to re-use
    * previous code, but you should NOT duplicate that code. (Don't copy/paste or retype it)
    */
  public static String arrToString (int[][]ary){
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

  /*Return the sum of all of the values in the 2D array */
  public static int arr2DSum(int[][]nums){
    //use a nested loop to solve this
    int sum = 0;
    for (int x = 0; x < nums.length; x++) {
      for (int i = 0; i < nums[x].length; i++) {
        sum += nums[x][i];
      }
    }
    return sum;
  }

  /**Rotate an array by returning a new array with the rows and columns swapped.
    * You may assume the array is rectangular and neither rows nor cols is 0.
    * e.g. swapRC({{1,2,3},{4,5,6}}) returns {{1,4},{2,5},{3,6}}
    */
  public static int[][] swapRC(int[][]nums){
    int[][] arr = new int[nums[0].length][nums.length];
    for (int i = 0; i < nums[0].length; i++){
      for (int j = 0; j < nums.length; j++){
        arr[i][j] = nums[j][i];
      }
    }
    return arr;
  }

  //3. Modify a given 2D array of integer as follows:
   //Replace all the negative values:
   //-When the row number is the same as the column number replace
   //that negative with the value 1
   //-All other negatives replace with 0
   public static void replaceNegative(int[][] vals){
     for (int row = 0; row < vals.length; row++) {
       for (int col = 0; col < vals[x].length; col++) {
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
     return null;//placeholder so it compiles
   }
   
  public static void main(String[] args){
        // Test Cases for arrToString
    int[][] a = {{},{}};
    for (int i = 0; i < a.length; i++) {
      if (i < a.length - 1) {
        System.out.print(arrToString(a[i]) + " + ");
      }
      else {
        System.out.print(arrToString(a[i]) + " = ");
      }
    }
    System.out.println(arrToString(a));
    a = new int[][]{{},{2},{}};
    for (int i = 0; i < a.length; i++) {
      if (i < a.length - 1) {
        System.out.print(arrToString(a[i]) + " + ");
      }
      else {
        System.out.print(arrToString(a[i]) + " = ");
      }
    }
    System.out.println(arrToString(a));
    a = new int[][]{{3, 45, 5},{2},{}};
    for (int i = 0; i < a.length; i++) {
      if (i < a.length - 1) {
        System.out.print(arrToString(a[i]) + " + ");
      }
      else {
        System.out.print(arrToString(a[i]) + " = ");
      }
    }
    System.out.println(arrToString(a));
    a = new int[][]{{},{2},{234,235,235,235}};
    for (int i = 0; i < a.length; i++) {
      if (i < a.length - 1) {
        System.out.print(arrToString(a[i]) + " + ");
      }
      else {
        System.out.print(arrToString(a[i]) + " = ");
      }
    }
    System.out.println(arrToString(a));

        // Test Cases for arr2DSum
    System.out.println(" ");
    a = new int[][]{{},{2},{234,235,235,235}};
    System.out.println(arrToString(a) + " = " + arr2DSum(a));
    a = new int[][]{{},{2},{}};
    System.out.println(arrToString(a) + " = " + arr2DSum(a));
    a = new int[][]{{},{},{}};
    System.out.println(arrToString(a) + " = " + arr2DSum(a));
    a = new int[][]{{1},{1},{1}};
    System.out.println(arrToString(a) + " = " + arr2DSum(a));

        // Test Cases for swapRC
    System.out.println(" ");
    a = new int[][]{{1,1,1,1},{2,2,2,2},{234,235,235,235}};
    System.out.println(arrToString(a) + " = " + arrToString(swapRC(a)));
    a = new int[][]{{342422, 523, 2325}, {1, 1, 1}};
    System.out.println(arrToString(a) + " = " + arrToString(swapRC(a)));
    a = new int[][]{{23, 24, 4}};
    System.out.println(arrToString(a) + " = " + arrToString(swapRC(a)));
    a = new int[][]{{1},{1},{1}};
    System.out.println(arrToString(a) + " = " + arrToString(swapRC(a)));
  }

}
