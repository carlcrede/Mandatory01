package app.app;

import java.util.HashSet;
import java.util.Set;

public class Exercise08 {
    public static void main(String[] args) {
        Exercise08 exercise08 = new Exercise08();
        Set<String> strings = new HashSet<>() {
            {
                add("Pizza");
                add("Linux");
                add("Hygge");
                add("Java");
            }
        };
        int result = exercise08.minLength(strings);
        System.out.println(result);
    }

    public int minLength(Set<String> strings) {
        if (strings.isEmpty()) return 0;
        int minLength = Integer.MAX_VALUE;
        for (String s : strings) {
            if (s.length() < minLength) {
                minLength = s.length();
            }
        }
        return minLength;
    }
}
