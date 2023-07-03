package Product;

public class Product {

    private double price;

    public double getter() {
        System.out.println(price);
        return price;
    }

    public void setter(double a) {
        this.price = a;
    }

    public  double getter(double quality) {
        System.out.println(quality * price);
        return quality;
    }




  public  static void main(String[] args) {
        Product obj = new Product();
        obj.setter(5);
        obj.getter();
        obj.getter(5);

    }
}