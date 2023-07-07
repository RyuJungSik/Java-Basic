package Chapter15.Ex35_2;

import java.io.File;

public class FileEx8 {
    static int deleteFiles = 0;
    public static void main(String[] args) {
        String currDir = System.getProperty("user.dir");

        File dir = new File(currDir);
        String ext = "." + args[0];

        delete(dir, ext);
        System.out.println(deleteFiles);
    }

    private static void delete(File dir, String ext) {
        File[] files = dir.listFiles();

        for (int i = 0; i < files.length; i++) {
            if (files[i].isDirectory()) {
                delete(files[i], ext);
            }else{
                String filename = files[i].getAbsolutePath();

                if (filename.endsWith(ext)) {
                    System.out.print(filename);
                    if (files[i].delete()) {
                        System.out.println("--delete complete");
                        deleteFiles++;
                    }else {
                        System.out.println("---delete fail");
                    }
                }
            }
        }
    }
}
