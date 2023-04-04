import java.util.Arrays;

public class Massives {
    public static void main(String[] args) {
        /*
        int a = 4;
        int b = 23;
        work5(a, b);
        work6();
        int[] arr = {1, 1, 1, 2, 1};
        int[] arr1 = {2, 2, 2, 1, 2, 2, 10, 1};
        System.out.print(checkBalance(arr1));
         */
        int a = 4;
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        displacement(arr, a);
    }

    public static void work1() {
        int[] arr = {0, 1, 1, 0, 0, 1, 1, 0, 1, 0};
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 1) {
                arr[i] = 0;
            } else arr[i] = 1;
        }
        System.out.println(Arrays.toString(arr));
    }

    public static void work2() {
        int[] arr = new int[100];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i + 1;
        }
        System.out.println(Arrays.toString(arr));
    }

    public static void work3() {
        int[] arr = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 6) {
                arr[i] *= 2;
            }
        }
        System.out.println(Arrays.toString(arr));
    }

    public static void work4() {
        int[][] arr = new int[5][5];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if ((i == j) || (i + j == 4)) {
                    arr[i][j] = 1;
                } else arr[i][j] = 0;
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void work5(int len, int initialValue) {
        int[] arr = new int[len];
        for (int i = 0; i < arr.length; i++) {// еще можно через метод Arrays.fill(arr, initialValue)
            arr[i] = initialValue;
        }
        System.out.println(Arrays.toString(arr));
    }

    public static void work6() {
        int[] arr = {4, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        int max = arr[0];
        int min = arr[0];
        for (int i : arr) {
            if (min > i) {
                min = i;
            }
            if (max < i) {
                max = i;
            }
        }
        System.out.println(Arrays.toString(arr));
        System.out.println("max = " + max);
        System.out.println("min = " + min);
    }

    public static boolean checkBalance(int[] input) {
        int sum = 0;
        for (int i : input) {
            sum += i;
        }
        int sumLeft = 0;
        for (int i : input) {
            sumLeft += i;
            if (sumLeft == (sum - sumLeft)) {
                return true;
            }
        }
        return false;
    }

    public static void displacement(int[] input, int n) {
        for (int j = 0; j < (n % input.length); j++) {
            for (int i = input.length; i  > 1; i--) {
                int buf = input[i % input.length];
                input[i % input.length] = input[i - 1];
                input[i - 1] = buf;
            }
        }
        System.out.println(Arrays.toString(input));
    }
}