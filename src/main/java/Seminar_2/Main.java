package Seminar_2;

import java.util.Objects;

public class Main {
    public static void main(String[] args) {
//        System.out.println(compress("aaaabbbcdd")); // a4b3cd2
//        System.out.println(compress("abcda")); // abcda

        System.out.println(isPalindrome("abcde"));
        System.out.println(isPalindrome("abcba"));
        System.out.println(isPalindrome("a"));
    }

    static boolean isPalindrome(String source) {
        StringBuilder stringBuilder = new StringBuilder(source);
        stringBuilder.reverse();
        String reversed = stringBuilder.toString();

        return Objects.equals(source, reversed);

//        int length = source.length();
//        int half = length/2;
//        for (int i = 0; i < half; i++){
//            if (source.charAt(i) != source.charAt(length - 1 - i)){
//                return false;
//            }
//        }
//        return true;
    }

    static String compress(String sourse) {
        int counter = 1;
        String result = "";
        result += sourse.charAt(0);
        for (int i = 1; i < sourse.length(); i++) {
            if (sourse.charAt(i) == sourse.charAt(i - 1)){
                counter++;
            } else {
                if (counter != 1){
                    result += counter;
                }
                result += sourse.charAt(i);
                counter = 1;
            }
        }
        if (counter != 1){
            result += counter;
        }

//        int length = sourse.length();
//        for (int i = 0; i < length; i++){
//            char c = sourse.charAt(i);
//        }
        return result;
    }
}
