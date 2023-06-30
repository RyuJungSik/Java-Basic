package Chapter11.Ex11;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class QueueEx1 {
    static Queue q = new LinkedList();
    static final int MAX_SIZE = 5;

    public static void main(String[] args) {
        System.out.println("help");
        while(true){
            System.out.print(">>");
            try {
                Scanner s = new Scanner(System.in);
                String input = s.nextLine().trim();

                if ("".equals(input)) {
                    continue;
                }

                if (input.equalsIgnoreCase("q")) {
                    System.exit(0);
                } else if (input.equalsIgnoreCase("help")) {
                    System.out.println("help");
                    System.out.println("q or Q");
                    System.out.println("history");
                } else if (input.equalsIgnoreCase("history")) {
                    int i = 0;
                    save(input);

                }


            } catch (Exception e) {
                System.out.println("입력오류");
            }
        }

    }

    public static void save(String input) {
        if (!"".equals(input)) {
            q.offer(input);
        }

        if (q.size() > MAX_SIZE) {
            q.remove();
        }

    }


}
