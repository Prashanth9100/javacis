package Interface;

interface Box1 {
    abstract void pencil();
}

interface Box
{
      abstract void pen();
}

public class Bag implements Box1,Box
{
   public void pencil()
   {
       System.out.println("Student Interface");
   }
   public void pen()
   {
       System.out.println("Second Interface");
   }
   public static void main( String[] args)
   {
       Bag a = new Bag();
       a.pen();
       a.pencil();
   }

}
