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


    //Encryption logic
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
        String encryptedMessage = "";

        int length = message.length();
        for(int i =0; i<length;i++){
            char ch = message.charAt(i);
            if(Character.isLetter(ch)){
                if(Character.isLowerCase(ch)){
                    char c = (char)(ch+shiftedKey);
                    if(c>'z'){
                        encryptedMessage += (char)(ch -(26 - shiftedKey));
                    }else{
                        encryptedMessage += c;
                    }
                }else if(Character.isUpperCase(ch)){
                    char c = (char)(ch + shiftedKey);
                    if(c>'Z'){
                        encryptedMessage += (char)(ch -(26 - shiftedKey));
                    }else{
                        encryptedMessage += c;
                    }
                }
            }else {
                encryptedMessage += ch;
            }
        }
        return encryptedMessage;
    }


   //Decryption Logic
    public String messageDecryption(){
        String encryptedMessage = messageEncryption();
        return encryptedMessage;
    }



}
