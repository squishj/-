import java.util.Scanner;

public class pyatoe {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите 1 слово");
        String a = scanner.nextLine();
        System.out.println("Введите 2 слово");
        String b = scanner.nextLine();
        if (a.equals(b)){
            System.out.println("Ravni");
        }
        else {
            System.out.println("No pavni");
        }
    }
}
