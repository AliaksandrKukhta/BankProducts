public class Deposit extends Bank implements ICloseDeposit, IAdd, IGetBalance {
    public Deposit(String name, String currency, double balance) {
        super(name, currency, balance);
    }

    @Override
    public void closeDeposit() {

    }

    @Override
    public Deposit add(String name, String currency, double balance) {
      return new Deposit(name, currency, balance);
    }

    @Override
    public double getCardBalance(String name) {
        if (Deposit.this.name.equals(name)) {
            return Deposit.this.getBalance();
        }
        return 0.0;
    }
}
