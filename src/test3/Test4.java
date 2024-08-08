package test3;

import java.math.BigDecimal;
import java.util.Arrays;

public class Test4 {

    public static void main(String[] args) {

        Float a = (float) 23;

        BigDecimal b1 = new BigDecimal("0.00000000000001");
        BigDecimal b2 = new BigDecimal("0.00000000000002");

//        String[] array[][] = new String[1][1][2];

        boolean res = b1.equals(b2);

        System.out.println(res);

        for (int x = 0; x < 1; x++) {
            System.out.print(x);
            System.out.print(x);
        }


        fsiooDFsdf:
        while (true) {
            break fsiooDFsdf;
        }

        System.out.println("\n\n");
        int[] test= new int[]{1,2,3,4,5,6,7,8,9};
        System.out.println(Arrays.binarySearch(test, 4)); // возращает true или false

        System.out.println("\n");
        Arrays.sort(test);
    }
}
