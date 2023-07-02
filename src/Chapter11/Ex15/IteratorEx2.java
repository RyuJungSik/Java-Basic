package Chapter11.Ex15;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorEx2 {
    public static void main(String[] args) {
        ArrayList origianl = new ArrayList(10);
        ArrayList copy1 = new ArrayList(10);
        ArrayList copy2= new ArrayList(10);

        for (int i = 0; i < 10; i++) {
            origianl.add(i + "");
        }

        Iterator it = origianl.iterator();
        while (it.hasNext()) {
            copy1.add(it.next());
        }

        System.out.println("---------");
        System.out.println(origianl);
        System.out.println(copy1);

        it = origianl.iterator();
        while (it.hasNext()) {
            copy2.add(it.next());
            it.remove();
        }

        System.out.println("----------");
        System.out.println(origianl);
        System.out.println(copy2);

    }
}
