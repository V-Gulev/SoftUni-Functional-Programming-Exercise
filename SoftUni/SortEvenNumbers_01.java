package SoftUni;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class SortEvenNumbers_01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer> numbers = Arrays.stream(sc.nextLine().split(",\\s+")).map(Integer::parseInt).filter(num -> num % 2 == 0).toList();
        System.out.println(numbers.toString().replaceAll("\\[", "").replaceAll("]", ""));
        List<Integer> sortedNumbers = numbers.stream().sorted(Comparator.naturalOrder()).toList();
        System.out.println(sortedNumbers.toString().replaceAll("\\[", "").replaceAll("]", ""));


    }
}
