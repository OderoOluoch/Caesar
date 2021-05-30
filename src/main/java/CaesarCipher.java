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

    public int ShiftRightKey(){
        int key = getShiftKey();
        return key;
    }
}
