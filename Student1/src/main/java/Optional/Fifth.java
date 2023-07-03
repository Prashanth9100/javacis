package Optional;

    import java.time.DayOfWeek;
import java.time.LocalDate;

    public class Fifth {
        public static void main(String[] args) {
            // Example specific date
            LocalDate startDate = LocalDate.of(2023, 7, 15);

            int workingDays = calculateWorkingDays(startDate);
            System.out.println("Number of working days: " + workingDays);
        }

        public static int calculateWorkingDays(LocalDate startDate) {
            LocalDate currentDate = startDate;
            int workingDays = 0;

            while (!currentDate.isAfter(startDate.withDayOfMonth(startDate.lengthOfMonth()))) {
                if (currentDate.getDayOfWeek() != DayOfWeek.SATURDAY && currentDate.getDayOfWeek() != DayOfWeek.SUNDAY) {
                    workingDays++;
                }
                currentDate = currentDate.plusDays(1);
            }

            return workingDays;
        }
    }

