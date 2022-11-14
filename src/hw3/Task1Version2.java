package hw3;

import java.util.Scanner;

public class Task1Version2 {
    public static void main(String[] args) {
        // Задание 1 (сумма цифр числа), но с доработками
        Scanner keyboard = new Scanner(System.in);
        while (true) {
            System.out.println("Введите целое положительное число или 0 для выхода из программы");
            int number = keyboard.nextInt();
            int sum = 0;
            if (number == 0) {
                break;
            } else if (number < 0) {
                System.out.println("Отрицательные значения не допускаются!");
                continue;
            }
            while (number != 0) {
                sum += number % 10;
                number /= 10;
            }
            System.out.println(sum);
        }
    }
}
