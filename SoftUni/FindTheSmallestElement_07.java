package SoftUni;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.function.Function;

public class FindTheSmallestElement_07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer> numbers = Arrays.stream(sc.nextLine().split("\\s+")).map(Integer::parseInt).toList();
        Function<List<Integer>, Integer> findMin = integers -> integers.lastIndexOf(Collections.min(integers));
        System.out.println(findMin.apply(numbers));

    }
}
