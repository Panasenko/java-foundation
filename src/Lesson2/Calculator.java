package Lesson2;
import java.util.Scanner;

public class Calculator {

    Scanner sc = new Scanner(System.in);

    int result;
    String err = "";

    public static void main(String[] args) {
        Calculator calc = new Calculator();
        calc.start();
    }

    public void start() {
        int operand1 = getOperand("Введите первое число:");
        String sign = getSign("Введите операцию:");
        int operand2 = getOperand("Введите второе число:");
        calculate(operand1, sign, operand2);

        if (err.equals("")) {
            System.out.println("Результат операции: " + operand1 + " " + sign + " " + operand2 + " = " + result);
        } else {
            System.out.println(err);
        }
    }

    public int getOperand(String userText) {
        System.out.println(userText);
        return sc.nextInt();
    }

    public String getSign(String userText) {
        System.out.println(userText);
        return sc.next();
    }

    public void calculate(int operand1, String sign, int operand2) {

        switch (sign) {
            case "/":

                if (operand2 == 0) {
                    err = "Ошибка! Попытка деления на ноль";
                    break;
                }
                result = operand1 / operand2;
                break;
            case "-":
                result = operand1 - operand2;
                break;
            case "+":
                result = operand1 + operand2;
                break;
            case "*":
                result = operand1 * operand2;
                break;
            default:
                err = "Ошибка! Операция не распознана";
        }
    }


}
