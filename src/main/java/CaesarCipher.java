public class CaesarCipher {
    private String mMessage;
    private int shiftKey;

    public CaesarCipher(String message, int key){
        this.mMessage = message;
        this.shiftKey=key;
    }
    public String getMessage(){
        return this.mMessage;
    }
    public int getShiftKey(){
        return this.shiftKey;
    }

    public int shiftKeyForEncryption(){
        int key = getShiftKey();
        if( key >76){
            key = key % 26;
        }else if(key < 0){
            key = (key % 26) + 26;
        }
        return key;
    }

    public String messageEncryption(){
        int shiftedKey = shiftKeyForEncryption();
        String message = getMessage();
        return message;
    }
}
