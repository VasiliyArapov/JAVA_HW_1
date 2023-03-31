package Seminar_2;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class FileSystemDemo {
    public static void main(String[] args) {
//        Path path = Path.of("file.txt"); // Paths.get("file.txt")
//        try {
//            Files.createDirectories(Path.of("root", "child"));
//        } catch (IOException e){
//            System.out.println("Here is an error...");
//        }
//        Path path = Path.of("root", "child", "file.txt");
//        try {
//            Files.createFile(path);
//        } catch (IOException e){
//            System.out.println("Here is an error...");
//        }

//        if (Files.exists(path)) {
//            System.out.println("Found");
//        } else {
//            System.out.println("Not found");
//        }

//        if (Files.isRegularFile(path)){
//            System.out.println("File");
//        }
//        if (Files.isDirectory(path)){
//            System.out.println("Dir");
//        }

//        try {
//            Files.createFile(path);
//        } catch (IOException e){
//            e.printStackTrace();
//            System.out.println("При создании файл произошла ошибка: " + e.getMessage() + " " + e.getClass().getName());
//        }

        Path path = Path.of("file.txt");

        try {
            Files.writeString(path,"my_content");
        } catch (IOException e){
            System.out.println("Error");
        }

        try {
            String content = Files.readString(path);
            System.out.println(content);
        } catch (IOException e){
            System.out.println("Error");
        }

    }
}
