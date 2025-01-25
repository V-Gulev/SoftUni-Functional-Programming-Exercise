package SoftUni;

import java.util.*;
import java.util.function.Predicate;

public class CountUppercaseWords_03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] words = sc.nextLine().split("\\s+");
        Predicate<String> isUppercaseWord = word -> Character.isUpperCase(word.charAt(0));
        List<String> uppercaseWords = new ArrayList<>();
        for (String word : words) {
            if (isUppercaseWord.test(word)) {
                uppercaseWords.add(word);
            }
        }
        System.out.println(uppercaseWords.size());
        uppercaseWords.forEach(System.out::println);


    }
}
