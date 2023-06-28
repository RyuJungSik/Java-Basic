package _20230624;

import java.io.*;
import java.nio.charset.StandardCharsets;

public class Main {
    public static void main(String[] args) throws IOException {
        OutputStream os = System.out;
        InputStream in = getInputStream();
        byte[] buffer = new byte[2];

        int len = in.read(buffer);
        os.write(buffer,0,len);
        len = in.read(buffer);
        os.write(buffer,0,len);
    }

    static InputStream getInputStream() throws FileNotFoundException {
//        String s = "hello World";
//        byte[] bytes = s.getBytes(StandardCharsets.UTF_8);
//        return new ByteArrayInputStream(bytes);

        return new FileInputStream("test2.txt");
    }
}
