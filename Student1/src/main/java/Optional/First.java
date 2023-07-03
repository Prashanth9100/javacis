package Optional;

import java.util.Optional;

    public class First {
        public static Optional<Integer> getStringLength(String input) {
            if (input == null) {
                return Optional.empty();
            } else {
                return Optional.of(input.length());
            }
        }

        public static void main(String[] args) {
            String inputString = "Prashanth";
            System.out.println("Input: " + inputString);
            Optional<Integer> lengthOptional = getStringLength(inputString);
            if (lengthOptional.isPresent()) {
                System.out.println("Length: " + lengthOptional.get());
            } else {
                System.out.println("Input string is null.");
            }
        }
    }



