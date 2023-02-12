import jdk.nashorn.internal.objects.annotations.Getter;

public class Bank {
    protected String name;
    protected String currency;
    protected double balance;


    public Bank(String name, String currency, double balance) {
        this.currency = currency;
        this.balance = balance;
        this.name = name;
    }

    public Bank(String name, double balance) {
        this.balance = balance;
        this.name = name;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
