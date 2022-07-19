package main.java.com.pluralsight.abstractFactory;

public class AbstractFactoryDemo {
    public static void main(String[] args) {
//        CreditCardFactory abstractFactory = CreditCardFactory.getCreditCardFactory(824);
        CreditCardFactory abstractFactory = CreditCardFactory.getCreditCardFactory(600);

//        CreditCard creditCard = abstractFactory.getCreditCard(CardType.PLATINUM);
        CreditCard creditCard = abstractFactory.getCreditCard(CardType.GOLD);

        System.out.println(creditCard.getClass());
    }
}
