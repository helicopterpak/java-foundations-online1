package ru.itsjava.threads;

public class ThreadPractice {
    public static void main(String[] args) throws InterruptedException{
        System.out.println("Thread.currentThread().getName() = " + Thread.currentThread().getName());
//        for (int i = 0; i < 5; i++) {
////            for (int j = 0; j < 2_000_000_000L ; j++) {
////            }
//            Thread.sleep(2000L);
//            System.out.println("A");
//
//        }
//
//        for (int i = 0; i < 5; i++) {
//            Thread.sleep(3000L);
//            System.out.println("B");
//
//        }
//        ThreadPrinter threadPrinterA = new ThreadPrinter("A ", 2000L);
////        ThreadPrinter threadPrinterB = new ThreadPrinter("B", 3000L);
//
//        PrinterRunnable printerRunnable = new PrinterRunnable("B ", 3000L);
//        Thread threadB = new Thread(printerRunnable);
//
//
//        System.out.println("start");
//
//        threadPrinterA.start();
//        threadB.start();
//
//        threadB.join();
//
//        System.out.println("end");

        PrinterRunnable printerRunnable = new PrinterRunnable("peace", 5000L);
        Thread messagePrinter = new Thread(printerRunnable);

        System.out.println("now i wanna");

        messagePrinter.start();

        messagePrinter.join();

        System.out.println("!!!");



    }
}
