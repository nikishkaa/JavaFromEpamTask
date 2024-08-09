package paragraph2.task1;

public class Main {
    public static void main(String[] args) {
        int[] array = {123, 9999, 10, 5, 23, 10};

        int longNum = array[0];
        int shortNum = array[0];

        int longNumLength = Integer.MIN_VALUE;
        int shortNumLength = Integer.MAX_VALUE;

        for (int i = 0, t; i < array.length; i++) {

            t = getNumLength(array[i]);

            if (t > longNumLength) {
                longNumLength = t;
                longNum = array[i];
            }

            if (t < shortNumLength) {
                shortNumLength = t;
                shortNum = array[i];
            }
        }


        System.out.println(getUserUI(longNum, shortNum, longNumLength, shortNumLength));
    }

    public static int getNumLength(int num) {
        if (num < 0) {
            num *= -1;
        }

        if (num == 0) {
            return 1;
        }

        int count = 0;

        while (num > 0) {
            num /= 10;
            count++;
        }

        return count;
    }

    public static String getUserUI(int longNum, int shortNum, int longNumLength, int shortNumLength) {
        StringBuilder builder = new StringBuilder();

        builder.append("Long number: ").append(longNum).append(". His length is: ").append(longNumLength).append("\n");
        builder.append("Short number: ").append(shortNum).append(". His length is: ").append(shortNumLength).append("\n");


        return builder.toString();
    }

}
