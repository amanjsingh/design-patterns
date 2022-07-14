package main.java.com.pluralsight.singleton;

public class DbSingleton {
//    Eager Loading
//    private static DbSingleton instance = new DbSingleton();

//    Lazy Loading
//    private static DbSingleton instance = null;

    //    Thread Safe
    private static volatile DbSingleton instance = null;

    private DbSingleton() {
//        Protect instantiation through reflection
        if(instance != null){
            throw new RuntimeException("Use getInstance() method to create");
        }
    }

    public static DbSingleton getInstance() {
        if (instance == null) {
            synchronized (DbSingleton.class) {
                if (instance == null) {
                    instance = new DbSingleton();
                }
            }
        }
        return instance;
    }
}
