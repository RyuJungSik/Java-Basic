package Chapter15.Ex05;

import java.io.FileInputStream;
import java.io.IOException;

public class FileViewer {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream(args[0]);
        int data;

        while ((data = fis.read()) != -1) {
            char c = (char) data;
            System.out.println(c);
        }
    }
}
