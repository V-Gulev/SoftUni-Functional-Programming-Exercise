package SoftUni;

import java.util.Arrays;
import java.util.Scanner;
import java.util.function.Function;

public class CustomMinFunction_03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numbers = Arrays.stream(sc.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();
        Function<int[], Integer> findMin = integers -> {
            return Arrays.stream(integers).min().orElse(0);
        };
        System.out.println(findMin.apply(numbers));


    }
}
