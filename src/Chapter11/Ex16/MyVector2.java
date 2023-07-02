package Chapter11.Ex16;

import java.util.Iterator;

public class MyVector2 implements Iterator {

    int cursor = 0;
    int lastRet = -1;

    public String toString() {
        String tmp = "";
        Iterator it = iterator();

        for (int i = 0; it.hasNext(); i++) {
            if (i != 0) {
                tmp += ", ";
            }
            tmp += it.next();

        }
        return "[" + tmp + "]";
    }
    @Override
    public boolean hasNext() {
        return false;
    }

    @Override
    public Object next() {
        return null;
    }

    public Iterator iterator() {
        cursor = 0;
        lastRet = -1;
        return this;
    }

    public void remove() {
        if (lastRet == -1) {
            throw new IllegalStateException();
        }else{
        }
    }

}
