package SoftUni;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.stream.Collectors;

public class AppliedArithmetic_04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer> numbers = Arrays.stream(sc.nextLine().split("\\s+")).map(Integer::parseInt).collect(Collectors.toList());
        Function<Integer, Integer> add = num -> num + 1;
        Function<Integer, Integer> multiply = num -> num * 2;
        Function<Integer, Integer> subtract = num -> num - 1;

        Consumer<Integer> print = num -> System.out.print(num + " ");


        String input = sc.nextLine();

        while (!input.equals("end")) {
            switch (input) {
                case "add" -> numbers = numbers.stream().map(add).collect(Collectors.toList());
                case "multiply" -> numbers = numbers.stream().map(multiply).collect(Collectors.toList());
                case "subtract" -> numbers = numbers.stream().map(subtract).collect(Collectors.toList());
                case "print" -> {
                    numbers.forEach(print);
                    System.out.println();
                }
            }
            input = sc.nextLine();
        }


    }
}
