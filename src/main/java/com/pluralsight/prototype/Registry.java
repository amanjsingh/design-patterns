package main.java.com.pluralsight.prototype;

import java.util.HashMap;
import java.util.Map;

public class Registry {
    private Map<String,Item> itemsMap = new HashMap<>();

    public Registry() {
        loadItems();
    }

//    Heart and Soul of Prototype
    public Item createItem(String type){
        Item item = null;
        try{
            item = (Item)itemsMap.get(type).clone();
        }
        catch (CloneNotSupportedException exception){
            exception.printStackTrace();
        }

        return item;
    }

    private void loadItems(){
        Movie movie = new Movie();
        movie.setTitle("Lightyear");
        movie.setPrice(249);
        movie.setRuntime("2.5 hours");
        movie.setUrl("primevideo.com");
        itemsMap.put("Movie",movie);

        Book book = new Book();
        book.setTitle("The Terminal List");
        book.setPrice(499);
        book.setNumberOfPages(637);
        book.setUrl("kindle.com");
        itemsMap.put("Book",book);
    }
}
