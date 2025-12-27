public class RemoveDuplicates {

    public static void removeDuplicates(String str, int ind, StringBuilder newStr, boolean map[]) {
        // Base case
        if(ind == str.length()) {
            System.out.println(newStr);
            return;
        }

        // work
        char currChar = str.charAt(ind);
        
        if(map[currChar - 'a'] == true) {
            // Duplicates
            removeDuplicates(str, ind+1, newStr, map);
        }
        // Not duplicates
        else {
            map[currChar - 'a'] = true;
            removeDuplicates(str, ind+1, newStr.append(currChar), map);
        }
    }

    public static void main(String[] args) {
        String str = "apnacollege";
        removeDuplicates(str, 0, new StringBuilder(""), new boolean[26]);
    }
}
