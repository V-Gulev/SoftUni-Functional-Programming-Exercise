package SoftUni;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.function.UnaryOperator;

public class AddVAT_04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        UnaryOperator<Double> addVAT = d1 -> d1 += d1 * 0.2;
        List<Double> prices = Arrays.stream(sc.nextLine().split(",\\s+"))
                .map(Double::parseDouble)
                .map(addVAT)
                .toList();
        System.out.println("Prices with VAT:");
        prices.forEach(d -> System.out.printf("%.2f\n",d));
    }
}
