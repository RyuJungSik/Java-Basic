package Chapter15.Ex33_2;

import java.io.*;

public class FileEx6 {
    static int found = 0;

    public static void main(String[] args) {
        File dir = new File(args[0]);
        String keyword = args[1];

        try {
            findInFiles(dir, keyword);
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println();
        System.out.println(found+" "+ keyword);
    }

    private static void findInFiles(File dir, String keyword) throws IOException {
        File[] files = dir.listFiles();
        for (int i = 0; i < files.length; i++) {
            if (files[i].isDirectory()) {
                findInFiles(files[i], keyword);
            } else {
                String filename = files[i].getName();
                String extension = filename.substring(filename.lastIndexOf(".") + 1);
                extension = "," + extension + ",";

                if (",java,txt,bak".indexOf(extension) == -1) {
                    continue;
                }

                filename = dir.getAbsolutePath() + File.separator + filename;

                FileReader fr = new FileReader(files[i]);
                BufferedReader br = new BufferedReader(fr);

                String data = "";
                int lineNum = 0;

                while ((data = br.readLine()) != null) {
                    lineNum++;

                    if (data.indexOf(keyword) != -1) {
                        lineNum++;
                        found++;
                        System.out.println(filename + data);
                    }
                    br.close();
                }
            }
        }
    }
}
