package Chapter11.Ex32;

import java.util.*;

public class HashMapEx3 {
    static HashMap phoneBook = new HashMap();
    public static void main(String[] args) {
        addPhoneNo("f","lee","123");
        addPhoneNo("f","lee2","1232");
        addPhoneNo("f","lee3","1233");
        addPhoneNo("c","lee4","1243");
        addPhoneNo("c","lee5","1253");
        addPhoneNo("c","lee65","1263");
        addPhoneNo("c","lee7","1273");
        addPhoneNo("s","lee8","1283");
        addPhoneNo("s","lee9","1293");

        printList();



    }

    static void addPhoneNo(String groupName, String name, String tel) {
        addGroup(groupName);
        HashMap group = (HashMap) phoneBook.get(groupName);
        group.put(tel, name);
    }

    static void addGroup(String groupName) {
        if (!phoneBook.containsKey(groupName)) {
            phoneBook.put(groupName, new HashMap());
        }
    }

    static void addPhoneNo(String name, String tel) {
        addPhoneNo("기타", name, tel);
    }

    static void printList() {
        Set set = phoneBook.entrySet();
        Iterator it = set.iterator();

        while (it.hasNext()) {
            Map.Entry e = (Map.Entry) it.next();

            Set subSet = ((HashMap) e.getValue()).entrySet();
            Iterator subIt = subSet.iterator();

            System.out.println(" * " + e.getKey() + subSet.size());

            while (subIt.hasNext()) {
                Map.Entry subE = (Map.Entry) subIt.next();
                String telNo = (String) subE.getKey();
                String name = (String) subE.getValue();
                System.out.println(name + telNo);

            }
            System.out.println();

        }

    }


}
