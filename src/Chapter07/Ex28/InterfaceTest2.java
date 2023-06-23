package Chapter07.Ex28;

class A {
    void autoplay(I i) {
        i.play();
    }
}

interface I{
    public abstract void play();
}

class B implements I{
    public void play() {
        System.out.println("play in B class");
    }
}

class C implements I {
    public void play() {
        System.out.println("paly in C class");

    }
}

public class InterfaceTest2 {
    public static void main(String[] args) {
        A a = new A();
        a.autoplay(new B());
        a.autoplay(new C());
    }
}
