public class Permutation {

  public static void findPermutation(String str, String ans) {
    // Base case
    if (str.length()==0) {
      System.out.println(ans);
      return;
    }

    // Recursion 
    for (int i=0; i<str.length(); i++) {
      char curr = str.charAt(i);

      // delete character at i from str
      String newStr = str.substring(0, i) + str.substring(i+1);

      // Backtrack
      findPermutation(newStr, ans+curr);
    }
  }
  public static void main(String[] args) {
    String str = "abc";
    findPermutation(str, "");
  }
}
