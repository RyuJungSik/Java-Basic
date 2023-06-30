package Chapter11.Ex09;

import java.util.Stack;

public class StackEx1 {
    public static Stack back = new Stack();
    public static Stack forward = new Stack();

    public static void main(String[] args) {
        goURL("1. nate");
        goURL("2. google");
        goURL("3. naver");
        goURL("4. daum");


        printStatus();

        goBack();
        System.out.println("뒤로 버튼 누른후");
        printStatus();

        goBack();
        System.out.println("뒤로 버튼 누른후");
        printStatus();

        goForward();
        System.out.println("앞으로 버튼 누른후");
        printStatus();

        goForward();
        System.out.println("앞으로 버튼 누른후");
        printStatus();

    }

    public static void printStatus(){
        System.out.println("back : " + back);
        System.out.println("forward : " + forward);
        System.out.println("현재화면은 : " + back.peek());
        System.out.println();
    }

    public static void goURL(String url) {
        back.push(url);
        if (!forward.empty()) {
            forward.clear();
        }
    }

    public static void goForward(){
        if (!forward.empty()) {
            back.push(forward.pop());
        }
    }

    public static void goBack() {
        if (!back.empty()) {
            forward.push(back.pop());
        }
    }

}
