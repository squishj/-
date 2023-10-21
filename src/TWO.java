import java.util.Scanner;

public class TWO {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите слово ");
        String a = scanner.nextLine();
        System.out.println(a.substring(a.length()-1));
    }

}
