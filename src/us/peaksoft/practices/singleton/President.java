package us.peaksoft.practices.singleton;

/**
 * Created by Sayfullah on 05.02.2021.
 */
public class President {

    private static President INSTANCE =  new President();

    private President() {
    }

    public static President getINSTANCE() {
        return INSTANCE;
    }

    public void getPresidentName(){
        System.out.println("Tramp");
    }
}
