import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        // task1
        int[] arr = generateRandomArray();
        int summa = 0;
        for (int c : arr) {
            summa = summa + c;
        }
        System.out.println("Сумма трат за месяц составила " + summa + " рублей");

        //task 2
        int min = 200_000;
        int max = 0;
        for (int c : arr) {
            if (c > max) max = c;
        }
        for (int c : arr) {
            if (c < min) min = c;
        }
        System.out.println("Максимальная сумма трат за день составила " + max + " рублей\n" +
                "Минимальная сумма трат за день составила " + min + " рублей");

        //task 3
        float cost = 0;
        for (int c : arr) {
            cost = cost + c;
        }
        float medium = cost / 30;
        System.out.println("Средняя сумма трат за месяц составила " + medium + " рублей");

        //task 4
        char[] reverseFullName = new char[]{'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int i = reverseFullName.length - 1; i >= 0; i--) {
            System.out.print(reverseFullName[i]);
        }
        System.out.println();

        //task 5
        int[][] twoDimArray = new int[3][3];
        for (int i = 0, n = 0, l = 0; l < 9; n++, l++) {
            if (n > 2) {
                n = 0;
                i++;
            }
            if (l % 2 == 0) twoDimArray[i][n] = 1;
        }
        for (int[] row : twoDimArray) {
            for (int column : row) {
                System.out.print(column + " ");
            }
            System.out.println();
        }

        //task 6
        int[] mas = new int[]{5, 4, 3, 2, 1};
        int[] mas2 = new int[5];
        for (int i = mas.length - 1, l = 0; i >= 0; i--, l++) {
            mas2[l] = mas[i];
        }
        System.out.println(Arrays.toString(mas));
        System.out.println(Arrays.toString(mas2));

        //task 7
        for (int i = 0, n = mas2.length - 1; i < 3; i++, n--) {
            int x = mas2[n];
            mas2[n] = mas2[i];
            mas2[i] = x;
        }
        System.out.println(Arrays.toString(mas2));

        //task 8
        int y = 0;
        int[] array = new int[]{-6, 2, 5, -8, 8, 10, 4, -7, 12, 1};
        for (int i = 0, n = 1; true; n++) {
            if (n == array.length - 1) {
                y = array[n] + array[i];
                if (y == -2) {
                    System.out.println(array[i] + " " + array[n]);
                    break;
                }
                i++;
                n = i + 1;
                y = array[n] + array[i];
                if (y == -2) {
                    System.out.println(array[i] + " " + array[n]);
                    break;
                }
            } else {
                y = array[n] + array[i];
                if (y == -2) {
                    System.out.println(array[i] + " " + array[n]);
                    break;
                }
            }
            if ((i == array.length - 2) && (n == array.length - 1)) break;
        }

        //task 9
        ArrayList<Integer> list = new ArrayList<>();
        int x = 0;
        int[] array1 = new int[]{-6, 2, 5, -8, 8, 10, 4, -7, 12, 1};
        for (int i = 0, n = 1; true; n++) {
            if (n == array1.length - 1) {
                x = array1[n] + array1[i];
                if (x == -2) {
                    list.add(array1[i]);
                    list.add(array1[n]);
                }
                i++;
                n = i + 1;
                x = array1[n] + array1[i];
                if (x == -2) {
                    list.add(array1[i]);
                    list.add(array1[n]);
                }
            } else {
                x = array1[n] + array1[i];
                if (x == -2) {
                    list.add(array1[i]);
                    list.add(array1[n]);
                }
            }
            if ((i == array1.length - 2) && (n == array1.length - 1)) break;
        }
        System.out.println(list);
    }


    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;
    }
}