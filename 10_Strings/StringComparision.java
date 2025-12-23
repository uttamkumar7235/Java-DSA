public class StringComparision {
    public static void main(String[] args) {
        String s1 = "Tony";
        String s2 = "Tony";
        String s3 = new String("Tony");

        // == Operator (Reference Comparison)
        if (s1 == s2){
            System.out.println("Strings s1 and s2 are equal.");
        }
        else {
            System.out.println("Strings s1 and s2 are not equal.");
        }

        if (s1 == s3){
            System.out.println("Strings s1 and s3are equal.");
        }
        else {
            System.out.println("Strings s1 and s3 are not equal.");
        }


        // equals() Method (Content Comparison)
        if (s1.equals(s3)) {
            System.out.println("Strings s1 and s3 are equal.");
        }
        else {
            System.out.println("Strings s1 and s3 are not equal.");
        }


        // compareTo() Method (Lexicographical Comparison)
        String str1 = "apple";
        String str2 = "banana";
        String str3 = "apple";

        System.out.println(str1.compareTo(str2)); // negative
        System.out.println(str2.compareTo(str1)); // positive
        System.out.println(str1.compareTo(str3)); // 0
    }
}
