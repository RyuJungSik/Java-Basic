package Chapter15.Ex15;

import java.util.Date;

public class PrintStreamEx1 {
    public static void main(String[] args) {
        int i = 65;
        float f = 1234.56789f;

        Date d = new Date();

        System.out.printf("%c %d%n", i, i);
        System.out.printf("%d %o %x%n",i, i, i);
        System.out.printf("%3d %3d %3d \n",100, 90, 80);
        System.out.println();
        System.out.printf("%s-%5s %5s %n","123","123","123");
        System.out.printf("%tY %tm %td %n", d, d, d);
    }
}
