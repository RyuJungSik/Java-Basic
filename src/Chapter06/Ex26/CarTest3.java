package Chapter06.Ex26;

class Car {
    String color;
    String gearType;
    int door;

    Car() {
        this("white", "auto", 4);
    }

    Car(Car c) {
        color = c.color;
        gearType = c.gearType;
        door = c.door;
    }

    Car(String color) {
        this(color, "auto", 4);
    }

    Car(String c, String g, int d) {
        color = c;
        gearType = g;
        door = d;
    }
}


public class CarTest3 {
    public static void main(String[] args) {
        Car c1 = new Car();
        Car c2 = new Car(c1);

        System.out.println(c1.color+c1.gearType+c1.door);
        System.out.println(c2.color+c2.gearType+c2.door);

        c1.door = 100;
        System.out.println(c1.color+c1.gearType+c1.door);
        System.out.println(c2.color+c2.gearType+c2.door);


    }
}
