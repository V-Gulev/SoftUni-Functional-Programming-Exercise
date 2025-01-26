package SoftUni;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.function.BiPredicate;

public class ListOfPredicates_09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        List<Integer> numbers = Arrays.stream(sc.nextLine().split("\\s+")).map(Integer::parseInt).toList();
        BiPredicate<Integer, List<Integer>> isDivisible = (integer, integers) -> {
            for (Integer i : integers) {
                if (integer % i != 0) {
                    return false;
                }
            }
            return true;
        };

        for (int i = 1; i <= n; i++) {
            if (isDivisible.test(i, numbers)) {
                System.out.print(i + " ");
            }
        }

    }
}
