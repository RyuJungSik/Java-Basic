package Chapter07.Ex30;

public class DefaultMethodTest {
    public static void main(String[] args) {
        Child c = new Child();
        c.method1();
        c.method2();

        MyInterface.staticMethod();
        MyInterface2.staticMethod();

    }
}

class Child extends Parent implements MyInterface, MyInterface2 {
    public void method1() {
        System.out.println("method1 in Child");
    }
}

class Parent{
    public void method2(){
        System.out.println("method2 in parent");
    }
}

interface MyInterface {
    default void method1() {
        System.out.println("method() in MyInterface");
    }

    default void method2() {
        System.out.println("method2() in myinterface");
    }

    static void staticMethod(){
        System.out.println("staticmethod in myinterface");
    }
}

interface MyInterface2{
    default void method1(){
        System.out.println("method1 is myinterface2");
    }

    static void staticMethod() {
        System.out.println("static method in myinterface");
    }
}