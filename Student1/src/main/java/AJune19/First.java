package AJune19;


    import java.lang.reflect.Array;
    import java.util.ArrayList;
    import java.util.Arrays;
    import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Collectors;

    public class First {
        public static void main(String[] args) {
            List<String> names = Arrays.asList("sports", "car", "Java", "js");

            // Using for loop
            System.out.println("Using for loop:");
            for (int i = 0; i < names.size(); i++) {

                System.out.println(names.get(i));
            }



           // enhanced
            for (String r : names) {
                System.out.println(r);
            }

            System.out.println();

            // Using iterator

            Iterator<String> r = names.iterator();
            while (r.hasNext()) {

                System.out.println(r.next());
            }

            System.out.println();

            // Using forEach

            System.out.println("Using forEach:");
            names.forEach(System.out::println);



            // Using parallel stream
            System.out.println("Using parallel stream:");
            names.stream().parallel().forEach(System.out::println);
            names.stream().parallel().forEachOrdered(System.out::println);

        }
    }


