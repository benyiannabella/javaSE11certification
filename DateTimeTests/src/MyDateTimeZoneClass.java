import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class MyDateTimeZoneClass {

    public static void main(String[] args) {

        var time = LocalTime.now(ZoneId.of("+2"));
        var date = LocalDate.now();
        var dateTime = LocalDateTime.now();
        var format1 = DateTimeFormatter.ofPattern("yyyy MMMM dd', ' hh:mm");
        var format3 = DateTimeFormatter.ofPattern("dd MMM yy");
        var format2 = DateTimeFormatter.ofPattern("hh:mm:ss");
        System.out.println(dateTime.format(format1));
        System.out.println(time.format(format2));
        System.out.println(date.format(format3));
        System.out.println(time.getHour());
        System.out.println(date.getDayOfMonth());
    }
}
