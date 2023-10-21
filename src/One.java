import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class One {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите числа, 0 это стоп");
        List list = new ArrayList<>();
        while (true) {
            int input = scanner.nextInt();
            if (input == 0) {
                break;
            }
            list.add(input);
        }
        Object[] myArray = list.toArray();
        int len = myArray.length;
        System.out.println(len);
    }
}