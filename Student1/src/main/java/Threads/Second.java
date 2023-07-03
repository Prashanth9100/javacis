package Threads;

public class Second implements Runnable {

        public void run() {
            for (int i = 1; i <= 10; i++) {
                System.out.println(i);
            }
        }

        public static void main(String[] args) {
            Second a = new Second();
            Thread t1 = new Thread(a);
            t1.start();
        }
    }


