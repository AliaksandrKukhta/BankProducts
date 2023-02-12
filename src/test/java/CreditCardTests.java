import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CreditCardTests {

    CreditCard creditCard;

    @BeforeEach
    public void beforeEach() {
        creditCard = new CreditCard("Mir", 2580.0, 1.75);
    }

    @Test
    public void checkCreditCardName() {
        String name = "Mir";
        String actualName = creditCard.getName();
        assertEquals(name, actualName, "Expected name " + name + " not Equals with actual name " + actualName);
    }

    @Test
    public void checkCreditCardCurrency() {
        creditCard = new CreditCard("Mir", "BYN",2580.0, 1.75);
        String currency = "BYN";
        String actualCurrency = creditCard.getCurrency();
        assertEquals(currency, actualCurrency, "Expected currency " + currency + " not Equals with actual " +
                "currency " + actualCurrency);
    }

    @Test
    public void checkCreditCardBalance() {
        double balance = 2580.0;
        double actualBalance = creditCard.getCardBalance(creditCard.name);
        assertEquals(balance, actualBalance, "Expected balance " + balance + " not Equals with actual balance "
                + actualBalance);
    }

    @Test
    public void checkCreditCardInterestRate() {
        double interestRate = 1.75;
        double actualInterestRate = creditCard.getInterestRate();
        assertEquals(interestRate, actualInterestRate, "Expected interestRate " + interestRate +
                " not Equals with actual interestRate " + actualInterestRate);
    }

    @Test
    public void setCreditCardsInterestRate() {
        double interestRate = 1.72;
        creditCard.setInterestRate(1.72);
        double actualInterestRate =creditCard.getInterestRate();
        assertEquals(interestRate, actualInterestRate, "Expected interestRate " + interestRate + " not Equals with " +
                "actual interestRate " + actualInterestRate);
    }

    @Test
    public void checkCreditCardDebtRequest() {
        double debtRequest = 22.05;
        double actualDebtRequest =creditCard.getDebtRequest();
        assertEquals(debtRequest, actualDebtRequest, "Expected interestRate " + debtRequest + " not Equals with " +
                "actual debtRequest " + actualDebtRequest);
    }

    @Test
    public void checkDebitCardWriteOff() {
        double balance = 0.0;
        String name = "";
        creditCard.writeOff("Mir", "BYN");
        String actualName = creditCard.getName();
        double actualBalance = creditCard.getBalance();
        assertEquals(name, actualName, "Expected name " + name + " not Equals with actual name " + actualName);
        assertEquals(balance, actualBalance, "Expected balance " + balance + " not Equals with actual balance "
                + actualBalance);
    }

    @Test
    public void checkAddCreditCard(){
        String name = "Maestro";
        String currency = "CNY";
        double balance = 1010.0;
        CreditCard creditCard1 = creditCard.add("Maestro", "CNY", 1010.0);
        String actualName= creditCard1.getName();
        String actualCurrency = creditCard1.getCurrency();
        double actualBalance = creditCard1.getBalance();
        assertEquals(name, actualName, "Expected name " + name + " not Equals with actual name " + actualName);
        assertEquals(currency, actualCurrency, "Expected currency " + currency + " not Equals with actual currency "
                + actualCurrency);
        assertEquals(balance, actualBalance, "Expected balance " + balance + " not Equals with actual balance "
                + actualBalance);
    }

}
