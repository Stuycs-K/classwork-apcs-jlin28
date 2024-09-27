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
    int[] concat = new int[ary1.length + ary2.length];
    int index = 0;
    for (int x = 0; x < (ary1.length + ary2.length) - 2; x++) {
      if (x >= ary1.length) {
        concat[x] = ary2[index];
        index++;
      }
      else {
        concat[x] = ary1[x];
      }
    }
  }

  public static void main (String[] args) {

  }
}
