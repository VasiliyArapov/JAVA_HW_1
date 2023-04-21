package Seminar_5;

import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class HW_5 {
    public static void main(String[] args) {
        System.out.println(isCorrectParentheses("()")); // true
        System.out.println(isCorrectParentheses("(")); // false
        System.out.println(isCorrectParentheses("())")); // false
        System.out.println(isCorrectParentheses("((()))")); // true
        System.out.println(isCorrectParentheses("()[]{}<>")); // true
        System.out.println(isCorrectParentheses("([)]")); // false
        System.out.println(isCorrectParentheses("][]")); // false
        System.out.println("[]{<()[]<>>}"); // true
    }

    static boolean isCorrectParentheses(String parentheses) {
        // TODO: 07.04.2023 Вписать решение!
        // Нужно завести маппинг скобочек либо ( -> ), либо ) -> ( и так для каждой пары
        // Нужно использовать Deque.
        // Открывающуюся скобку вносим в Deque (insertFirst)
        // Если встретилась закрывающаяся скобка, то (Deque#pollFirst) и сравниваем ее с встретившейся

        Map<Character, Character> charsMap = new HashMap<>();
        charsMap.put('(', ')');
        charsMap.put('[', ']');
        charsMap.put('{', '}');
        charsMap.put('<', '>');

        ArrayDeque<String> tempStorage = new ArrayDeque<>();
        char[] chars = parentheses.toCharArray();
        if (chars.length % 2 != 0) {
            return false;
        }
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] == '(') {
                String str = Character.toString(charsMap.get('('));
                tempStorage.addFirst(str);
            } else if (chars[i] == '[') {
                String str = Character.toString(charsMap.get('['));
                tempStorage.addFirst(str);
            } else if (chars[i] == '{') {
                String str = Character.toString(charsMap.get('{'));
                tempStorage.addFirst(str);
            } else if (chars[i] == '<') {
                String str = Character.toString(charsMap.get('<'));
                tempStorage.addFirst(str);
            } else {
                if (Objects.equals(tempStorage.pollFirst(), Character.toString(chars[i]))) {
                    continue;
                }
                else {
                    return false;
                }
            }
        }
        if (tempStorage.size() == 0){
            return true;
        }

        return false;
    }
}
