package main.java.com.pluralsight.abstractFactory;

public class MasterCardPlatinumValidator implements Validator {
    @Override
    public boolean isValid(CreditCard creditCard) {
        return true;
    }
}
