package app.app;

import java.util.ArrayList;
import java.util.Arrays;

public class Exercise01 {

    public static void main(String[] args) {
	// write your code here
        Exercise01 exercise01 = new Exercise01();
        String[] strings = {"john", "travolta", "john", "doe"};
        int vowels = exercise01.totalVowels(new ArrayList<>(Arrays.asList(strings)));
        System.out.println(vowels);
    }

    public int totalVowels(ArrayList<String> strings) {
        if (strings.isEmpty()) return 0;

        char[] vowels = {'A', 'E', 'I', 'O', 'U'};
        int totalVowels = 0;

        for (String s : strings) {
            for (int i = 0; i < s.length(); i++) {
                char current = s.toUpperCase().charAt(i);
                for (char c : vowels) {
                    if (current == c) {
                        totalVowels++;
                    }
                }
            }
        }
        return totalVowels;
    }
}
