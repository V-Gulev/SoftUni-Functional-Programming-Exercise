package SoftUni;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.function.Consumer;

public class KnightsOfHonor_02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<String> names = Arrays.stream(sc.nextLine().split("\\s+")).toList();
        Consumer<String> printSir = name -> System.out.println("Sir " + name);
        names.forEach(printSir);


    }
}
