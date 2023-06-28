package Chapter15.Ex28;

import java.io.File;
import java.io.IOException;

public class FileEx1 {
    public static void main(String[] args) throws IOException {
        File f = new File("./src/Chapter15/Ex25/FileEx1.java");

        String fileName = f.getName();
        int pos = fileName.lastIndexOf(".");

        System.out.println("f.getName = " + f.getName());
        System.out.println("fileName.substring(0,pos) = " + fileName.substring(0, pos));
        System.out.println("fileName.substring(pos+1) = " + fileName.substring(pos+1));

        System.out.println("f.getPath() = " + f.getPath());
        System.out.println("f.getAbsolutePath() = " + f.getAbsolutePath());
        System.out.println("f.getCanonicalPath() = " + f.getCanonicalPath());
        System.out.println("f.getParent() = " + f.getParent());
        System.out.println();
        System.out.println("File.pathSeparator = " + File.pathSeparator);
        System.out.println("File.pathSeparatorChar = " + File.pathSeparatorChar);
        System.out.println("System.getProperty(\"user.dir\") = " + System.getProperty("user.dir"));
        System.out.println("System.getProperty(\"sun.boot.class.path\") = " + System.getProperty("sun.boot.class.path"));
    }
}
