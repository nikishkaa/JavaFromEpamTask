package test2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        for(String str : args){
            System.out.printf(str);
        }

        Scanner scanner = new Scanner(System.in);

        String s = scanner.next();

        System.out.println(s);
    }
}
