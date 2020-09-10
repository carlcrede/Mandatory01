package app.app;

import java.util.HashSet;
import java.util.Set;

public class Exercise10 {
    public static void main(String[] args) {
        Exercise10 exercise10 = new Exercise10();
        Set<String> strings = new HashSet<>() {
            {
                add("Odd");
                add("Equal");
                add("Unknown");
                add("java");
            }
        };
        System.out.println("Set before removing odds: " + strings);
        exercise10.removeOddLength(strings);
        System.out.println("Set after removing odds: " + strings);
    }

    public void removeOddLength(Set<String> strings) {
        strings.removeIf(e -> e.length() % 2 != 0);
    }
}
