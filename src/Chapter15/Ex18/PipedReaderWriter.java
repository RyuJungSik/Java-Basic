package Chapter15.Ex18;

import java.io.InputStream;
import java.io.OutputStream;

public class PipedReaderWriter {
    public static void main(String[] args) {
        InputThread inThread = new InputThread("InputThread");
        OutputThread outThread = new OutputThread("OutputThread");

        inThread.connect(outThread.getOutput());

        inThread.start();
        outThread.start();
    }
}
