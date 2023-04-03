package Seminar_3;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<String> text = new ArrayList<>();
        text.add("word");
        text.add("Sun");
        text.add("Moon");
        text.add("Sun");
        text.add("word");
        text.add("Word");
        text.add("java");
        text.add("java");
        text.add("python");
        text.add("php");
        text.add("C++");
        text.add("C#");
        text.add("C");

//        countAndPrint(text);
//        removeDuplicates(text);
//        System.out.println(text);

        int crLen = 4;
        removeStringThatShorterThen(text, crLen);
        System.out.println(text);
    }

    static void countAndPrint(List<String> strings) {
        String temp;
        int count;
        List<String> tempList = new ArrayList<>();

        for (int i = 0; i < strings.size(); i++) {
            temp = strings.get(i);
            if (!tempList.contains(temp)){
                count = 1;
                for (int j = i + 1; j < strings.size(); j++) {
                    if (temp.equals(strings.get(j))) {
                        count++;
                    }
                }
                System.out.println(temp + " " + count);
                tempList.add(temp);
            }
        }
    }

    static void removeDuplicates(List<String> strings) {
        Collections.sort(strings);
        Iterator<String> iterator = strings.iterator();
        String first = iterator.next();
        while (iterator.hasNext()) {
            String next = iterator.next();
            if (next.equals(first)) {
                iterator.remove();
            } else {
                first = next;
            }
        }

//        String first = strings.get(0);
//        for (int i = 0; i < strings.size(); i++) {
//            if (strings.get(i).equals(first)) {
//                strings.remove(i);
//                i--;
//            } else {
//                first = strings.get(i);
//            }
//        }
    }

    static void removeStringThatShorterThen(List<String> strings, int criticalLength) {
        Iterator<String> iterator = strings.iterator();
        while (iterator.hasNext()) {
            String next = iterator.next();
            if (next.length() < criticalLength) {
                iterator.remove();
            }
        }
    }
}
