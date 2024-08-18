import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

public class BonusTest {
    @Test
    void shouldCalculateForNotRegisteredAndUnderLimit() {
        BonusService service = new BonusService();

        long amount = 1000;
        boolean registered = false;
        long expected = 30;

        long actual = service.calculate(amount, registered);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void shouldCalculateForNotRegisteredAndOverLimit() {
        BonusService service = new BonusService();

        long amount = 1_000_000;
        boolean registered = false;
        long expected = 500;

        long actual = service.calculate(amount, registered);

        Assertions.assertEquals(expected, actual);
    }
}
