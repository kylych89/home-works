package us.peaksoft.homeWork16;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Created by Alsalam on 01.02.2021.
 */

// 👍
public class Main {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(5, 3, 4, 1, 2);

        // листтин элементтердин суммасын таап листти чыгаруу
        Integer findSumOfList = list.stream()
                .reduce(0, (x, y) -> x + y);
        System.out.println("Sum found is-> " + findSumOfList);

        // орточо арифметикалык санын таап листти чыгаруу
        Double average = list.stream()
                .mapToDouble(x -> x)
                .average()
                .getAsDouble();
        System.out.println("Average found is-> " + average);


        // канча жолу кайталанган листти чыгаруу
        Long count = list.stream()
                .count();
        System.out.println("Count-> " + count);

        // сорттолгон листти чыгаруу
        List<Integer> sortedList= list.stream()
                .sorted()
                .collect(Collectors.toList());
        System.out.println(sortedList);

    }
}