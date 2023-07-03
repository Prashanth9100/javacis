package ExecutorService;




import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

    class Booking {
        private int availableTickets;
        private Lock lock;

        public Booking(int availableTickets) {
            this.availableTickets = availableTickets;
            this.lock = new ReentrantLock();
        }

        public boolean bookTicket(int requestedTickets) {
            lock.lock();
            try {
                if (availableTickets >= requestedTickets) {

                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }


                    availableTickets -= requestedTickets;
                    System.out.println(requestedTickets + " ticket(s) booked successfully.");
                    return true;
                } else {
                    System.out.println("Insufficient tickets available.");
                    return false;
                }
            } finally {
                lock.unlock();
            }
        }
    }

    class SecondThread extends Thread {
        private Booking bookingSystem;
        private int requestedTickets;

        public SecondThread(Booking bookingSystem, int requestedTickets) {
            this.bookingSystem = bookingSystem;
            this.requestedTickets = requestedTickets;
        }

        @Override
        public void run() {
            bookingSystem.bookTicket(requestedTickets);
        }
    }

    public class Simulation {
        public static void main(String[] args) {
            Booking bookingSystem = new Booking(10);


            SecondThread thread1 = new SecondThread(bookingSystem, 3);
            SecondThread thread2 = new SecondThread(bookingSystem, 4);
            SecondThread thread3 = new SecondThread(bookingSystem, 2);
            SecondThread thread4 = new SecondThread(bookingSystem, 5);


            thread1.start();
            thread2.start();
            thread3.start();
            thread4.start();


            try {
                thread1.join();
                thread2.join();
                thread3.join();
                thread4.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            System.out.println("All ticket booking threads have finished.");
        }
    }


