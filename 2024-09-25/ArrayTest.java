public class ArrayTest{
public static void main(String[]args){
  //1 initialize the array
  int[] anArray = new int[11];

  //2 print the array variable
  System.out.println("part 2: " + anArray);

  //Part 3 Write the loop to initialize it
  for (int x = 0; x < anArray.length; x++) {
    anArray[x] = 100 + (10 * x);
  }

  //Part 4 anArray[0], anArray[5],anArray[10] to see if it worked
  System.out.println("part 4: " +
                    anArray[0] + ", " +
                    anArray[5] + ", " +
                    anArray[10]);

  //Part 5 Write a loop to print the whole array (on one line)
  System.out.print("part 4: ");
  for (int x = 0; x < anArray.length; x++) {
    System.out.print(anArray[x] + " ");
  }
}
}
