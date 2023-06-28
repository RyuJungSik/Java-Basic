package Chapter15.Ex24;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;

public class StandardIOEx3 {
    public static void main(String[] args) {
        PrintStream ps = null;
        FileOutputStream fos = null;

        try{
            fos = new FileOutputStream("test4.txt");
            ps = new PrintStream(fos);

            System.setOut(ps);
        }catch(FileNotFoundException e){
            System.err.println("file not found");
        }

        System.out.println("hello hoiho");
        System.err.println("err hello hoiho");
    }
}
