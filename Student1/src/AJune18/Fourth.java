package AJune18;


import java.util.Arrays;
import java.util.Comparator;

    public class Fourth {
        public static void main(String[] args) {
            String[] strings = {"cricket", "array", "cherry", "mobile", "elephant", "frog"};

            Arrays.sort(strings, Comparator.comparingInt(String::length)
                    .thenComparing(Comparator.comparingInt((String str) -> str.charAt(str.length() - 1)).reversed()));

            Arrays.stream(strings)
                    .forEach(System.out::println);
        }
    }


