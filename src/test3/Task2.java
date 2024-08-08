package test3;

import java.util.Random;
import java.util.Scanner;

public class Task2 {
    private static final Scanner SCANNER;

    static {
        SCANNER = new Scanner(System.in);
    }

    public static void main(String[] args) {
        System.out.print("Введите количство чисел: ");
        int num = SCANNER.nextInt();
        for (int i = 0; i < num; i++) {
            Random random = new Random();
            System.out.print(random.nextInt() + " ");
        }


    }
}
