package kukulam.module.designpatterns.homework.decorator;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class DecoratorTask {

    public static void main(String[] args) {
        List<Integer> numbers = Stream.of(1, 5, -5, 231, 3).collect(Collectors.toList());
        numbers.add(10);
        numbers = Collections.unmodifiableList(numbers);
        try {
            numbers.add(11);
        } catch (UnsupportedOperationException e) {
            System.out.println("Cannot add number to immutable list");
        }
    }
}
