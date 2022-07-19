package main.java.com.pluralsight.abstractFactory;

public class MasterCardFactory extends CreditCardFactory {

    @Override
    public CreditCard getCreditCard(CardType cardType) {
        switch (cardType){
            case GOLD -> {
                return new MasterCardGoldCreditCard();
            }
            case PLATINUM -> {
                return new MasterCardPlatinumCreditCard();
            }
            default -> {
                return null;
            }
        }
    }

    @Override
    public Validator getValidator(CardType cardType) {
        switch (cardType){
            case GOLD -> {
                return new MasterCardGoldValidator();
            }
            case PLATINUM -> {
                return new MasterCardPlatinumValidator();
            }
            default -> {
                return null;
            }
        }
    }
}
