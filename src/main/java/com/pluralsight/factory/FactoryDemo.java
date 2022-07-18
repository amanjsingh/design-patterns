package main.java.com.pluralsight.factory;

public class FactoryDemo {
    public static void main(String[] args) {
        Website bloggingSite = WebsiteFactory.getWebsite(WebsiteType.BLOG);
        System.out.println(bloggingSite.getPages());

        Website shoppingSite = WebsiteFactory.getWebsite(WebsiteType.SHOP);
        System.out.println(shoppingSite.getPages());
    }
}
