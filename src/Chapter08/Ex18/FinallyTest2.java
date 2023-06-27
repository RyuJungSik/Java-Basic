package Chapter08.Ex18;

public class FinallyTest2 {
    public static void main(String[] args) {
        try {
            startInsatll();
            copyFiles();
        } catch (Exception e) {
            e.printStackTrace();
        }finally {
            deleteTempFiles();
        }

    }

    static void startInsatll(){}
    static void copyFiles(){}
    static void deleteTempFiles(){}
}
