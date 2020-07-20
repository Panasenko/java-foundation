package Lesson2;

import java.util.Scanner;

public class Interval {

    Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        Interval interval = new Interval();
        interval.start();
    }

    public void start() {

        System.out.println("Введите искомое число:");

        while (scanner.hasNext()) {

            if (!scanner.hasNextInt()) {
                System.out.println("Введено не число!");
                break;
            }

            getInterval(scanner.nextInt());
        }
    }

    private void getInterval(int number) {

        if (0 < number && number < 14) {
            System.out.println("Выбрано число: " + number + ". Данное число находится в промижутке 0 и 14");
        } else if (15 < number && number < 35) {
            System.out.println("Выбрано число: " + number + ". Данное число находится в промижутке 15 и 35");
        } else if (36 < number && number < 50) {
            System.out.println("Выбрано число: " + number + ". Данное число находится в промижутке 36 и 50");
        } else if (51 < number && number < 100) {
            System.out.println("Выбрано число: " + number + ". Данное число находится в промижутке 51 и 100");
        } else {
            System.out.println("Выбрано число: " + number + ". Данное число не входит в допустимые интервалы!");
        }
    }
}
