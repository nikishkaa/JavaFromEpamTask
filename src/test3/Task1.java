package test3;

import java.util.Scanner;

public class Task1 {
    public static Scanner SCANNER;

    static {
        SCANNER = new Scanner(System.in);
    }

    public static void main(String[] args) {
        System.out.print("ВВедите имя: ");
        String name = SCANNER.nextLine();
        System.out.println("Hello " + name);
    }
}
