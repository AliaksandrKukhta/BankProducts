public class DebitCard extends Bank implements IAdd, IGetBalance, IWriteOff {

    public DebitCard(String name,  double balance) {
        super(name, balance);
    }

    public DebitCard(String name,  String currency, double balance) {
        super(name, currency, balance);
    }

    @Override
    public DebitCard add(String name, String currency, double balance) {
       return new DebitCard(name, currency, balance);
    }

    @Override
    public double getCardBalance(String name) {
        return getBalance();
    }

    @Override
    public void writeOff(String name, String currency) {
        if (DebitCard.this.name.equals(name)) {
            setName("");
            setBalance(0.0);
            setCurrency("");
        }
    }
}
