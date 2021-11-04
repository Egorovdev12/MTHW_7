public class Main {

    public static void main(String[] args) {
        Bank bank = new Bank(70_000, 1, 18);
        System.out.println("TOTAL PAYMENT: " + bank.calculateTotalPayment());
        System.out.println("MONTHLY PAYMENT: " + bank.calculateMonthlyPayment());
        System.out.println("OVERPAYMENT: " + bank.calculateOverpayment());
    }
}