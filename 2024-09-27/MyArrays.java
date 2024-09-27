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

  public static int[] concatArray(int[] ary1, int[] ary2) {
    int[] concat = new int[ary1.length + ary2.length];
    int index = 0;
    for (int x = 0; x < (ary1.length + ary2.length); x++) {
      if (x < ary1.length && ary1.length > 0) {
        concat[x] = ary1[x];
      }
      else {
        concat[x] = ary2[index];
        index++;
      }
    }
    return concat;
  }

  public static void main (String[] args) {
    // Test cases for returnCopy
    int[] a = {};
    boolean compare = aryToString(returnCopy(a)).equals(aryToString(a));
    System.out.println("Is " + aryToString(returnCopy(a)) + " the same as " + aryToString(a) + ": " + compare);
    System.out.println("  Does it have the same address: " + (aryToString(returnCopy(a)) == aryToString(a)));
    a = new int[]{4,4,4,4,4};
    compare = aryToString(returnCopy(a)).equals(aryToString(a));
    System.out.println("Is " + aryToString(returnCopy(a)) + " the same as " + aryToString(a) + ": " + compare);
    System.out.println("  Does it have the same address: " + (aryToString(returnCopy(a)) == aryToString(a)));
    a = new int[]{100000000, 284, 2779};
    compare = aryToString(returnCopy(a)).equals(aryToString(a));
    System.out.println("Is " + aryToString(returnCopy(a)) + " the same as " + aryToString(a) + ": " + compare);
    System.out.println("  Does it have the same address: " + (aryToString(returnCopy(a)) == aryToString(a)));

    // Test cases for concatArray
    int[] b = {};
    int[] c = {};
    System.out.println(aryToString(b) + " + " + aryToString(c) + " = " + aryToString(concatArray(b, c)));
    b = new int[]{2,124,523};
    c = new int[]{};
    System.out.println(aryToString(b) + " + " + aryToString(c) + " = " + aryToString(concatArray(b, c)));
    b = new int[]{};
    c = new int[]{2,124,53};
    System.out.println(aryToString(b) + " + " + aryToString(c) + " = " + aryToString(concatArray(b, c)));
    b = new int[]{1};
    c = new int[]{2,124,53};
    System.out.println(aryToString(b) + " + " + aryToString(c) + " = " + aryToString(concatArray(b, c)));
    b = new int[]{53,123,2};
    c = new int[]{2,124};
    System.out.println(aryToString(b) + " + " + aryToString(c) + " = " + aryToString(concatArray(b, c)));
  }
}
