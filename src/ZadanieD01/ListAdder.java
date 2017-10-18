package ZadanieD01;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ListAdder {


    public static void main(String[] args) {


        List<Integer> list = new ArrayList<>();

        addANumbers(list);
        listNumbers(list);
        countNumbers(list);
        displayMinAndMax(list);


    }

    private static void displayMinAndMax(List<Integer> list) {
        int min = 999999999, max = 0;
        System.out.println();
        for (Integer number : list) {
            if (number < min) {
                min = number;
            }
            if (number > max) {
                max = number;
            }
        }
        System.out.println("Min: " + min + ", max: " + max);
    }

    private static void countNumbers(List<Integer> list) {
        int sum = 0;

        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i));
            sum += list.get(i);
            if (i != list.size() - 1) {
                System.out.print("+");
            }
        }
        System.out.print("=" + sum);
    }


    private static void listNumbers(List<Integer> list) {

        for (int i = list.size() - 1; i >= 0; i--) {
            System.out.println(list.get(i));
        }
        System.out.println();
    }

    private static void addANumbers(List<Integer> list) {
        int number = 0;
        Scanner scanner = new Scanner(System.in);
        while (number >= 0) {
            System.out.println("Podaj liczbe większą od zera");
            number = scanner.nextInt();
            if (number >= 0) {
                list.add(number);
            }

        }
        System.out.println("Podales liczbe mniejsza od zera");
    }
}
