package Chapter15.Ex25_2;

import java.io.IOException;
import java.io.RandomAccessFile;

public class RandomAccessFileEx1 {
    public static void main(String[] args) {
        try{
            RandomAccessFile raf = new RandomAccessFile("test.dat", "rw");
            System.out.println(raf.getFilePointer());
            raf.writeInt(100);
            System.out.println(raf.getFilePointer());
            raf.writeLong(100L);
            System.out.println(raf.getFilePointer());
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
