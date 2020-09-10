package app.app;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Exercise13 {
    public static void main(String[] args) {
        Exercise13 exercise13 = new Exercise13();
        Map<String, String> strings = new HashMap<>() {
            {
                put("Marty", "Stepp");
                put("Stuart", "Reges");
                put("Jessica", "Miller");
                put("Bruce", "Willis");
                put("Hal", "Perkins");
            }
        };
        boolean result = exercise13.isUnique(strings);
        System.out.println(result);
    }

    public boolean isUnique(Map<String, String> stringMap) {
        Set<String> stringSet = new HashSet<>(stringMap.values());
        return stringMap.size() == stringSet.size();
    }
}
