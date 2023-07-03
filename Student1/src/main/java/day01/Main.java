package day01;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {

   private String name, newName;
    public String getName() {
        return name;
    }
    public void setName(String newName) {
        this.name = newName;
    }

    public static void main(String[] args) {




        Main myObj = new Main();
        myObj.setName("Prashanth");
        System.out.println(myObj.getName());
    }
}


