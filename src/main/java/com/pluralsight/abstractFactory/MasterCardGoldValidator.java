package main.java.com.pluralsight.abstractFactory;

public class MasterCardGoldValidator implements Validator{
    @Override
    public boolean isValid(CreditCard creditCard) {
        return true;
    }
}
