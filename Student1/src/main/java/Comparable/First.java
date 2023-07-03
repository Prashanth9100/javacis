package Comparable;

public class First {

        public static void main(String[] args) {
            String a = "Hello, World!";
            char[] b = {'a', 'e', 'i', 'o', 'u'};
            int Count = 0;

            for (int i = 0; i < a.length(); i++) {
                char c = Character.toLowerCase(a.charAt(i));
                for (int j = 0; j < b.length; j++) {
                    if (c == b[j]) {
                        Count++;
                        break;
                    }
                }
            }

            System.out.println("Number of vowels: " +Count);
        }
    }

