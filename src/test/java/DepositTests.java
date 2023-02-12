import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DepositTests {

    Deposit deposit;

    @BeforeEach
    public void beforeEach() {
        deposit = new Deposit("Short", "USD",530.0);
    }

    @Test
    public void checkDepositName() {
        String name = "Short";
        String actualName = deposit.getName();
        assertEquals(name, actualName, "Expected name " + name + " not Equals with actual name " + actualName);
    }

    @Test
    public void checkDepositCurrency() {
        String currency = "USD";
        String actualCurrency = deposit.getCurrency();
        assertEquals(currency, actualCurrency, "Expected currency " + currency + " not Equals with actual currency "
                + actualCurrency);
    }

    @Test
    public void checkDepositBalance() {
        double balance = 530.0;
        double actualBalance = deposit.getCardBalance(deposit.name);
        assertEquals(balance, actualBalance, "Expected balance " + balance + " not Equals with actual balance "
                + actualBalance);
    }

    @Test
    public void checkDepositNullBalance() {
        double balance = 0.0;
        double actualBalance = deposit.getCardBalance("");
        assertEquals(balance, actualBalance, "Expected balance " + balance + " not Equals with actual balance "
                + actualBalance);
    }

    @Test
    public void setDepositBalance() {
        double balance = 410.0;
        deposit.setBalance(410.0);
        double actualBalance =deposit.getBalance();
                assertEquals(balance, actualBalance, "Expected balance " + balance + " not Equals with actual balance "
                + actualBalance);
    }

    @Test
    public void checkAddDeposit(){
        String name = "SuperShort";
        String currency = "EUR";
        double balance = 1000.0;
        Deposit deposit1 = deposit.add("SuperShort", "EUR", 1000.0);
        String actualName= deposit1.getName();
        String actualCurrency = deposit1.getCurrency();
        double actualBalance = deposit1.getBalance();
        assertEquals(name, actualName, "Expected name " + name + " not Equals with actual name " + actualName);
        assertEquals(currency, actualCurrency, "Expected currency " + currency + " not Equals with actual currency "
                + actualCurrency);
        assertEquals(balance, actualBalance, "Expected balance " + balance + " not Equals with actual balance "
                + actualBalance);
    }
}
