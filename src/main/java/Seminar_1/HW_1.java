package Seminar_1;

import java.util.Arrays;

public class HW_1 {
    public static void main(String[] args) {
//        System.out.println(isSumBetween10And20(5, 15)); // true
//        System.out.println(isSumBetween10And20(7, 15)); // false
//        System.out.println(isSumBetween10And20(2, 6)); // false

//        System.out.println(isPositive(5)); // true
//        System.out.println(isPositive(-3)); // false

//        printString("abcd", 5); // abcdabcdabcdabcdabcd

//        System.out.println(isLeapYear(2014)); // false
//        System.out.println(isLeapYear(2000)); // true
//        System.out.println(isLeapYear(1800)); // false

//        int[] arr = createArray(5, 3);
//        System.out.println(Arrays.toString(arr));

//        int[] arr = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0 };
//        switchOneToZero(arr);
//        System.out.println(Arrays.toString(arr));

//        int[] arr = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
//        multSmallerThenSix(arr);
//        System.out.println(Arrays.toString(arr));

        int[][] array = new int[4][4]; // [[1, 0, 0, 0], [0, 1, 0, 0], [0, 0, 1, x], [0, 0, 0, 1]]
        int x = array[2][3];
//        onesMainDiagonal(array); // заполняет 1 главную диагональ
//        printTwoDimensionalArray(array);
//        System.out.println();
        onesCollateralDiagonal(array); // заполняет 1 побочную диагональ
        printTwoDimensionalArray(array);
    }

    /**
     * 1. Написать метод, принимающий на вход два целых числа и проверяющий,
     * что их сумма лежит в пределах от 10 до 20 (включительно),
     * если да – вернуть true, в противном случае – false.
     */
    private static boolean isSumBetween10And20(int a, int b) {
        int sum = a + b;
        if ((sum <= 20) && (sum >= 10)){
            return true;
        } else {
            return false;
        }
    }

    private static boolean isPositive(int x) {
        if (x >= 0){
            return true;
        } else {
            return false;
        }
    }

    private static void printString(String source, int repeat) {
        String resString = source;
        while (repeat > 1){
            resString += source;
            repeat--;
        }
        System.out.println(resString);
    }

    private static boolean isLeapYear(int year) {
        if (year % 4 == 0 && year % 100 != 0){
            return true;
        } else if (year % 100 == 0 && year % 400 == 0){
            return true;
        }
        return false;
    }

    private static int[] createArray(int len, int initialValue) {
        int[] arr = new int[len];
        for (int i = 0; i < arr.length; i++){
            arr[i] = initialValue;
        }
        return arr;
    }

    private static void switchOneToZero(int[] array){
        for (int i = 0; i < array.length; i++){
            if (array[i] == 0){
                array[i] = 1;
            } else {
                array[i] = 0;
            }
        }
    }

    private static void multSmallerThenSix(int[] array){
        for (int i = 0; i < array.length; i++){
            if (array[i] < 6){
                array[i] *= 2;
            }
        }
    }

    private static void onesMainDiagonal(int[][] array){
        for (int i = 0; i < array.length; i++){
            for (int j = 0; j < array.length; j++){
                if (i == j){
                    array[i][j] = 1;
                }
            }
        }
    }

    private static void onesCollateralDiagonal(int[][] array){
        for (int i = 0; i < array.length; i++){
            for (int j = 0; j < array.length; j++){
                if (i + j == array.length - 1){
                    array[i][j] = 1;
                }
            }
        }
    }

    private static void printTwoDimensionalArray(int[][] array){
        for (int[] ints : array) {
            System.out.println(Arrays.toString(ints));
        }
    }

/**
 * 1. Задать целочисленный массив, состоящий из элементов 0 и 1.
 * Например: [ 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 ]. С помощью цикла и условия заменить 0 на 1, 1 на 0;
 *
 * 2. Задать массив [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ] пройти по нему циклом, и числа меньшие 6 умножить на 2;
 *
 * 3. Создать квадратный двумерный целочисленный массив (количество строк и столбцов одинаковое),
 * и с помощью цикла(-ов) заполнить его диагональные элементы единицами (можно только одну из диагоналей, если обе сложно).
 * Определить элементы одной из диагоналей можно по следующему принципу: индексы таких элементов равны, то есть [0][0], [1][1], [2][2], …, [n][n];
 * * Также заполнить элементы побочной диагонали
 */
}
