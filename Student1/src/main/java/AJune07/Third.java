package AJune07;

public class Third {


        public static String rev(String a) {
            String[] words = a.split(" ");
            StringBuilder rev = new StringBuilder();

            for (String word : words) {
                StringBuilder w = new StringBuilder(word);
                w.reverse();
                rev.append(w).append(" ");
            }

            return rev.toString().trim();
        }

        public static void main(String[] args) {
            String inputSentence = "Java J2EE Reverse Me";
            String outputSentence = rev(inputSentence);
            System.out.println(outputSentence);
        }
    }






