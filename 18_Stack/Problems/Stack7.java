// Duplicate Parenthesis - O(n)

import java.util.*;

public class Stack7 {

  public static boolean hasDupicate(String s) {
    Stack<Character> stack = new Stack<>();

    for (int i=0; i<s.length(); i++) {
      char ch = s.charAt(i);

      // Closing parenthesis
      if (ch == ')') {
        int count = 0;
        while (!stack.isEmpty() && stack.peek() != '(') {
          stack.pop();
          count++;
        }

        // Pop opening parenthesis
        if (!stack.isEmpty()) {
          stack.pop();
        }

        // Check duplicate
        if (count <= 1) {
          return true;
        }
      }
      
      else {
        stack.push(ch);
      }
    }

    return false;
  }
  
  public static void main(String[] args) {
    String s = "((a+b)+c)";
    System.out.println(hasDupicate(s));
  }
}
