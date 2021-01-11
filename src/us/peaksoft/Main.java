package us.peaksoft;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

/**
 * Created by Sydykov Kylych 21.12.2020
 * for home works!!!
 */
public class Main {
    public static void main(String[] args) {
        List<Integer> listEven = new ArrayList<>();
        List <Integer> listOdd = new ArrayList<>();
        int[] randomNum = new int[50];
        fillArrayWithRnd(randomNum);
        System.out.println("Array with random nums:");
        showElementsOfArray(randomNum);
        System.out.println();
        devideToEvenOdd(listEven, listOdd, randomNum);
        System.out.println("\nArray with EVEN nums: ");
        showFilledLists(listEven);
        System.out.println();
        System.out.println("\nArray with ODD nums: ");
        showFilledLists(listOdd);
    }
    private static void showFilledLists(List<Integer> listEven) {
        int count = 0;
        for (int n: listEven) {
            count++;
            System.out.print(count + "-[" + n + "]; ");
        }
    }
    private static void devideToEvenOdd(List<Integer> listEven, List<Integer> listOdd, int[] randomNum) {
        for(int i = 0; i < randomNum.length; i++) {
            if(randomNum[i]%2 == 0) {
                listEven.add(randomNum[i]);
            } else {
                listOdd.add(randomNum[i]);
            }
        }
    }
    private static void fillArrayWithRnd(int[] randomNum) {
        Random random = new Random();
        for (int i = 0; i < randomNum.length; i++) {
            randomNum[i] = random.nextInt(100) + 1;
        }
    }
    private static void showElementsOfArray(int[] randomNum) {
        int count = 0;
        for (int num: randomNum) {
            count++;
            System.out.print(count + "-[" + num + "]; ");
        }
    }
}