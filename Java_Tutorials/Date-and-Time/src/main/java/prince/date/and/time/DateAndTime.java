package prince.date.and.time;
import java.time.LocalDate;
import java.time.LocalTime;

/**
 *
 * @author princ
 */
public class DateAndTime {

    public static void main(String[] args) {
        LocalDate myObj = LocalDate.now();
        System.out.println(myObj);
        
        LocalTime myObj1 = LocalTime.now();
        System.out.println(myObj1);
        
    }
}
