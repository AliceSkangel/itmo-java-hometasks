package hw3;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        // Тарелки, моющее средство
        int plates = 70;
        double fairy = 15;
        while (plates > 0 && fairy >= 0.5) {
            plates = plates - 1;
            fairy = fairy - 0.5;
            System.out.println("Остаток моющего средства: " + fairy);
        }
        System.out.println("Тарелки: " + plates + "/Моющее средство: " + fairy);

        // Вариант №2
        int plates1 = 49;
        double fairy1 = 60.7;
        while (plates1 > 0) {
            if (fairy1 < 0.5) break;
            plates1--;
            fairy1 -= 0.5;
            System.out.println("Остаток моющего средства: " + fairy1);
        }
        System.out.println("Тарелки: " + plates1 + "/Моющее средство: " + fairy1);

        // Вариант №3
        Scanner input = new Scanner(System.in);
        int plates2 = 0;
        double fairy2 = 0;
        while (plates2 <= 0 || fairy2 <= 0) {
            System.out.println ("Введите кол-во тарелок");
            plates2 = input.nextInt();
            System.out.println ("Введите кол-во моющего средства");
            fairy2 = input.nextDouble();
        }
        while (plates2 > 0 && fairy2 > 0) {
            plates2 = plates2 - 1;
            fairy2 = fairy2 - 0.5;
            System.out.println("Остаток моющего средства: " + fairy2);
        }
        System.out.println("Тарелки: " + plates2 + "/Моющее средство: " + fairy2);
    }
}
