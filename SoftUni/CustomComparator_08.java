package SoftUni;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class CustomComparator_08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer> numbers = Arrays.stream(sc.nextLine().split("\\s+")).map(Integer::parseInt).toList();

        Comparator<Integer> customComparator = ((first, second) -> {
            if (first % 2 == 0 && second % 2 != 0) {
                return -1;
            } else if (first % 2 != 0 && second % 2 == 0) {
                return 1;
            } else {
                return first.compareTo(second);
            }
        });


        numbers.stream().sorted(customComparator).forEach(num -> System.out.print(num + " "));


    }
}
