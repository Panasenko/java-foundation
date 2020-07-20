package Lesson3;

import java.util.Random;
import java.util.Scanner;

public class Bingo {
    Scanner scanner = new Scanner(System.in);
    int unknownNumber;
    int range;
    int attempt;

    public static void main(String[] args) {
        Bingo bingo = new Bingo();
        bingo.start();
    }

    public void start() {
        System.out.println("Выберете максимальное число из диапазона:");
        if (scanner.hasNextInt()) {
            range = scanner.nextInt();
            unknownNumber = initGame(range);
            startGame();
        } else {
            System.out.println("Введено не число. Выход!");
        }
    }

    private int initGame(int range) {
        Random random = new Random();
        return random.nextInt(range + 1);
    }

    private void startGame() {
        System.out.println("Введите загаданное число:");

        while (scanner.hasNext()) {
            attempt++;

            if (scanner.hasNext("exit")) {
                exitGame();
                break;
            }

            if (scanner.hasNextInt()) {

                int userNumber = scanner.nextInt();

                if (unknownNumber == userNumber) {
                    System.out.println("Bingo! Число " + userNumber + " угадано за " + attempt + " попыток!");
                    break;
                }

                if (range < userNumber) {
                    System.out.println("Введенное число больше загаданного диапазона. Загаданное число в диапазоне от 0 до " + range + "!");
                } else if (unknownNumber < userNumber) {
                    System.out.println("Введенное число больше загаданного. Попробуйте еще раз:");
                } else {
                    System.out.println("Введенное число меньше загаданного. Попробуйте еще раз:");
                }
            }
        }
    }

    private void exitGame() {
        System.out.println("Game over!");
        scanner.close();
    }
}
