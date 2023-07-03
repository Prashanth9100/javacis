package Constructure;

 class Premain {
    int x;
}
public class Main extends Premain
{
    int y;

    public Main()
    {
      x=5;
      y=10;
    }

    public static void main(String[] args)
    {
        Main a = new Main();
        System.out.println(a.x+" and "+a.y);

    }

}
