package Chapter15.Ex15_2;

import java.io.FilterInputStream;
import java.util.Date;
public class PrintStreamEx1 {
    public static void main(String[] args) {
        int i = 65;
        float f = 1234.56789f;

        Date d = new Date();
        System.out.printf("%c %d %n", i, i);

    }
}
