package Seminar_2;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class HW_2 {
    public static void main(String[] args) {
        // 1 задча
//        int n = 6;
//        char c1 = 'a';
//        char c2 = 'b';
//        String res = buildString(n, c1, c2);
//        System.out.println(res);

        // 2 задача
        Path path = Path.of("file.txt");
        if (Files.exists(path)) {
            System.out.println("Found");
        } else {
            System.out.println("Create file");
            try {
                Files.createFile(path);
            } catch (IOException e){
                System.out.println("Here is an error...");
            }
        }
        int n = 100;
        String word = "TEXT";
        String file_text = buildString1(n, word);
        try {
            Files.writeString(path, file_text);
        } catch (IOException e){
            System.out.println("Error");
        }
    }

//    1 Дано четное число N (>0) и символы c1 и c2.
//    Написать метод, который вернет строку длины N, которая состоит из чередующихся символов c1 и c2, начиная с c1.
//
//            Пример. (n = 6, c1='a', c2='b') -> "ababab"
//            (n = 8, c1='x', c2='y') -> "xyxyxyxy"

    static String buildString(int n, char c1, char c2) {
        StringBuilder sb = new StringBuilder();
        int counter = 0;
        while (counter < n / 2) {
            sb.append(c1);
            sb.append(c2);
            counter++;
        }
        String result = sb.toString();
        return result;
    }

    static String buildString1(int n, String word){
        StringBuilder sb = new StringBuilder(word);
        int counter = 1;
        while (counter < n ) {
            sb.append(word);
            counter++;
        }
        String result = sb.toString();
        return result;
    }
//    2 Создать файл file.txt. Если файл уже создан, ничего делать не надо.
//    Записать в файл слово TEXT 100 раз: TEXTTEXTTEXTTEXTTEXTTEXT...
}
