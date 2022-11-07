package hw2;

public class Task4 {
    public static void main(String[] args) {
        // Метод Math.random()
        // диапазон [10; 500]
        int a = 10; // от
        int b = 500; // до

        int randomNumber = a + (int) (Math.random() * b); // генерация числа
        // интервал (25; 200)
        if (randomNumber > 25 && randomNumber < 200) {
            System.out.println("число " + randomNumber + " попало в интервал (25; 200)");
        }
        else {
            System.out.println("число " + randomNumber + " НЕ попало в интервал (25; 200)");
        }
    }
}