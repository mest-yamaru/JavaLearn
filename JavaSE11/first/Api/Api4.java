import java.time.LocalDate;

public class Api4 {
    public static void main(String[] args) {
        LocalDate a = LocalDate.of(2015, 0, 1);
        LocalDate b = LocalDate.parse("2015-01-01");
        System.out.println(a.equals(b));
    }
}
