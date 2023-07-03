package Constructure;

class Parent{
int x;
}
public class Overload extends Parent {
    int y;

     Overload()
    {
        x=5;
    }
     Overload(int i)
    {
        y=i;

    }

    public static void main(String[] args)
    {
        Overload a = new Overload();
        System.out.println(a.x);

        Overload b = new Overload(30);
        System.out.println("Parameterized: "+b.y);

    }

}
