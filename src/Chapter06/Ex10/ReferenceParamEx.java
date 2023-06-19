package Chapter06.Ex10;

class Data{
    int x;
}

public class ReferenceParamEx {
    public static void main(String[] args) {
        Data d = new Data();
        d.x = 10;
        System.out.println("d.x = " + d.x);

        change(d);
        System.out.println("after d.x = " + d.x);
    }

    static void change(Data d) {
        d.x = 1000;
        System.out.println("change() : x = " + d.x);
    }
}
