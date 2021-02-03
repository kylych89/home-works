package us.peaksoft.homeWork15;

/**
 * Created by Alsalam on 29.01.2021.
 */
public class Main {
    public static void main(String[] args) {

        Byte[] bArr = {1,2,3,4,5,6,7,8,9,10};
        getGenericArray(bArr);

        Short[] sArr = {1,2,3,4,5,6,7,8,9,10};
        getGenericArray(sArr);

        Integer[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9,10};
        getGenericArray(arr);

        Double[] dArr = {1.2,1.3,1.4,1.5,1.6,1.7,1.8,1.9,10.0};
        getGenericArray(dArr);

        Float[] fArr = {1.2f,1.3f,1.4f,1.5f,1.6f,1.7f,1.8f,1.9f,10.0f};
        getGenericArray(fArr);



    }

    static <T> T getGenericArray(T[]arr) {
        int sum = 0;
        int average;
        for (int i = 0; i < arr.length; i++) {
            sum += i;
        }
        average = sum / 2;
        System.out.println("Average is every array: "+average+" ");
        return (T) arr;
    }
}