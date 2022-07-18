package main.java.com.pluralsight.factory;

import java.util.ArrayList;
import java.util.List;

public abstract class Website {

    public abstract void createWebsite();

    protected List<Page> pages = new ArrayList<>();

    public Website() {
        this.createWebsite();
    }

    public List<Page> getPages() {
        return pages;
    }


}
