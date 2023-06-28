package Chapter15.Ex26;

import java.io.EOFException;
import java.io.IOException;
import java.io.RandomAccessFile;

public class RandomAccessFileEx2 {
    public static void main(String[] args) {
        int[] score = {1, 2, 3, 4,
                1, 2, 3, 4,
                1, 2, 3, 4,
                1, 2, 3, 4,
                1, 2, 3, 4};
        try {
            RandomAccessFile raf = new RandomAccessFile("score2.dat", "rw");
            for (int i = 0; i < score.length; i++) {
                raf.writeInt(score[i]);
            }
            while (true) {
                System.out.println(raf.readInt());
            }

        } catch (EOFException eof) {

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
