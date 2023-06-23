package Chapter07.Ex14;


final class Singleton{
    private static Singleton s = new Singleton();
    private Singleton() {

    }

    public static Singleton getInstance() {
        if (s == null) {
            s = new Singleton();
        }
        return s;
    }

}

public class SingletonTest {
//    Singleton s = new Singleton();
    Singleton s = Singleton.getInstance();


}
