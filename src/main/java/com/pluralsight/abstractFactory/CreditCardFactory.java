package main.java.com.pluralsight.abstractFactory;

// Abstract Factory
public abstract class CreditCardFactory {

    public static CreditCardFactory getCreditCardFactory(int creditScore){
        if(creditScore > 650){
            return new VisaFactory();
        }
        else{
            return new MasterCardFactory();
        }
    }

    public abstract CreditCard getCreditCard(CardType cardType);

    public abstract Validator getValidator(CardType cardType);
}
