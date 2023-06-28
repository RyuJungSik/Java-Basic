package Chapter15.Ex18;

import java.io.IOException;
import java.io.PipedReader;
import java.io.PipedWriter;

public class OutputThread extends Thread{

    PipedWriter output = new PipedWriter();
    public OutputThread(String name) {
        super(name);
    }

    public void run(){
        try{
            String msg = "Hello";
            System.out.println(getName() + " sent   :  " + msg);
            output.write(msg);
            output.close();
        }catch (IOException e){}
    }

    public PipedWriter getOutput(){
        return output;
    }

    public void connect(PipedReader input) {
        try {
            output.connect(input);
        } catch (IOException e) {

        }
    }

}
