// Банк умеет только выдавать кредиты
public class Bank {

    private int sum;
    private int term;
    private double yearPercent;

    public Bank(int sum, int term, double yearPercent) {
        this.sum = sum;
        this.term = term;
        this.yearPercent = yearPercent;
    }

    public double calculateTotalPayment() {
        return sum * (1 + (yearPercent * term / 100));
    }

    public double calculateMonthlyPayment() {
       return calculateTotalPayment() / (term * 12);
    }

    public double calculateOverpayment() {
        return calculateTotalPayment() - sum;
    }
}