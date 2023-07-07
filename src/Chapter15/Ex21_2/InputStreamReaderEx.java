package Chapter15.Ex21_2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class InputStreamReaderEx {
    public static void main(String[] args) {
        String line = "";

        try {
            InputStreamReader isr = new InputStreamReader(System.in);
            BufferedReader br = new BufferedReader(isr);

            System.out.println(isr.getEncoding());

            do {
                System.out.print("q");
                line = br.readLine();
                System.out.println(line);
            } while (!line.equalsIgnoreCase("q"));

            System.out.println("finish");
        } catch (IOException e) {
        }
    }
}
