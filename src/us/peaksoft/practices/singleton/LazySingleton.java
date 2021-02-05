package us.peaksoft.practices.singleton;

/**
 * Created by Sayfullah on 05.02.2021.
 */
public class LazySingleton {
    private static LazySingleton instance;

    private LazySingleton() {
    }

    public static synchronized LazySingleton getInstance(){
        if (instance==null){
            instance= new LazySingleton();
        }
        return instance;
    }
}
