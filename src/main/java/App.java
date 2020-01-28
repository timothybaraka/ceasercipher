import java.io.Console;

public class App {
    public static void main(String[] args) {
        Console myConsole = System.console();

        System.out.println("Enter the text you want to encrypt: ");
        String userInput = myConsole.readLine();


        System.out.println("Enter your encryption key ");
        String stringUserKey = myConsole.readLine();
        int userKey = Integer.parseInt(stringUserKey);

        System.out.println("Thank you for your input");

    }

}
