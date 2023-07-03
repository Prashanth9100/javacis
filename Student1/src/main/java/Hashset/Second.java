package Hashset;



    import java.util.HashSet;

    public class Second {

        public static void main(String[] args) {
            String inputString = "Hello World";

            // Remove duplicate characters
            HashSet<Character> charSet = new HashSet<>();
            StringBuilder result = new StringBuilder();

            for (char c : inputString.toCharArray()) {
                if (charSet.add(c)) {
                    result.append(c);
                }
            }

            // Print resulting string
            System.out.println("Resulting String: " + result.toString());
        }
    }

