// String Compression (Asked in Amazon)

public class StringCompression {

    public static String compress (String str) {

        StringBuilder sb = new StringBuilder("");

        for (int i = 0; i < str.length(); i++) {
            Integer count = 1; // Integer class so that it can be converted to String
            while (i < str.length()-1 && str.charAt(i) == str.charAt(i+1)) {
                count++;
                i++;
            }
            
            sb.append(str.charAt(i));
            if(count > 1) {
                sb.append(count.toString());
            }
        }
        return sb.toString();
    }

    public static void main(String[] args) {

        String str = "aaabccdddddee";
        System.out.println(compress(str));
    }
}
