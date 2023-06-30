package Chapter11.Ex10;

import java.util.EmptyStackException;
import java.util.Stack;

public class ExpValidCheck {
    public static void main(String[] args) {
        if (args.length != 1) {
            System.exit(0);
        }

        Stack st = new Stack();
        String expression = args[0];
        System.out.println("expression:" + expression);

        try {

            for (int i = 0; i < expression.length(); i++) {
                char ch = expression.charAt(i);
                if (ch == '(') {
                    st.push(ch + "");
                }else {
                    st.pop();
                }
            }

        } catch (EmptyStackException e) {
            System.out.println("괄호가 일치하기 않습니다.");
        }

    }
}
