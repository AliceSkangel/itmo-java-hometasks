package hw1;

public class Task1 { // пкм на файле - Refactor - Rename (то же самое со всем остальным, например, переменными)
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        int c = 30;
        int s = 2 * (a * b + b * c + a * c); // можно писать без пробелов
        System.out.println(s);

        int number = 5;
        System.out.println(number * number * number);
        // новую переменную не объявили, в дальнейшем мы не можем использовать полученное значение

        double time = 3;
        double distance = 6;
        System.out.println(distance / time);

        float x = 34;
        int y = 60_000;
        int z = (int) (x / y); // если нужно целое число
        float w = x / y; // если нужна дробная часть

        double n = 90.8;
        double m = -100.1;
        double max = n > m ? n : m; // может быть только double
        System.out.println(max);

        int e = 34;
        long f = 78;
        long g = e / f; // если р-т не выходит за пределы int, можно привести к int
        // если нужна дробная часть, то приводим к double

        byte code = 1;
        // boolean isActive = (boolean) code; - ошибка, byte нельзя приводить к boolean (несовместимы)

        int num = 63;
        System.out.println((num/10) + (num % 10));
    }
}