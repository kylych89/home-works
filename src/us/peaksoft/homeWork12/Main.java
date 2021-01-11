package us.peaksoft.homeWork12;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Main {
    public static void main(String[] args) {

        Random random = new Random();

        List<Integer> numberList = new ArrayList<>();

        for (int i = 1; i < 100; i++) {
            numberList.add(random.nextInt(50) + 1);
        }

        System.out.println("1-100 арасындагы 50 рандомный сандар: " + numberList);

        List<Integer> integerList1 = numberList.subList(0, 49);
        List<Integer> integerList2 = numberList.subList(50, 99);
        System.out.println("Болунгон биринчи тизме: " + integerList1);
        System.out.println("Болунгон экинчи тизме: " + integerList2);


        for (int i = 0; i < integerList1.size(); i++) {
            if (integerList1.get(i) % 2 == 0) {
                System.out.println("Жуп сандар биринчи тизме: " + integerList1.get(i));
            }
        }
        System.out.println("________________");

        for (int i = 0; i < integerList2.size(); i++) {
            if (integerList2.get(i) % 3 == 0) {
                System.out.println("Так сандар экинчи тизме: " + integerList2.get(i));
            }
        }
    }
}
