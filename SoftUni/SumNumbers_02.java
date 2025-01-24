package SoftUni;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.function.Function;

public class SumNumbers_02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        Function<String, Integer> countNumbers = numberString -> {
            int count = (int) Arrays.stream(numberString.split(",\\s+"))
                    .mapToInt(Integer::parseInt)
                    .count();
            return count;
        };
        Function<String, Integer> sumNumbers = numberString -> {
            int sum = Arrays.stream(numberString.split(",\\s+"))
                    .mapToInt(Integer::parseInt)
                    .sum();
            return sum;
        };
        System.out.printf("Count = %d\n", countNumbers.apply(input));
        System.out.printf("Sum = %d", sumNumbers.apply(input));



    }
}
