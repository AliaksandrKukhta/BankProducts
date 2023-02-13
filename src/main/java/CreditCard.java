import interfaces.IAdd;
import interfaces.IGetBalance;
import interfaces.IWriteOff;

public class CreditCard extends Bank implements IAdd, IGetBalance, IWriteOff {

    private double interestRate;

    public CreditCard(String name, double balance, double interestRate) {
        super(name, balance);
        this.interestRate = interestRate;
    }

    public CreditCard(String name, String currency, double balance, double interestRate) {
        super(name, currency, balance);
        this.interestRate = interestRate;
    }

    public CreditCard(String name, String currency, double balance) {
        super(name, currency, balance);
    }

    public double getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(double interestRate) {
        this.interestRate = interestRate;
    }

    public double getDebtRequest() {
        double debtRequest = 22.05;
        return debtRequest;
    }

    @Override
    public CreditCard add(String name, String currency, double balance) {
        return new CreditCard(name, currency, balance);
    }

    @Override
    public double getCardBalance(String name) {
        return getBalance();
    }

    @Override
    public void writeOff(String name, String currency) {
        if (CreditCard.this.name.equals(name)) {
            setName("");
            setBalance(0.0);
            setCurrency("");
        }
    }

}
