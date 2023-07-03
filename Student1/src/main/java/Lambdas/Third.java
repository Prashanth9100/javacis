package Lambdas;




    import java.util.Arrays;
    //import java.util.OptionalDouble;

public class Third {
        public static void main(String[] args) {
            Integer[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

            double average = Arrays.stream(numbers)
                    .filter(num -> num % 2 != 0)
                    .mapToDouble(num -> Math.pow(num, 2))
                    .average()
                    .orElse(0);

            System.out.println("Average of squares of odd numbers: " + average);
        }
    }


