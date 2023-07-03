package AJune19;



    import java.util.ArrayList;
import java.util.List;

    class Student {
         String firstName;
         String lastName;
         double gpa;

        public Student(String firstName, String lastName, double gpa) {
            this.firstName = firstName;
            this.lastName = lastName;
            this.gpa = gpa;
        }

        public double getGpa() {
            return gpa;
        }

        @Override
        public String toString() {
            return firstName + " " + lastName + " (GPA: " + gpa + ")";
        }
    }

    public class Third {
        public static void main(String[] args) {
            List<Student> studentList = new ArrayList<>();
            studentList.add(new Student("John", "Doe", 3.8));
            studentList.add(new Student("Jane", "Smith", 4.0));
            studentList.add(new Student("David", "Johnson", 2.9));
            studentList.add(new Student("Emily", "Davis", 3.5));




            double totalGpa = 0;
            for (Student student : studentList) {
                totalGpa += student.getGpa();
            }
            double averageGpa = totalGpa / studentList.size();


            studentList.removeIf(student -> student.getGpa() < averageGpa);

            System.out.println("After removal:");
            printStudents(studentList);
        }

        private static void printStudents(List<Student> students) {
            for (Student student : students) {
                System.out.println(student);
            }
        }
    }


