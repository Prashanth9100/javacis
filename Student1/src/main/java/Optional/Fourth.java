package Optional;

    import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;

    public class Fourth {
        public static void main(String[] args) {
            // Example list of dates
            List<LocalDate> dates = Arrays.asList(
                    LocalDate.of(1902, 5, 15),
                    LocalDate.of(1923, 2, 28),
                    LocalDate.of(1921, 9, 1),
                    LocalDate.of(2022, 12, 31)
            );

            LocalDate earliestDate = findEarliestDate(dates);
            LocalDate latestDate = findLatestDate(dates);

            System.out.println("Earliest date: " + earliestDate);
            System.out.println("Latest date: " + latestDate);
        }

        public static LocalDate findEarliestDate(List<LocalDate> dates) {
            return dates.stream()
                    .min(LocalDate::compareTo)
                    .orElseThrow(() -> new IllegalArgumentException("Empty list of dates"));
        }

        public static LocalDate findLatestDate(List<LocalDate> dates) {
            return dates.stream()
                    .max(LocalDate::compareTo)
                    .orElseThrow(() -> new IllegalArgumentException("Empty list of dates"));
        }
    }


