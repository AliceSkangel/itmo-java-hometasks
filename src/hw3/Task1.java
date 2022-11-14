package hw3;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        // Необязательные задачи
        for (int a = 90; a >= 0; a -= 5) System.out.println(a);

        for (int b = 2; b <= 20; b += 2) System.out.println(b);

        // Сумма цифр целого числа
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Введите целое число");
        int number = keyboard.nextInt();
        int sum = 0;
        while (number != 0) {
            sum += number % 10;
            number /= 10;
        }
        System.out.println(sum);
    }
}
