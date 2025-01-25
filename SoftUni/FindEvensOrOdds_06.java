package SoftUni;

import java.util.Scanner;
import java.util.function.Predicate;

public class FindEvensOrOdds_06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] startEnd = sc.nextLine().split("\\s+");
        String type = sc.nextLine();
        Predicate<Integer> condition;
        if (type.equals("odd")) {
            condition = num -> num % 2 != 0;
        } else {
            condition = num -> num % 2 == 0;
        }
        printNumbers(startEnd, condition);


    }

    private static void printNumbers(String[] sizes, Predicate<Integer> condition) {
        int start = Integer.parseInt(sizes[0]);
        int end = Integer.parseInt(sizes[1]);

        for (int i = start; i <= end; i++) {
            if (condition.test(i)) {
                System.out.print(i + " ");
            }
        }


    }
}
