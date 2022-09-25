package ru.itsjava.threads.lecture2;

public class ThreadPractice {
    public static void main(String[] args) {
        Runnable anonymousRunnable = new Runnable() {
            @Override
            public void run() {
                System.out.println("hello from anonymous class");
            }
        };

        Runnable functionalRunnable = () ->
                System.out.println("hello from functional programming");
        new Thread(functionalRunnable).start();

//        new Thread(() -> {
//            for (int i = 0; i < 5; i++) {
//                try {
//                    Thread.sleep(3000);
//                } catch (InterruptedException e) {
//                    e.printStackTrace();
//                }
//                System.out.println("hello from fast thread");
//            }
//        }).start();

//        Runnable runnable = () -> {
//            for (int i = 0; i < 5; i++) {
//                System.out.println("hello after sleep in 3 sec");
//                try {
//                    Thread.sleep(3000);
//                } catch (InterruptedException e) {
//                    e.printStackTrace();
//                }
//            }
//        };
//        Thread thread1 = new Thread(runnable);
//        thread1.setDaemon(true);
//        thread1.start();

        Runnable runnable = () -> {
                System.out.println("hello i'm runnable");
        };
        Thread thread1 = new Thread(runnable);
        thread1.start();

        Runnable runnableDaemon = () -> {
            for (int i = 0; i < 5; i++) {
                System.out.println("hello! i woke up after 4 sec");
                try {
                    Thread.sleep(4000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        };
        Thread daemonThread = new Thread(runnableDaemon);
        daemonThread.setDaemon(true);
        daemonThread.start();
    }
}
