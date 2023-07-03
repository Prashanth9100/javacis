package Optional;

import java.time.LocalDate;
import java.time.Period;

    public class Third
    {
        public static int calculateAge(LocalDate birthdate) {
            LocalDate currentDate = LocalDate.now();
            Period period = Period.between(birthdate, currentDate);
            return period.getYears();
        }

        public static void main(String[] args) {
            LocalDate birthdate = LocalDate.of(1998, 1, 1);
            int age = calculateAge(birthdate);
            System.out.println("Age: " + age);
        }
    }

