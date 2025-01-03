public class makeWords {
  public static void makeWords (int remainingLetters, String result, String alphabet){
    for (int x = 0; x < alphabet.length() && remainingLetters > -1; x++) {
      if (remainingLetters == 0) {
        System.out.println(result);
        remainingLetters--;
      }
      else {
        makeWords(remainingLetters - 1, result + alphabet.substring(x, x+1), alphabet);
      }
    }
  }

  public static void main (String[] args) {
    makeWords(Integer.parseInt(args[0]), "", args[1]);
  }
}
