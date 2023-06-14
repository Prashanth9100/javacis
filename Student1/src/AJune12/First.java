package AJune12;

public class First extends Thread
{

            public void run() {
               for (int i = 1; i < 11; i++) {


                   System.out.println("" + i);
               }
           }

        public static void main(String[] args )
        {

            First t1 = new First();

            t1.start();
        }
    }

