import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);

        System.out.println("Want to send a secret message? \n Enter the message here to Encrypt your message: ");
        String message = myScanner.nextLine();
        System.out.println(message);
    }
}
