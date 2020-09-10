package app.app;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Exercise12 {
    public static void main(String[] args) {
        Exercise12 exercise12 = new Exercise12();
        List<String> strings = new ArrayList<>() {
            {
                add("John");
                add("John");
                add("John");
                add("Java");
            }
        };
        boolean result = exercise12.contains3(strings);
        System.out.println("A string appears at least 3 times: " + result);
    }

    public boolean contains3(List<String> strings) {
        Map<String, Integer> stringMap = new HashMap<>();
        for (String s : strings) {
            if (!stringMap.containsKey(s)) {
                stringMap.put(s, 1);
            } else {
                int count = stringMap.get(s);
                stringMap.put(s, count + 1);
                if (stringMap.get(s) == 3) return true;
            }
        }
        return false;
    }
}
