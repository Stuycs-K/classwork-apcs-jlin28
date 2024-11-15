import java.util.ArrayList;

public class ArrayListPractice {

  public static ArrayList<String>createRandomArray(int size) {
    ArrayList<String> randomList = new ArrayList<String>(size);
    for (int i = 0; i < size; i++) {
      int num = (int)(Math.random()*11);
      if (num == 0) {
        randomList.add("");
      } else {
        randomList.add("" + num);
      }
    }
    return randomList;
  }

  public static void replaceEmpty( ArrayList<String> original){
    //Modify the ArrayList such that it has all of the empty strings are
    //replaced with the word "Empty".
    for (int i = 0; i < original.size(); i++) {
      if (original.get(i).equals("")) {
        original.set(i, "Empty");
      }
    }
  }

  public static ArrayList<String> makeReversedList( ArrayList<String> original){
    //return a new ArrayList that is in the reversed order of the original.
    ArrayList<String> newList = new ArrayList<String>(original.size());
    for (int i = 1; i <= original.size(); i++) {
      newList.add(original.get(original.size()- i));
    }
    return newList;
  }

  public static ArrayList<String> mixLists( ArrayList<String> a,  ArrayList<String> b){
  //return a new ArrayList that has all values of a and b in alternating order that is:
  //a[0], b[0], a[1], b[1]...
  //If one list is longer than the other, just attach the remaining values to the end.
    ArrayList<String> newList = new ArrayList<String>(a.size() + b.size());
    for (int i = 0; i < a.size() || i < b.size(); i++) {
      if (i < a.size()) {
        newList.add(a.get(i));
      }
      if (i < b.size()) {
        newList.add(b.get(i));
      }
    }
    return newList;
  }

  public static void main(String[] args) {
    ArrayList<String> arylist = createRandomArray(2);
    System.out.println("Original: " + arylist);

    replaceEmpty(arylist);
    System.out.println("\nAfter replaceEmpty: " + arylist);

    ArrayList<String> reverse = makeReversedList(arylist);
    System.out.println("\nAfter makeReversedList: " + reverse);

    ArrayList<String> secondary = createRandomArray(4);
    replaceEmpty(secondary);
    System.out.println("\n2nd Array to be mixed: " + secondary);
    ArrayList<String> mixed = mixLists(arylist, secondary);
    System.out.println("After mixLists: " + mixed);
  }
}
