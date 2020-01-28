public class Cipher {
    private String userInput;
    private int userKey;

    private String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";

    public Cipher(String userInput, int userKey) {
        this.userInput = userInput;
        this.userKey = userKey;
    }

    public String getUserInput() {
        return this.userInput;
    }

    public int getUserKey() {
        return this.userKey;
    }

    String textEncrypt(String userInput, int userKey) {
        String cryptedMessage = " ";
        for (int t = 0; t < userInput.length(); t++) {
            char userInputCharacter = userInput.charAt(t);
            boolean space = Character.isWhitespace(userInputCharacter);
            boolean num = Character.isDigit(userInputCharacter);

            int letterIndex = alphabet.indexOf(userInputCharacter);
            int letterPosition = letterIndex + userKey;

            if (letterPosition > 25) {
                cryptedMessage += alphabet.charAt(letterPosition % 26);
            } else if (space) {
                cryptedMessage += "";
            } else if (num) {
                cryptedMessage += userInputCharacter;
            } else {
                cryptedMessage += alphabet.charAt(letterPosition);
            }
            return cryptedMessage;
        }
    }




