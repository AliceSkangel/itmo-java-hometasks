package hw3;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        // Диапазон [2; 100]
        int a = 2; // от
        int b = 101; // до (100)
        int puzzle;
        Scanner scanner = new Scanner(System.in);
        // 0 - НЕТ, 1 - ДА
        while (true) {
            puzzle = (a + b) / 2; // 51
            System.out.println("Число равно " + puzzle + "?");
            int response = scanner.nextInt(); // ответ пользователя
            if (response == 1) {
                System.out.println("Ура!");
                break;
            }
            System.out.println("Число больше " + puzzle + "?");
            response = scanner.nextInt(); // ответ пользователя
            if (response == 1) /* ДА */ a = puzzle;
            else if (response == 0) /* НЕТ */ b = puzzle;
        }
    }
}
