package operators;

import java.util.Scanner;

public class Second {

     int age;
    public static void main(String[] args)
    {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the age:");
        int age= sc.nextInt();
        if(age>=13 && age<=19)
        {
            System.out.println("teen");
        }
        else if(age<13)
        {
            System.out.println("kid");
        }
        else{
            System.out.println("Adult");
        }
    }
}
