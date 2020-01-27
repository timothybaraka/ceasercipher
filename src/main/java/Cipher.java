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
}
