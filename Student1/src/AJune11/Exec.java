package AJune11;

public class Exec {

    public static int convert(String value) {
        try {
            int a = Integer.parseInt(value);
            return a;
        } catch (NumberFormatException e) {
            System.out.println("Cannot convert the string to an integer");
            return 0;
        }
    }

    public static void main(String[] args) {
        String[] b = { "23", "45.2", "12", "123f" };

        for (String i : b) {
            int num = convert(i);
            if(num!=0)
            System.out.println(" converted value of " + num);

        }
    }
}













