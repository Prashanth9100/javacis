package ArrayList;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

    public class Second {
        public static void main(String[] args) {
            List<String> names = new ArrayList<>(Arrays.asList("sports", "car", "Java", "js"));

                names.remove(names.size() - 1);
            System.out.println(names);
            }

    }


