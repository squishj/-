import java.util.Scanner;

public class q {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите числo");
        int a = scanner.nextInt();
        if (a < 0) {
            System.out.println("Оно отрицательно");
        } else {
            System.out.println("Всё остальное");
        }
    }
}