package test3;

import java.util.Scanner;

public class Task3 {
    private static final Scanner SCANNER;

    static {
        SCANNER = new Scanner(System.in);
    }

    public static void main(String[] args) {
        String defaultPassword = "123456789";
        System.out.print("Enter your password: ");
        String userPassword = SCANNER.next();

        String msg = defaultPassword.equals(userPassword)?"password is walid":"password not walid";

        System.out.println(msg);

    }
}
