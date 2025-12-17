// Reverse a String using Stack

import java.util.*;

public class Stack2 {

    public static String reverseString(String str) {

        Stack<Character> s = new Stack<>();

        // Push characters into stack
        for (int i = 0; i < str.length(); i++) {
            s.push(str.charAt(i));
        }

        // Pop characters to build reversed string
        StringBuilder reversed = new StringBuilder();
        while (!s.isEmpty()) {
            reversed.append(s.pop());
        }

        return reversed.toString();
    }

    public static void main(String[] args) {

        String input = "Uttam";
        System.out.println("Original : " + input);
        
        String revString = reverseString(input);
        System.out.println("Reversed : " + revString);

    }
}
