package Chapter15.Ex01_2;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.util.Arrays;

public class IOEx1 {
    public static void main(String[] args) {
        byte[] inSrc = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        byte[] outSrc = null;

        ByteArrayInputStream input = new ByteArrayInputStream(inSrc);
        ByteArrayOutputStream output = new ByteArrayOutputStream();

        int data = 0;

        while ((data = input.read()) != -1) {
            System.out.println("data = " + data);
            output.write(data);
        }

        outSrc = output.toByteArray();

        System.out.println("Arrays.toString(inSrc) = " + Arrays.toString(inSrc));
        System.out.println("Arrays.toString(outSrc) = " + Arrays.toString(outSrc));

    }
}
