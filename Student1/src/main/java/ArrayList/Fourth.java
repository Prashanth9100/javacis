package ArrayList;



    import java.util.Arrays;
import java.util.List;

    public class Fourth {
        public static void main(String[] args) {
            List<String> names = Arrays.asList("sports", "car", "Java", "js");


            String[] sArray = names.toArray(new String[names.size()]);


            System.out.println("Array: " + Arrays.toString(sArray));
        }
    }


