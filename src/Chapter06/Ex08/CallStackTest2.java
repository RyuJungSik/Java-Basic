package Chapter06.Ex08;

public class CallStackTest2 {
    public static void main(String[] args) {
        System.out.println("main(String[] args) 시작");
        firstMethod();
        System.out.println("main(String[] args) 끝");
    }

    static void firstMethod() {
        System.out.println("first() 시작");
        secondMethod();
        System.out.println("first() 끝");
    }

    static void secondMethod() {
        System.out.println("second() 시작");
        System.out.println("second() 끝");

    }
}
