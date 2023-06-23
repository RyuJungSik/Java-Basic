package Chapter07.Ex19;

public class BindingTest2 {
    public static void main(String[] args) {
        Parent p = new Child();
        Parent c = new Child();

        System.out.println("p.x = " + p.x);
        p.method();

        System.out.println("c.x = " + c.x);
        c.method();
    }
}

class Parent{
    int x = 100;

    void method() {
        System.out.println("Parent Mehtod");
    }
}

class Child extends Parent { }
