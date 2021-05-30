public class CaesarCipher {
    private String mMessage;
    private int shiftKey;

    public CaesarCipher(String message, int key){
        this.mMessage = message;
        this.shiftKey=key;
    }
}
