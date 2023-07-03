package AJune20;

import java.util.HashMap;
import java.util.Iterator;

class Student {

    String firstname;
    String lastname;
    Double gpa;

     public Student(String firstname, String lastname, Double gpa) {
         this.firstname = firstname;
         this.lastname = lastname;
         this.gpa = gpa;
     }

     @Override
     public String toString() {
         return "Student{" +
                 "firstname='" + firstname + '\'' +
                 ", lastname='" + lastname + '\'' +
                 ", gpa=" + gpa +
                 '}';
     }


     public static void main(String[] args)
    {
        HashMap<String,Student> hash = new HashMap<String,Student>();

        hash.put("rushi", new Student("rushi","v",3.65));
        hash.put("prem", new Student("prem","p",3.55));
        hash.put("barath", new Student("barath","b",3.45));
        hash.put("sai", new Student("sai","s",3.65));
        hash.put("nithish", new Student("nithish","n",3.35));
        hash.put("siva", new Student("siva","s",3.56));
        hash.put("akhil", new Student("akhil","a",3.35));
        hash.put("rohith", new Student("rohith","r",3.75));

        System.out.println( "Entry Set");
        for (HashMap.Entry<String,Student> p : hash.entrySet()) {
            //System.out.println("Key: " + p.getKey() + ", Value: " + p.getValue());
            System.out.println(p);
        }

            System.out.println( "forEach");
            hash.forEach((key, value) -> System.out.println(key +" , "+ value));

            System.out.println( "Iterator");
            Iterator<String> it = hash.keySet().iterator();
            while (it.hasNext()) {
                String key = it.next();
                System.out.println("Key: " + key + ", Value: " + hash.get(key));
            }

        }
    }

