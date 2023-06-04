package Static;

public class Employee {
    static int a;

    static int name(int i)
    {
        return i;
    }

    static{
        a = name(10);

    }
    public static void main(String[] args)
    {
       // Employee e = new Employee();
      // e.name(10);
       System.out.println(a);
    }
}
