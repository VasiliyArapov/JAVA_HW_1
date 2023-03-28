package Seminar_1;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
//        arrayDemo();
//        int x = getInteger();
//        System.out.println(x);
//        int[] array = {1,1,0,1,1,1};
//        System.out.println(calculateMaxCount(array, 1));
//
//        int[] array2 = {1,1,0,0,0,1};
//        System.out.println(calculateMaxCount(array2, 0));

//        int[] array = {3,2,2,3};
//        shift(array, 2);
//        System.out.println(Arrays.toString(array));
//
//        int[] array2 = {3,2,1,3,2,1,3};
//        shift(array2, 1);
//        System.out.println(Arrays.toString(array2));

        System.out.println(getCommonPrefix(new String[] {"aaab", "aacc", "aacd"}));
        System.out.println(getCommonPrefix(new String[] {"abc", "abd", "cde"}));
        System.out.println(getCommonPrefix(new String[] {"aaaaa", "aaaaa", "aaaaacde"}));

    }

    /**
     * Напишите метод, котор находит самую длин строку общего префикса среди массива строк.
     * Если общего префикса нет, вернуть пуст строку "".
     * ["aaab", "aacc", "aacd"] -> "aa"
     */
    static String getCommonPrefix(String[] array){
        String commonPrefix = array[0];
        for (int i = 1; i < array.length; i++){
            String second = array[i];

            int minLength = Math.min(commonPrefix.length(), second.length());
            for (int j = 0; j < minLength; j++){
                if (commonPrefix.charAt(j) != second.charAt(j)){
                    commonPrefix = commonPrefix.substring(0, j);
                    break;
                }
            }
        }
        return commonPrefix;
    }

    /**
     *Дан массив nums = [3,2,2,3] и число val = 3.
     * Если в массиве есть числа, равные заданному, нужно перенести эти элементы в конец массива.
     * Таким образом, первые несколько (или все) элементов массива далжны быть отличны от заданного,
     * а остальные - равны ему.
     * [3,2,2,3], val = 3 -> [2,2,3,3]
     * [3,2,1,3,2,1,3], val = 3 -> [2,1,2,1,3,3,3]
     */
    static void shift(int[] array, int val){
        for (int i = 0; i < array.length; i++){
            if (array[i] == val){
                for (int j = array.length - 1; j > i; j--) {
                    if(array[j] != val){
                        int tmp = array[i];
                        array[i] = array[j];
                        array[j] = tmp;
                        break;
                    }
                }
            }
        }
    }

    /**
     * Дан массив двоичн чисел, например [1,1,0,1,1,1],
     * выведите максимал кол-во подряд идущих 1.
     */
    static int calculateMaxCount(int[] array, int number){
        int count = 0;
        int maxCount = 0;
        for (int a : array) {
            if (a == number){
                count++;
            } else {
                if(count > maxCount){
                    maxCount = count;
                }
                count = 0;
            }
        }
        if (count > maxCount){
            maxCount = count;
        }

        return maxCount;
    }

    public static int getInteger(){
        return 5;
    }

    public static void arrayDemo(){
//        int x = 5;
//        int[] x = {1, 2, 3, 4, 5};
        int[] x = new int[5];
        int third = x[2];
        System.out.println(third);

        x[1] = -1;
        System.out.println(Arrays.toString(x));
        System.out.println(x.length);
    }
}
