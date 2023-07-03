package AJune22;


    import java.util.HashSet;
import java.util.Iterator;

    public class First {
        public static void main(String[] args) {

            HashSet<String> stringSet = new HashSet<>();

            // Add 10 strings to the HashSet
            stringSet.add("App");
            stringSet.add("IOS");
            stringSet.add("Android");
            stringSet.add("Linux");
            stringSet.add("Unix");
            stringSet.add("Microsoft");


            // Iterate HashSet using Iterator
            System.out.println("Iterating HashSet using Iterator:");
            Iterator<String> iterator = stringSet.iterator();
            while (iterator.hasNext()) {
                String element = iterator.next();
                System.out.println(element);
            }

            // Iterate HashSet using ForEach loop
            System.out.println("\nIterating HashSet using ForEach loop:");
            for (String element : stringSet) {
                System.out.println(element);
            }

            // Iterate HashSet using Streams ForEach
            System.out.println("\nIterating HashSet using Streams ForEach:");
            stringSet.stream().forEach(element -> System.out.println(element));
        }
    }


