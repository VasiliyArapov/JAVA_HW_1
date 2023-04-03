package Seminar_3;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class HW_3 {
    public static void main(String[] args) {

        List<String> strings = new ArrayList<>();
        strings.add("string");
        strings.add("40");
        strings.add("-5");
        strings.add("my_string");
        removeIntegers(strings);
        System.out.println(strings); // [string, my_string]

        List<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);
        numbers.add(6);
        removeEvenNumber(numbers);
        System.out.println(numbers);
    }

    static void removeEvenNumber(List<Integer> numbers) {
        Iterator<Integer> iterator = numbers.iterator();
        while (iterator.hasNext()) {
            Integer next = iterator.next();
            if (next % 2 == 0) {
                iterator.remove();
            }
        }
        // TODO: 31.03.2023 Удалить все четные элементы из списка
    }

    static void removeIntegers(List<String> strings) {
        Iterator<String> iterator = strings.iterator();
        while (iterator.hasNext()) {
            try {
                int x = Integer.parseInt(iterator.next());
                iterator.remove();
            } catch (NumberFormatException e){
                // not a number
            }
            }
        }
    }
