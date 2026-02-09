import java.util.*;
class Solution {
  
      public static boolean isValid(String s) {
        Stack<Character> st = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch == '(') // 
                st.push(')');
            else if (ch == '{')
                st.push('}');
            else if (ch == '[')
                st.push(']');
            else if (st.isEmpty() || ch != st.pop())
                return false;
        }
        return st.isEmpty();
    }
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        String so=s.nextLine();
        System.out.println(isValid(so));
    }
}