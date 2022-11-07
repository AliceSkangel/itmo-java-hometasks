package hw2;

public class Task2 {
    public static void main(String[] args) {
        double sum = 10990;
        int saleCode = 4525;
        switch (saleCode) {
            case 4525:
                sum = sum * 0.7;
                break;
            case 6424, 7012:
                sum = sum * 0.8;
                break;
            case 7647, 9011, 6612:
                sum = sum * 0.9;
                break;
            default:
                System.out.println(sum);
        }
        System.out.println("К оплате: " + sum);
    }
}
