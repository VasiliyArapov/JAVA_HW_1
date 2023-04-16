package Seminar_4;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<String[]> storage = new LinkedList<>();
        root:while (true) {
            String input = sc.nextLine();
            if ("q".equals(input)) {
                break;
            }
            String[] pair = input.split("~");
            if (pair.length != 2) {
                throw new IllegalArgumentException();
            }
            if ("print".equals(pair[0])) {
                boolean found = storage.removeIf(x -> {
                    if (x[1].equals(pair[1])) {
                        System.out.println(x[0]);
                        return true;
                    }
                    return false;
                });
                if (!found) {
                    throw new IndexOutOfBoundsException();
                }
//                Iterator<String[]> iterator = storage.iterator();
//                while (iterator.hasNext()) {
//                    String[] next = iterator.next();
//                    if (next[1].equals(pair[1])) {
//                        System.out.println(next[0]);
//                        iterator.remove();
//                        continue root;
//                    }
//                }
//                throw new IndexOutOfBoundsException();
            } else {
                Iterator<String[]> iterator = storage.iterator();
                while (iterator.hasNext()) {
                    String[] next = iterator.next();
                    if (next[1].equals(pair[1])) {
                        next[0] = pair[0];
                        continue root;
                    }
                }
                storage.add(pair);
            }
        }
    }
}
