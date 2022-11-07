package hw2;

public class Task5 {
    public static void main(String[] args) {
        int age = 20;
        int exp = 2;
        if (age > 100) System.out.println("Мы Вам перезвоним");
        else if (exp < 5) System.out.println("Вы подходите на должность стажера");
        else if (exp >= 5) System.out.println("Вы подходите на должность разработчика");
    }
    // Делать доп. проверку (age <= 100) не нужно,
    // потому что если age > 100, то мы остановимся на первом if
}
