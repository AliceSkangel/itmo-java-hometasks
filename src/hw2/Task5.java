package hw2;

public class Task5 {
    public static void main(String[] args) {
        int age = 20;
        int exp = 2;
        if (age > 100) System.out.println("Мы Вам перезвоним");
        else if ((age <= 100) && (exp < 5)) System.out.println("Вы подходите на должность стажера");
        else if ((age <= 100) && (exp >= 5)) System.out.println("Вы подходите на должность разработчика");
    }
}
