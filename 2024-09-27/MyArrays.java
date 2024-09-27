public class MyArrays {
  public static String aryToString (int[] nums) {
    String end = "[";
    for (int x = 0; x < nums.length; x++) {
      if (x == nums.length - 1) {
        end += nums[x];
      }
      else {
        end += nums[x] + ", ";
      }
    }
    return end + "]";
  }

  public static int[] returnCopy(int[] ary) {
    int[] copy = new int[ary.length];
    for (int x = 0; x < ary.length; x++) {
      copy[x] = ary[x];
    }
    return copy;
  }

  public static   int[] concatArray(int[] ary1, int[] ary2) {

  }

  public static void main (String[] args) {

  }
}
