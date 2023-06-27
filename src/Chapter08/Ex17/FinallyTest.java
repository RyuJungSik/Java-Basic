package Chapter08.Ex17;

public class FinallyTest {
    public static void main(String[] args) {
        try{
            startInsatll();
            copyFiles();
            deleteTempFiles();
        }
        catch (Exception e){
            e.printStackTrace();
            deleteTempFiles();

        }
    }

    static void startInsatll(){}
    static void copyFiles(){}
    static void deleteTempFiles(){}

}
