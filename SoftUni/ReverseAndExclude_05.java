package SoftUni;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class ReverseAndExclude_05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer> numbers = Arrays.stream(sc.nextLine().split("\\s+")).map(Integer::parseInt).collect(Collectors.toList());
        int divider = Integer.parseInt(sc.nextLine());
        Predicate<Integer> isDividable = num -> num % divider == 0;
        Collections.reverse(numbers);
        numbers.removeIf(isDividable);
        numbers.forEach(num -> System.out.print(num + " "));

    }
}
