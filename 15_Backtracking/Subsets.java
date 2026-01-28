public class Subsets {

  public static void findSubSets(String str, String ans, int i) {
    // Base case
    if (i == str.length()) {
      if (ans.length() == 0) {
        System.out.println("null");
      }
      else {
        System.out.println(ans);
      }
      return;
    }

    // Choice Yes
    findSubSets(str, ans+str.charAt(i), i+1);

    // Choice No
    findSubSets(str, ans, i+1);

    return;
  }
  public static void main(String[] args) {
    String str = "abc";
    findSubSets(str, "", 0);
  }
}
