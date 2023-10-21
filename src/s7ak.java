import java.util.Scanner;
public class s7ak {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите слово ");
        String a = scanner.nextLine();
        char L = a.charAt((a.length()-1));
        char s = 'ь';
        if(L != s){
            System.out.println(L);
        }else {
            L = a.charAt((a.length()-2));
            System.out.println(L);
        }

    }
}
