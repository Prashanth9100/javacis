package Lambdas;



    import java.util.Arrays;
import java.util.Comparator;

    public class First {
        public static void main(String[] args) {
            String[] strings = {"cricket", "array", "cherry", "mobile"};

            Arrays.stream(strings)
                    .map(str -> str.substring(0, 1).toUpperCase() + str.substring(1))
                    .sorted(Comparator.naturalOrder())
                    .forEach(System.out::println);
        }
    }


