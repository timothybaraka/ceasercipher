import java.io.Console;

public class App {
    public static void main(String[] args) {
        Console myConsole = System.console();

        System.out.println("Welcome to CaesarCipher");
        System.out.println("--------------------------------------------------------------------");

        System.out.println("To encrypt press '11' ");
        System.out.println("To decrypt press '12' ");
        String enteredValue = myConsole.readLine();

        if (enteredValue.equals("11")){
            System.out.println("Enter the text you want to encrypt: ");
            String initialUserInput = myConsole.readLine();
            String userInput = initialUserInput.toUpperCase();


            System.out.println("Enter your encryption key ");
            String stringUserKey = myConsole.readLine();
            int userKey = Integer.parseInt(stringUserKey);
            Cipher cipher = new Cipher(userInput, userKey);

            System.out.println(cipher.textEncrypt(userInput, userKey));
        } else if (enteredValue.equals("12")) {
            System.out.println("Enter the text you want to decrypt: ");
            String initialUserInput = myConsole.readLine();
            String userInput = initialUserInput.toUpperCase();

            System.out.println("Enter your decryption key ");
            String stringUserKey = myConsole.readLine();
            int userKey = Integer.parseInt(stringUserKey);
            Cipher cipher = new Cipher(userInput, userKey);

            System.out.println(cipher.textDecrypt(userInput, userKey));

        } else {
            System.out.println("Input not recognised");
        }
    }
}
