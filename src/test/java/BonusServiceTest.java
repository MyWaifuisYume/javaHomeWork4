import static org.junit.jupiter.api.Assertions.*;

public class BonusServiceTest {
    @org.junit.jupiter.api.Test
    void shouldCalculateForRegisteredAndUnderLimit() {
        BonusServise servise = new BonusServise();

        long amount = 1000;
        boolean registered = true;
        long expected = 30;

        long actual = servise.calculate(amount, registered);

        assertEquals(expected, actual);
    }

    @org.junit.jupiter.api.Test
    void shouldCalculateForRegisteredAndOverLimit() {
        BonusServise servise = new BonusServise();

        long amount = 1_000_000;
        boolean registered = true;
        long expected = 500;

        long actual = servise.calculate(amount, registered);

        assertEquals(expected, actual);
    }

    @org.junit.jupiter.api.Test
    void shouldCalculateNotRegisteredAndUnderLimit() {
        BonusServise servise = new BonusServise();

        long amount = 1000;
        boolean registered = false;
        long expected = 10;

        long actual = servise.calculate(amount, registered);

        assertEquals(expected, actual);
    }

    @org.junit.jupiter.api.Test
    void shouldCalculateNotRegisteredAndOverLimit() {
        BonusServise servise = new BonusServise();

        long amount = 1_000_000;
        boolean registered = false;
        long expected = 500;

        long actual = servise.calculate(amount, registered);

        assertEquals(expected, actual);
    }
}
