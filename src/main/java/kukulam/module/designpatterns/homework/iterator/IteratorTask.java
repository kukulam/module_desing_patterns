package kukulam.module.designpatterns.homework.iterator;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class IteratorTask {

    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 5, -5, 231, 3);
        Iterator<Integer> iterator = numbers.iterator();
        while(iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
