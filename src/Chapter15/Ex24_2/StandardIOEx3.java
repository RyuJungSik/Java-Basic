package Chapter15.Ex24_2;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;

public class StandardIOEx3 {
    public static void main(String[] args) {
        PrintStream ps = null;
        FileOutputStream fos = null;

        try{

            fos = new FileOutputStream("test.txt");
            ps = new PrintStream(fos);
            System.setOut(ps);


        }catch (FileNotFoundException e) {
        }

        System.out.println("out");
        System.err.println("err");

    }
}
