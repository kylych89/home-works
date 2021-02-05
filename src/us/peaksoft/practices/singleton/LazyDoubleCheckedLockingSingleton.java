package us.peaksoft.practices.singleton;

/**
 * Created by Sayfullah on 05.02.2021.
 */
public class LazyDoubleCheckedLockingSingleton {

    private static volatile LazyDoubleCheckedLockingSingleton instance;

    private LazyDoubleCheckedLockingSingleton() {
    }

    public static LazyDoubleCheckedLockingSingleton getInstance() {


        return instance;
    }
}
