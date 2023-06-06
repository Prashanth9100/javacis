package operators;

public class FizzBuzz {

    public static void main(String[] args) {
        int n=50;
        for(int i=1;i<=n;i++)
        {
            if((i%3)==0 && (i%5)==0) {
                System.out.println("Number: "+i+"   FizzBuzz");
            }
            else if((i%3)!=0 && (i%5)==0) {
                System.out.println("Number: "+i+"   Buzz");
            }
            else if((i%3)==0 && (i%5)!=0) {
                System.out.println("Number: "+i+"   Fizz");
            }
            else
                System.out.println(i);
        }
    }
}
