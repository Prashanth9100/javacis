package Comparable;

import java.util.Arrays;

public class Second {

        public static void main(String[] args) {
            String a = "Earth";
            String b = "Heart";


            a = a.replaceAll("\\s", "").toLowerCase();
            b = b.replaceAll("\\s", "").toLowerCase();


            if (a.length() != b.length()) {
                System.out.println("The two strings are not anagrams.");
                return;
            }

            // Convert the strings to char arrays and sort them
            char[] Array1 = a.toCharArray();
            char[] Array2 = b.toCharArray();
            Arrays.sort(Array1);
            Arrays.sort(Array2);

            // Compare the sorted char arrays
            if (Arrays.equals(Array1, Array2)) {
                System.out.println("The two strings are anagrams  = " + a + " and " + b );
            } else {
                System.out.println("The two strings are not anagrams.");
            }
        }
    }


