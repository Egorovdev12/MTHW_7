import org.junit.Test;
import org.junit.jupiter.api.Assertions;

public class PaymentCalculationTests {

    private final int SUM = 1_000_000;
    private final int TERM = 2;
    private final double YEAR_PERCENT = 12.0;



    @Test
    public void totalPaymentTest() {

        double expectedResult = SUM * (1 + (YEAR_PERCENT * TERM / 100));
        var sut = new Bank(SUM, TERM, YEAR_PERCENT);

        final double actualResult = sut.calculateTotalPayment();

        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void monthlyPaymentTest() {

        double total = SUM * (1 + (YEAR_PERCENT * TERM / 100));
        var sut = new Bank(SUM, TERM, YEAR_PERCENT);
        double expectedResult = total / (TERM * 12);

        final double actualResult = sut.calculateMonthlyPayment();

        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void calculateOverpaymentTest() {

        double total = SUM * (1 + (YEAR_PERCENT * TERM / 100));
        var sut = new Bank(SUM, TERM, YEAR_PERCENT);
        double expectedResult = total - SUM;

        final double actualResult = sut.calculateOverpayment();

        Assertions.assertEquals(expectedResult, actualResult);
    }
}