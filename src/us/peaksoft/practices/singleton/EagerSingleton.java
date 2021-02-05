package us.peaksoft.practices.singleton;

/**
 * Created by Sayfullah on 05.02.2021.
 */
public class EagerSingleton {

    private static EagerSingleton INSTANCE = new EagerSingleton();
    private EagerSingleton(){
        System.out.println("Ok");
    }

    public static EagerSingleton getINSTANCE() {
        return INSTANCE;
    }

    public static void connect(){
        System.out.println("Connecting...");
    }
}
