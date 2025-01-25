package SoftUni;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class FilterByAge_05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        Map<String, Integer> people = new LinkedHashMap<>();

        for (int i = 0; i < n; i++) {
            String[] input = sc.nextLine().split(",\\s+");
            String name = input[0];
            int age = Integer.parseInt(input[1]);
            people.put(name, age);
        }

        String condition = sc.nextLine();
        int age = Integer.parseInt(sc.nextLine());
        String format = sc.nextLine();

        Predicate<Map.Entry<String, Integer>> isAgeCorrect;

        if (condition.equals("younger")) {
            isAgeCorrect = entry -> entry.getValue() <= age;
        } else {
            isAgeCorrect = entry -> entry.getValue() >= age;
        }

        Consumer<Map.Entry<String, Integer>> print;
        if (format.equals("age")) {
            print = entry -> System.out.println(entry.getValue());
        } else if (format.equals("name")) {
            print = entry -> System.out.println(entry.getKey());
        } else {
            print = entry -> System.out.printf("%s - %d\n", entry.getKey(), entry.getValue());
        }

        people.entrySet().stream().filter(isAgeCorrect).forEach(print);
    }
}
