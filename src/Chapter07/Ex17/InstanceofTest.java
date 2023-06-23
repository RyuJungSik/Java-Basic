package Chapter07.Ex17;

public class InstanceofTest {
    public static void main(String[] args) {

        FireEngine fe = new FireEngine();

        if (fe instanceof FireEngine) {
            System.out.println("this is a fireengine instance");
        }

        if (fe instanceof Car) {
            System.out.println("this is a Car instance");
        }

        if (fe instanceof Object) {
            System.out.println("this is an object instance");
        }

        System.out.println(fe.getClass().getName());

    }
}

class Car{}
class FireEngine extends Car {}
