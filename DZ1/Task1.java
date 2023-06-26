package DZ1;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите значение n: ");
        int n = scanner.nextInt();

        int triangularNumber = calculateTriangularNumber(n);
        System.out.println("Треугольное число для n = " + n + " равно " + triangularNumber);

        long factorial = calculateFactorial(n);
        System.out.println("Факториал для n = " + n + " равен " + factorial);
    }

    private static int calculateTriangularNumber(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        return sum;
    }

    private static long calculateFactorial(int n) {
        long factorial = 1;
        for (int i = 1; i <= n; i++) {
            factorial *= i;
        }
        return factorial;
    }
}