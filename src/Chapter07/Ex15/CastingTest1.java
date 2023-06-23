package Chapter07.Ex15;

public class CastingTest1 {
    public static void main(String[] args) {
        Car car = new Car();
        FireEngine fe = new FireEngine();
        FireEngine fe2 = null;

        fe.water();
        car = fe;
        fe2 = (FireEngine) car;
        fe2.water();
    }
}

class Car{
    String color;
    int door;

    void drive() {
        System.out.println("drive brr");
    }

    void stop() {
        System.out.println("stop");
    }
}

class FireEngine extends Car{
    void water() {
        System.out.println("water");
    }
}
