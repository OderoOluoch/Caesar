import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);

        boolean runningProgram = true;

        while(runningProgram){
            System.out.println("Welcome. We send your message securely");
            System.out.println("Type the word messaging to proceed \nOr exit to cancel");
            String option = myScanner.nextLine();
            if(option.equals("messaging")){
                System.out.println("Enter the message here to Encrypt your message: ");
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
                System.out.println("********************************************");
            }else if (option.equals("exit")){
                runningProgram = false;
            }else {
                System.out.println("Please pick a valid option");
            }
        }
        myScanner.close();
    }
}
