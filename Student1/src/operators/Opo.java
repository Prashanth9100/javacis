package operators;

public class Opo {

    public static void main(String[] args)
    {
        int n = 98547, a=0;


        System.out.println("previous number: " + n);


        while(n!= 0) {

            // get last digit from num
            int d = n % 10;
             a = a * 10 + d;

            // remove the last digit from num
            n= n/10;
        }

        System.out.println("Number: "+a);
    }

    }

