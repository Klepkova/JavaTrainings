package lesson.eight;

import lesson.Collect;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class DateTime {
    public static void main(String[] args) {
        Clock clock = Clock.systemUTC();
        ZoneId zoneId = ZoneId.systemDefault();
        LocalDate localDate = LocalDate.now();
        System.out.println(localDate);

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM-DD-YYYY");
        System.out.println(formatter.format(localDate));

        Instant instant = Instant.now();
//ChronoUnit.DAYS.between(
        LocalDateTime one = LocalDateTime.now();
        LocalDateTime two = LocalDateTime.now(Clock.system(ZoneId.of("Australia/Darwin")));

        System.out.println(Duration.between(one,two).getNano());
    }
}
