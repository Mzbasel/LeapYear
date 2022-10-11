import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class LeapYearShould {
    private Leap leap;
    @BeforeEach
    void setup() {
       leap = new Leap();
    }

    @Test public void return_false_if_not_a_leap_year(){
        Assertions.assertFalse(leap.checkIfLeapYear(1921));
    }

    @ParameterizedTest
    @CsvSource({
            "1920",
            "1940",
            "2000"
    })
    public void return_true_if_is_leap_year(int year) {
        Assertions.assertTrue(leap.checkIfLeapYear(year));
    }

    @ParameterizedTest
    @CsvSource({
            "1900",
            "1800",
    })
    public void return_false_if_divisible_by_100_but_not_divisible_by_400(int year) {
        Assertions.assertFalse(leap.checkIfLeapYear(year));
    }

}
