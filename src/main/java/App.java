import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);

        System.out.println("Want to send a secret message? \n Enter the message here to Encrypt your message: ");
        String message = myScanner.nextLine();
        System.out.println("Now enter a number, to serve as your encryption key");
        int key = myScanner.nextInt();
         CaesarCipher caesarCipher = new CaesarCipher(message,key);
         String encryptedMessage = caesarCipher.messageEncryption();
         String decryptedMessage = caesarCipher.messageDecryption();

        System.out.println("********************************************");
        System.out.println("Your Original Message: ");
        System.out.println(message);
        System.out.println("********************************************");
        System.out.println("Your Encrypted Message: ");
        System.out.println(encryptedMessage);
        System.out.println("********************************************");
        System.out.println("Your Decrypted Message: ");
        System.out.println(decryptedMessage);



    }
}
