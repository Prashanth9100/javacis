package Comparable;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Fifth implements Comparable<Fifth> {

        String firstname;
        String lastname;

        double gpa;

        public Fifth(String firstname, String lastname, double gpa) {
            this.firstname = firstname;
            this.lastname = lastname;
            this.gpa = gpa;
        }

        public String toString() {
            return "{" + "firstname='" + firstname + '\'' + ", lastname='" + lastname + '\'' + ", gpa=" + gpa + '}';
        }

        @Override

        public int compareTo(Fifth that) {
            return this.lastname.compareTo(that.lastname);
        }
        public static void main(String[] args) {

            List<Fifth> b = new ArrayList<>();

            try (BufferedReader br = new BufferedReader(new FileReader("D:\\cis-java\\javacis\\Student1\\src\\AJune07\\MOCK_DATA.csv"))) {
                String line;
                br.readLine();
                while ((line = br.readLine()) != null) {

                    String[] data = line.split(",");
                    String firstName = data[0].trim();
                    String lastName = data[1].trim();
                    double gpa = Double.parseDouble(data[2].trim());

                    Fifth a = new Fifth(firstName, lastName, gpa);
                    b.add(a);
                }
            } catch (IOException e) {
                throw new RuntimeException(e);
            }

            Collections.sort(b);
            for (Fifth x : b)
                System.out.println(x.toString());

        }

    }
