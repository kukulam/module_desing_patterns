package kukulam.module.designpatterns.homework.comparator;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class ComparatorTask {

    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 5, -5, 231, 3);
        List<Integer> sortedNumber = numbers.stream()
                .sorted(Comparator.naturalOrder())
                .collect(Collectors.toList());
        System.out.println(sortedNumber);
    }
}
