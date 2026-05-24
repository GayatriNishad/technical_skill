/*given a string a consisting only of ("and")you need to find weater
 parentheses in a are balanced or not if t is balanced then return 1 else return 0
 input formate -first argument is an string a
 output -return 1 if parentheses string are balanced else return 0
 what is the approach of this question using the stack
"algorithm"
1.if we have a opening bracket ( push nto the stack.
2.whene closing bracket apper) pop into the stack.
3.if stack become empty when try to pop ==not belenced.
4.after processing the hole string if stack becoming empty that means it is balanced*/
import java.util.Stack;
public class stack {
    public static void main(String[] args) {
        String a = "((()))";
        Stack<Character> s = new Stack<>();
        for (int i = 0; i < a.length(); i++) {
            char ch = a.charAt(i);
            if (ch == '(') {
                s.push(ch);
            } else if (ch == ')') {
                if (s.isEmpty()) {
                    System.out.println(0);
                    return;
                }
                s.pop();
            }
        }
        if (s.isEmpty()) {
            System.out.println(1);
        } else {
            System.out.println(0);
        }
    }
}
