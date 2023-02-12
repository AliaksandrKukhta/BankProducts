import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DebitCardTests {

    DebitCard debitCard;

    @BeforeEach
    public void beforeEach() {
        debitCard = new DebitCard("Visa", 1255.0);
        debitCard = new DebitCard("Visa", "BYN", 1255.0);
    }

    @Test
    public void checkDebitCardName() {
        String name = "Visa";
        String actualName = debitCard.getName();
        assertEquals(name, actualName, "Expected name " + name + " not Equals with actual name " + actualName);
    }

    @Test
    public void checkDebitCardBalance() {
        double balance = 1255.0;
        double actualBalance = debitCard.getCardBalance(debitCard.name);
        assertEquals(balance, actualBalance, "Expected balance " + balance + " not Equals with actual balance "
                + actualBalance);
    }

    @Test
    public void setDebitCardBalance() {
        double balance = 410.0;
        debitCard.setBalance(410.0);
        double actualBalance = debitCard.getBalance();
        assertEquals(balance, actualBalance, "Expected balance " + balance + " not Equals with actual balance "
                + actualBalance);
    }

    @Test
    public void checkDebitCardWriteOff() {
        double balance = 0.0;
        String name = "";
        String currency = "";
        debitCard.writeOff("Visa", "BYN");
        String actualName = debitCard.getName();
        String actualCurrency = debitCard.getCurrency();
        double actualBalance = debitCard.getBalance();
        assertEquals(name, actualName, "Expected name " + name + " not Equals with actual name " + actualName);
        assertEquals(balance, actualBalance, "Expected balance " + balance + " not Equals with actual balance "
                + actualBalance);
        assertEquals(currency, actualCurrency, "Expected currency " + currency + " not Equals with actual currency "
                + actualCurrency);
    }

    @Test
    public void checkAddDebitCard(){
        String name = "VISA";
        String currency = "USD";
        double balance = 100.0;
        DebitCard debitCard1 = debitCard.add("VISA", "USD", 100.0);
        String actualName= debitCard1.getName();
        String actualCurrency = debitCard1.getCurrency();
        double actualBalance = debitCard1.getBalance();
        assertEquals(name, actualName, "Expected name " + name + " not Equals with actual name " + actualName);
        assertEquals(currency, actualCurrency, "Expected currency " + currency + " not Equals with actual currency "
                + actualCurrency);
        assertEquals(balance, actualBalance, "Expected balance " + balance + " not Equals with actual balance "
                + actualBalance);
    }
}
