package DZ1;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double num1, num2;
        String operator;

        System.out.print("Введите первое число: ");
        num1 = scanner.nextDouble();

        System.out.print("Введите оператор (+, -, *, /): ");
        operator = scanner.next();

        System.out.print("Введите второе число: ");
        num2 = scanner.nextDouble();

        double result = 0;

        switch (operator) {
            case "+":
                result = num1 + num2;
                break;
            case "-":
                result = num1 - num2;
                break;
            case "*":
                result = num1 * num2;
                break;
            case "/":
                if (num2 != 0) {
                    result = num1 / num2;
                } else {
                    System.out.println("Ошибка: деление на ноль.");
                    return;
                }
                break;
            default:
                System.out.println("Ошибка: неверный оператор.");
                return;
        }

        System.out.println("Результат: " + result);
    }
}