package paragraph2.task2;

public class Main {
    public static void main(String[] args) {
        int[] array = new int[]{10, 234, 9, -10, 45678, 4};


        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < array.length - i - 1; j++) {
                if (getNumLength(array[j]) > getNumLength(array[j + 1])) {
                    int t = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = t;
                }
            }


        }

        System.out.println(getUserUI(array));
    }

    public static int getNumLength(int num) {
        if (num < 0) {
            num *= -1;
        }

        if (num == 0) {
            return 1;
        }

        int length = 1;

        while (num > 0) {
            num /= 10;
            length++;
        }

        return length;
    }


    public static String getUserUI(int[] array) {
        StringBuilder builder = new StringBuilder();
        builder.append("Numbers sort by min -> max length: ");

        for (int j : array) {
            builder.append(j);
            builder.append(" ");
        }


        return builder.toString();
    }
}
