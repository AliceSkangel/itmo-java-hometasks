package hw3;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        // Диапазон [1; 9]
        int a = 1;
        int b = 9;
        int randomNumber = a + (int) (Math.random() * b);
        Scanner input = new Scanner(System.in);
        while (true) {
            System.out.println("Введите целое число от 1 до 9, либо 0 для выхода из программы");
            int userNumber = input.nextInt();

            if (userNumber == 0) {
                System.out.println("Вы вышли из программы");
                break;
            }
            if (userNumber == randomNumber) {
                System.out.println("Вы угадали!");
                break;
            } else if (userNumber > randomNumber) {
                System.out.println("Загаданное число больше");
            } else {
                System.out.println("Загаданное число меньше");
            }
        }
    }
}
