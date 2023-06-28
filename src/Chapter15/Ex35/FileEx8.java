package Chapter15.Ex35;

import java.io.File;

public class FileEx8 {
    static int deleteFiles = 0;
    public static void main(String[] args) {

        if (args.length != 1) {
            System.out.println("java fileEx8 Extension");
        }

        String currDir = System.getProperty("user.dir");

        File dir = new File(currDir);
        String ext = "." + args[0];

        delete(dir, ext);

    }

    private static void delete(File dir, String ext) {
        File[] files = dir.listFiles();

        for (int i = 0; i < files.length; i++) {
            if (files[i].isDirectory()) {
                delete(files[i], ext);
            }else{
                String filename = files[i].getAbsolutePath();

                if(filename.endsWith(ext)){
                    System.out.printf(filename);
                    if (files[i].delete()) {
                        System.out.println("-- good delete");
                        deleteFiles++;
                    }else{
                        System.out.println("bad delete");
                    }
                }
            }
        }

    }
}
