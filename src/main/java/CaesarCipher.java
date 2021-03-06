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
        if( key > 76){
            key = key % 26;
        }else if(key < 0){
            key = (key % 26) + 26;
        }
        return key;
    }

    //Encryption logic
    public String messageEncryption(){
        int shiftedKey = shiftKeyForEncryption();
        String message = getMessage();
        String encryptedMessage = "";

        int length = message.length();//hello
        for(int i =0; i<length;i++){
            char ch = message.charAt(i);
            if(Character.isLetter(ch)){
                if(Character.isLowerCase(ch)){
                    char c = (char)(ch+shiftedKey);
                    if(c > 'z'){
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
        int shiftedKey = shiftKeyForEncryption();
        String encryptedMessage = messageEncryption();

        String decryptedMessage = "";

        int length = encryptedMessage.length();
        for(int i =0; i<length;i++){
            char ch = encryptedMessage.charAt(i);
            if(Character.isLetter(ch)){
                if(Character.isLowerCase(ch)){
                    char c = (char)(ch-shiftedKey);
                    if(c<'a'){
                        decryptedMessage += (char)(ch +(26 - shiftedKey));
                    }else{
                        decryptedMessage += c;
                    }
                }else if(Character.isUpperCase(ch)){
                    char c = (char)(ch - shiftedKey);
                    if(c<'A'){
                        decryptedMessage += (char)(ch + (26 - shiftedKey));
                    }else{
                        decryptedMessage += c;
                    }

                }
            }else {
                decryptedMessage+= ch;
            }
        }
        return decryptedMessage;
    }
}
