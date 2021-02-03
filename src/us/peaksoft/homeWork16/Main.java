package us.peaksoft.homeWork16;

import java.util.Arrays;
import java.util.List;

/**
 * Created by Alsalam on 01.02.2021.
 */

// 👍
public class Main {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(5, 3, 4, 1, 2);

        Integer maappedBy = list.stream()
                .reduce(0, (x, y) -> x + y / 2);
        System.out.println(maappedBy);
    }
}