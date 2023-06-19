package Chapter06.Ex07;

public class CallStackTest {
    public static void main(String[] args) {
        firstMehtod();
    }

    static void firstMehtod() {
        secondMehtod();
    }
    
    static void secondMehtod() {
        System.out.println("secondMethod");

    }
}
