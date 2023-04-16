package Seminar_4;

import java.util.*;

public class HW_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayDeque<String> storage = new ArrayDeque<>();
        root:while (true) {
            String input = sc.nextLine();
            if ("exit".equals(input)) {
                break;
            } else if ("print".equals(input)) {
                System.out.println(storage);
            } else if ("revert".equals(input)) {
                storage.remove();
            } else {
                storage.addFirst(input);
            }

        }
    }
}
