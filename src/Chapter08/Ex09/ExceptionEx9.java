package Chapter08.Ex09;

public class ExceptionEx9 {
    public static void main(String[] args) {
        try {
            Exception e = new Exception("고의로 발생시킴");
            throw e;
            //throw new Exception("rhdml")


        } catch (Exception e) {
            System.out.println("e.getMessage() = " + e.getMessage());
            e.printStackTrace();

        }
        System.out.println("정상 종료");
    }
}
