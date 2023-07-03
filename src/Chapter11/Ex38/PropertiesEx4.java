package Chapter11.Ex38;

import java.util.Properties;

public class PropertiesEx4 {
    public static void main(String[] args) {
        Properties sysProp = System.getProperties();
        System.out.println(sysProp.getProperty("java.version"));

        System.out.println(sysProp.getProperty("user.language"));
        sysProp.list(System.out);
    }
}
