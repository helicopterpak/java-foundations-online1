package ru.itsjava.iostreams;


import java.io.*;
import java.util.ArrayList;


public class IOStreamsPractice {
    public static void main(String[] args) {
//        BufferedReader console = new BufferedReader(new InputStreamReader(System.in));
//        try {
//            String input = console.readLine();
//            System.out.println("your input = " + input);
//        } catch (IOException e) {
//            e.printStackTrace();
//        } finally {
//            try {
//                console.close();
//            } catch (IOException e) {
//                e.printStackTrace();
//            }
//        }

        // try with resources
//        try (        BufferedReader console = new BufferedReader(new InputStreamReader(System.in))){
//            String input = console.readLine();
//            System.out.println("your input = " + input);
//        } catch (IOException e) {
//            e.printStackTrace();
//        }

        File file = new File("src/main/resources/file.txt");
        try (PrintWriter printWriter = new PrintWriter(file)) {
            printWriter.println("line 1");
            printWriter.println("line 2");
            printWriter.println("line 3");
        } catch (FileNotFoundException fileNotFoundException) {
            fileNotFoundException.printStackTrace();
        }

        ArrayList list = new ArrayList();

        try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
            String input;
            while ((input = reader.readLine()) != null) {
                list.add(input);
            }
            System.out.println(list);
        } catch (IOException e) {
            e.printStackTrace();
        }

        File file2 = new File("src/main/resources/file2.txt");
        try (PrintWriter printWriter = new PrintWriter(file2)) {
            printWriter.println("second file");
        } catch (FileNotFoundException fileNotFoundException) {
            fileNotFoundException.printStackTrace();
        }

        try (BufferedReader reader = new BufferedReader(new FileReader(file2));
             PrintWriter printWriter = new PrintWriter(file)) {
            String input;
            while ((input = reader.readLine()) != null) {
                printWriter.println(input);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        try (PrintWriter printWriter = new PrintWriter(file2)) {
            printWriter.println(list);
        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
