package app.app;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Exercise06 {
    public static void main(String[] args) {
        Exercise06 exercise06 = new Exercise06();
        Integer[] integers = {-1, 1, 1, 3, 2, 5, 66, 69, 420, 666};
        int uniqueIntegers = exercise06.countUnique(Arrays.asList(integers));
        System.out.println(uniqueIntegers);
    }

    public int countUnique(List<Integer> list) {
        Set<Integer> uniqueIntegers = new HashSet<>(list);
        return uniqueIntegers.size();
    }
}
