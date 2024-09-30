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
  public static String arrToString2(int[][]ary){
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

  public static void main(String[] args){
        // Test Cases for arrToString2
    int[][] a = {{},{}};
    for (int i = 0; i < a.length; i++) {
      if (i < a.length - 1) {
        System.out.print(arrToString(a[i]) + " + ");
      }
      else {
        System.out.print(arrToString(a[i]) + " = ");
      }
    }
    System.out.println(arrToString2(a));
    a = new int[][]{{},{2},{}};
    for (int i = 0; i < a.length; i++) {
      if (i < a.length - 1) {
        System.out.print(arrToString(a[i]) + " + ");
      }
      else {
        System.out.print(arrToString(a[i]) + " = ");
      }
    }
    System.out.println(arrToString2(a));
    a = new int[][]{{3, 45, 5},{2},{}};
    for (int i = 0; i < a.length; i++) {
      if (i < a.length - 1) {
        System.out.print(arrToString(a[i]) + " + ");
      }
      else {
        System.out.print(arrToString(a[i]) + " = ");
      }
    }
    System.out.println(arrToString2(a));
    a = new int[][]{{},{2},{234,235,235,235}};
    for (int i = 0; i < a.length; i++) {
      if (i < a.length - 1) {
        System.out.print(arrToString(a[i]) + " + ");
      }
      else {
        System.out.print(arrToString(a[i]) + " = ");
      }
    }
    System.out.println(arrToString2(a));
    
        // Test Cases for arr2DSum
    System.out.println(" ");
    a = new int[][]{{},{2},{234,235,235,235}};
    System.out.println(arrToString2(a) + " = " + arr2DSum(a));
    a = new int[][]{{},{2},{}};
    System.out.println(arrToString2(a) + " = " + arr2DSum(a));
    a = new int[][]{{},{},{}};
    System.out.println(arrToString2(a) + " = " + arr2DSum(a));
    a = new int[][]{{1},{1},{1}};
    System.out.println(arrToString2(a) + " = " + arr2DSum(a));

        // Test Cases for swapRC
    System.out.println(" ");
    a = new int[][]{{1,1,1,1},{2,2,2,2},{234,235,235,235}};
    System.out.println(arrToString2(a) + " = " + arrToString2(swapRC(a)));
    a = new int[][]{{342422, 523, 2325}, {1, 1, 1}};
    System.out.println(arrToString2(a) + " = " + arrToString2(swapRC(a)));
    a = new int[][]{{23, 24, 4}};
    System.out.println(arrToString2(a) + " = " + arrToString2(swapRC(a)));
    a = new int[][]{{1},{1},{1}};
    System.out.println(arrToString2(a) + " = " + arrToString2(swapRC(a)));
  }

}
