package AJune20;



    import java.util.HashMap;

    public class Second {
        public static void main(String[] args) {
            int[] inp = {10, 20, 30, 40, 50, 60};
            int t = 100;
            int[] result = sum(inp, t);

            if (result != null) {
                System.out.println("Indices: [" + result[0] + ", " + result[1] + "]");
            } else {
                System.out.println("No two numbers found");
            }
        }

        public static int[] sum(int[] inp, int t) {
            HashMap<Integer, Integer> numMap = new HashMap<>();

            for (int i = 0; i < inp.length; i++) {
                int complement = t - inp[i];

                if (numMap.containsKey(complement)) {
                    int complementIndex = numMap.get(complement);
                    return new int[]{complementIndex, i};
                }

                numMap.put(inp[i], i);
            }

            return null;
        }
    }


