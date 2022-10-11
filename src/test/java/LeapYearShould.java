import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class LeapYearShould {

    @Test public void return_false_if_not_a_leap_year(){
        Leap leap = new Leap();
        Assertions.assertFalse(leap.checkIfLeapYear(1921));
    }

    @Test public void return_true_if_year_is_divisible_by_four(){
        Leap leap = new Leap();
        Assertions.assertTrue(leap.checkIfLeapYear(192));
    }
}
