import java.time.DayOfWeek;
import java.time.LocalDate;

public class Api5 {
    public static void main(String[] args) {
        LocalDate a = LocalDate.of(2022,8,19);
        LocalDate b = LocalDate.now();
        b.with(DayOfWeek.MONDAY);
        System.out.println(a.equals(b) + ", " + a.isBefore(b));
    }
}
