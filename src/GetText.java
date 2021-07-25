import java.util.Scanner;

public class GetText {

    public static String getText(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter text tu return: ");
        return scanner.nextLine();
    }
}
