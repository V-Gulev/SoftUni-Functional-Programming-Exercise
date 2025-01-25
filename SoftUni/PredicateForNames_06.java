package SoftUni;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class PredicateForNames_06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int length = Integer.parseInt(sc.nextLine());
        List<String> names = Arrays.stream(sc.nextLine().split("\\s+")).collect(Collectors.toList());
        Predicate<String> validLength = name -> name.length() > length;
        names.removeIf(validLength);
        names.forEach(System.out::println);

    }
}
