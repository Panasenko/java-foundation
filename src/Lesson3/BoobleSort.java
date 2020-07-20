package Lesson3;

import java.util.Scanner;

public class BoobleSort {

    int[] array = new int[10];
    Boolean isSorted = false;
    Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        BoobleSort boobleSort = new BoobleSort();
        boobleSort.start();

    }

    private void start() {
        setNumbersToArray();
    }

    private void setNumbersToArray() {

        for (int item = 0; item < array.length; item++) {
            System.out.println("Введите число:");

            if (scanner.hasNextInt()) {
                array[item] = scanner.nextInt();
            } else {
                System.out.println("Введено не число");
                break;
            }
        }

        sortedToArray(array);
    }

    private void sortedToArray(int[] array) {
        while (!isSorted) {
            int change = 0;

            for (int item = 0; item < (array.length - 1); item++) {

                if (array[item] > array[item + 1]) {
                    int tmp = array[item];
                    array[item] = array[item + 1];
                    array[item + 1] = tmp;
                    change++;
                }
            }

            if (change == 0) {
                isSorted = true;
            }
        }
        buildStringFromArray(array);
    }


    private void buildStringFromArray(int[] array) {
        String str = "";
        for (int i : array) {
            str += i + ",";
        }

        System.out.println(str);
    }
}
