public class Cipher {
    private String userInput;
    private int userKey;

    private String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";

    public Cipher(String userInput, int userKey){
        this.userInput = userInput;
        this.userKey = userKey;
    }
    public String getUserInput(){
        return this.userInput;
    }
    public int getUserKey(){
        return this.userKey;
    }

    String textEncrypt(String userInput , int userKey){
           String cryptedMessage = " ";
        for(int t = 0; t < userInput.length(); t++ ){
            int letterIndex = alphabet.indexOf();
            int letterPosition = letterIndex + userKey;

            if(letterPosition > 25){
                cryptedMessage = cryptedMessage + alphabet.charAt(letterPosition % 26);
            }
            else if
        }
    }
}
