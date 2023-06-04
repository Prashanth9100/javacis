package runtime;


public class Main extends Poly {
    void run()
    {
        System.out.println("Hello");
    }

    public static void main(String[] args)
    {
        Poly obj = new Main();
        Poly a;
        a = new Poly();
        obj.run();
        a.run();

    }
}
