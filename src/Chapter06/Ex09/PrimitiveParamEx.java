package Chapter06.Ex09;

class Data {
    int x;
}

public class PrimitiveParamEx {
    public static void main(String[] args) {
        Data d = new Data();
        d.x = 10;
        System.out.println("d.x = " + d.x);

        change(d.x);
        System.out.println("after d.x = " + d.x);
    }

    static void change(int x) {
        x = 10000;
        System.out.println("change() : x = " + x);

    }
}
