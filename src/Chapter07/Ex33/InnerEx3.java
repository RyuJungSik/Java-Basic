package Chapter07.Ex33;

public class InnerEx3 {
    private int outerIV = 0;
    static int outerCv = 0;

    class InstanceInner{
        int siv = outerIV;
        int siv2 = outerIV;

    }

    static class StaticInner{
        static int scv = outerCv;
    }

    void myMethod(){
        int lv = 0;
        final int LV = 0;
        class LocalInner{
            int liv = outerIV;
            int liv2 = outerCv;

            int liv4 = LV;
        }
    }
}
