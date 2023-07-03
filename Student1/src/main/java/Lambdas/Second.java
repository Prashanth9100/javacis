package Lambdas;


    import java.util.Arrays;

    public class Second {
        public static void main(String[] args) {
            String[] strings = {"cricket", "array", "cherry", "mobile"};

            Arrays.stream(strings)
                    .filter(str -> containsVowels(str))
                    .forEach(str -> System.out.println(str + " - " + countVowels(str)));
        }

        private static boolean containsVowels(String str) {
            return str.matches(".*[aeiouAEIOU].*");
        }

        private static int countVowels(String str) {
            return (int) str.chars()
                    .filter(ch -> "aeiouAEIOU".indexOf(ch) != -1)
                    .count();
        }
    }


