package us.peaksoft.homeWork13;

import us.peaksoft.practices.LoanAmount;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        int value;
        int count = 0;
        Random random = new Random();

        List<Integer> list = new ArrayList<>();
        Map<Integer, Integer> integerMap = new HashMap<>();

        for (int i = 0; i < 1000; i++) {
            list.add(random.nextInt(100) + 1);
            value = integerMap.getOrDefault(list.get(i), 0) + 1;
            integerMap.put(list.get(i), value);
        }

        for (Integer val : integerMap.values()) {
            if (val > 1) {
                count++;
            }
        }

        System.out.println("1000 случайных чисел от 0 до 100 ->");
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + " ");
        }

        System.out.println();
        System.out.println("размер-> " + list.size());


        for (Map.Entry<Integer, Integer> entry : integerMap.entrySet()) {
            System.out.println(" Ключ-> " + entry.getKey() + " " + " Значение-> " + entry.getValue());
        }
        System.out.print("количество значений которые встречаются чаще одного раза->" + count);

        System.out.println("\n________________________________________");

        //Practices

        LoanAmount loanAmount = new LoanAmount();
        loanAmount.loanAmount();
    }
}