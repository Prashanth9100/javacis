package AJune14;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
 class First implements Runnable {

        private int[] array;
        private int startIndex;
        private int endIndex;
        private int partialSum;

        public First(int[] array, int startIndex, int endIndex) {
            this.array = array;
            this.startIndex = startIndex;
            this.endIndex = endIndex;
            this.partialSum = 0;
        }

        public int getPartialSum() {
            return partialSum;
        }

        @Override
        public void run() {
            for (int i = startIndex; i < endIndex; i++) {
                partialSum += array[i];
            }
        }
    }

    public class ArrayFirst {
        public static void main(String[] args) throws InterruptedException {
            int[] array = new int[100];
            for (int i = 0; i < array.length; i++) {
                array[i] = i + 1;
            }

            int numThreads = 5;
            int elementsPerThread = array.length / numThreads;

            ExecutorService executorService = Executors.newFixedThreadPool(numThreads);
            First[] calculators = new First[numThreads];


            for (int i = 0; i < numThreads; i++) {
                int startIndex = i * elementsPerThread;
                int endIndex = (i == numThreads - 1) ? array.length : (startIndex + elementsPerThread);
                calculators[i] = new First(array, startIndex, endIndex);
                executorService.submit(calculators[i]);
            }

            executorService.shutdown();
            executorService.awaitTermination(10, TimeUnit.SECONDS);

            int totalSum = 0;


            for (int i = 0; i < numThreads; i++) {
                totalSum += calculators[i].getPartialSum();
            }

            System.out.println("Total sum: " + totalSum);
        }
    }


