package Chapter06.Ex22;

public class VarArgsEx {
    public static void main(String[] args) {
        String[] strArr = {"100", "200", "300"};
        System.out.println(concatenate("","100","200","300"));
        System.out.println(concatenate("-",strArr));
        System.out.println(concatenate(",",new String[0])+"end");
        System.out.println(concatenate(",")+"end");

    }

    static String concatenate(String delim, String... args) {
        String result = "";

        for (String str : args) {
            result += str + delim;
        }
        return result;
    }

}
