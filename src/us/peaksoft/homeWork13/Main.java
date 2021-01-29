package us.peaksoft.homeWork13;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();

        List<Integer> list = getListRandom(random);

        showArrayList(list);

        Map<Integer, Integer> integerMap = getIntegerMap(list);

        showArrayMap(integerMap);

        //Practices

//        LoanAmount loanAmount = new LoanAmount();
//        loanAmount.loanAmount();
    }

    private static List<Integer> getListRandom(Random random) {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < 1000; i++) {
            list.add(random.nextInt(100) + 1);
        }
        return list;
    }

    private static void showArrayList(List<Integer> list) {
        System.out.print("[");
        for (int i = 0; i < list.size(); i++) {
            if (i > 0) {
                System.out.print(list.get(i) + ", ");
            }
        }
        System.out.print("]");
    }

    private static Map<Integer, Integer> getIntegerMap(List<Integer> list) {
        Map<Integer, Integer> integerMap = new HashMap<>();
        Integer value;
        for (Integer i : list) {
            value = integerMap.get(i);
            if (value==null){
                value=list.get(i);
            }else {
                value++;
            }
            integerMap.put(i,value);
        }
        return integerMap;
    }

    private static void showArrayMap(Map<Integer, Integer> integerMap) {
        for (Map.Entry<Integer, Integer> entry : integerMap.entrySet()) {
            System.out.println("\n Ключ-> " + entry.getKey() + " " + " Значение-> " + entry.getValue());
        }
    }
}