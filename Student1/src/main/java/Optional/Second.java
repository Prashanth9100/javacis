package Optional;

import java.util.Optional;

    public class Second {
        public static Optional<String> uppercaseString(Optional<String> inputOptional) {
            return inputOptional.map(String::toUpperCase);
        }

        public static void main(String[] args) {
            Optional<String> inputOptional = Optional.of("prashanth!");
            Optional<String> resultOptional = uppercaseString(inputOptional);

            if (resultOptional.isPresent()) {
                String result = resultOptional.get();
                System.out.println("Result: " + result);
            } else {
                System.out.println("Input Optional is empty.");
            }
        }
    }
