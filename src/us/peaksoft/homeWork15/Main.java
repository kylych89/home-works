package us.peaksoft.homeWork15;

/**
 * Created by Alsalam on 29.01.2021.
 */
public class Main {
    public static void main(String[] args) {

        int[]arr = {1,2,3,4,5,6,7,8,9};
        getGenericArray(arr);

    }

    static <T> T getGenericArray(int[] arr){

        int sum=0;
        int average;
        for (int i = 0; i < arr.length; i++) {
            sum+=arr[i];
        }
        average = sum/arr.length;
        System.out.println(average);

        return null;
    }
}
