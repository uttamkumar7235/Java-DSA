public class UpperCase {

    public static String convertUpperCase(String str) {

        StringBuilder sb = new StringBuilder("");

        char ch = Character.toUpperCase(str.charAt(0));
        sb.append(ch);

        for (int i = 1; i < str.length(); i++) {
            if (str.charAt(i) == ' ' && i < str.length()-1) { // condition to reach white space
                sb.append(str.charAt(i)); // apppending the white space
                i++; // reaching to the character which has to be capitalized
                sb.append(Character.toUpperCase(str.charAt(i))); // appending capitalized character
            }
            else {
                sb.append(str.charAt(i));
            }
        }
        return sb.toString();
    }

    public static void main(String[] args) {

        String str = "hi, i'm uttam kumar.";
        System.out.println("String Length = " + str.length());
        System.out.println(convertUpperCase(str));
    }
}
