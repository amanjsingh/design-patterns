package main.java.com.pluralsight.builder;

public class LunchOrderDemo {
    public static void main(String[] args) {
        LunchOrder.Builder builder = new LunchOrder.Builder();
        builder.bread("Wheat")
                .condiments("Lettuce")
                .dressing("Mustard")
                .meat("Ham");

        LunchOrder order = builder.build();

        System.out.println(order.getBread());
        System.out.println(order.getCondiments());
        System.out.println(order.getDressing());
        System.out.println(order.getMeat());
    }
}
