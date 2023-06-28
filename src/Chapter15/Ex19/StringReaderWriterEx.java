package Chapter15.Ex19;

import java.io.IOException;
import java.io.StringReader;
import java.io.StringWriter;

public class StringReaderWriterEx {
    public static void main(String[] args) {
        String inputData = "ABCD";
        StringReader input = new StringReader(inputData);
        StringWriter output = new StringWriter();

        int data = 0;

        try{
            while ((data = input.read()) != -1) {
                output.write(data);
            }
        }catch (IOException e){}

        System.out.println("inputData = " + inputData);
        System.out.println("output.toString() = " + output.toString());
        System.out.println("output.getBuffer().toString() = " + output.getBuffer().toString());

    }
}
