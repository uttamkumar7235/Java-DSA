public class Palindrome {

    public static boolean checkPalindrome(String name) {

        int n = name.length();
        for (int i = 0; i < n/2; i++) {
            if (name.charAt(i) != name.charAt(n-1-i)) {
                return false;
            }
        }
        return true;
    }

    public static void main (String args[]) {
        
        String name = "madam";
        
        if (checkPalindrome(name)) {
            System.out.println(name + " is a palindrome word.");
        }
        else {
            System.out.println(name + " is not a palindrome word.");
        }
    }

}
