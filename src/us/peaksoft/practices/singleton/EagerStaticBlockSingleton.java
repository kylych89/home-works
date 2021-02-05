package us.peaksoft.practices.singleton;

/**
 * Created by Sayfullah on 05.02.2021.
 */
public class EagerStaticBlockSingleton {
    private static EagerStaticBlockSingleton instance;

    public static void connect(){
        System.out.println("Connecting...");
    }

    private EagerStaticBlockSingleton() {
    }

    static {
        try {
            instance = new EagerStaticBlockSingleton();
        }catch (Exception e){
            e.printStackTrace();
            System.out.println(e.getMessage());
        }
    }


    public static EagerStaticBlockSingleton getInstance() {
        return instance;
    }
}
