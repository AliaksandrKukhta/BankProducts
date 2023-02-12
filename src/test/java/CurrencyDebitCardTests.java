import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CurrencyDebitCardTests {

    CurrencyDebitCard currencyDebitCard;

    @BeforeEach
    public void beforeEach() {
        currencyDebitCard = new CurrencyDebitCard("MasterCard", "AED",3015.0);
    }

    @Test
    public void checkCurrencyDebitCardName() {
        String name = "MasterCard";
        String actualName = currencyDebitCard.getName();
        assertEquals(name, actualName, "Expected name " + name + " not Equals with actual name " + actualName);
    }

    @Test
    public void checkCurrencyDebitCardCurrency() {
        String currency = "AED";
        String actualCurrency = currencyDebitCard.getCurrency();
        assertEquals(currency, actualCurrency, "Expected currency " + currency + " not Equals with actual " +
                "currency " + actualCurrency);
    }

    @Test
    public void checkCurrencyDebitCardBalance() {
        double balance = 3015.0;
        double actualBalance = currencyDebitCard.getCardBalance(currencyDebitCard.name);
        assertEquals(balance, actualBalance, "Expected balance " + balance + " not Equals with actual balance "
                + actualBalance);
    }
}
