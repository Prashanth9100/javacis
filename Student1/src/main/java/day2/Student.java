package day2;

public class Student {
    private String name, newName;
    public String getName() {
        return name;
    }
    public void setName(String newName) {
        this.name = newName;
    }

    public static void main(String[] args) {




        Student myObj = new Student();
        myObj.setName("PrashanthPv");
        System.out.println(myObj.getName());
    }
}
