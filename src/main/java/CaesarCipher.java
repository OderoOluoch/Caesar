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

    public String encrypt(){
        if(this.shiftKey > 76){
            this.shiftKey = this.shiftKey % 26;
        }else if(this.shiftKey < 0){
            this.shiftKey = (this.shiftKey % 26)+26;
        }
        String cipherText = "";
        int length = mMessage.length();
        for(int i =0; i<length;i++){
            char ch = this.mMessage.charAt(i);
            if(Character.isLetter(ch)){
                if(Character.isLowerCase(ch)){
                    char c = (char)(ch + this.shiftKey);
                    if(c>'z'){
                        cipherText += (char)(ch -(26 - this.shiftKey));
                    }else{
                        cipherText += c;
                    }
                }else if(Character.isUpperCase(ch)){
                    char c = (char)(ch+ this.shiftKey);
                    if(c>'Z'){
                        cipherText += (char)(ch -(26 - this.shiftKey));
                    }else{
                        cipherText += c;
                    }
                }
            }else {
                cipherText += ch;
            }
        }
        return cipherText;
    }

    public String decrypt(){
        if(this.shiftKey >76){
            this.shiftKey = this.shiftKey % 26;
        }else if(this.shiftKey <0){
            this.shiftKey = (this.shiftKey % 26)+26;
        }
        String cipherText = "";
        int length = this.mMessage.length();
        for(int i =0; i<length;i++){
            char ch = this.mMessage.charAt(i);
            if(Character.isLetter(ch)){
                if(Character.isLowerCase(ch)){
                    char c = (char)(ch - this.shiftKey);
                    if(c<'a'){
                        cipherText += (char)(ch +(26- this.shiftKey));
                    }else{
                        cipherText += c;
                    }
                }else if(Character.isUpperCase(ch)){
                    char c = (char)(ch- this.shiftKey);
                    if(c<'A'){
                        cipherText += (char)(ch + (26 - this.shiftKey));
                    }else{
                        cipherText += c;
                    }
                }
            }else {
                cipherText += ch;
            }
        }
        return cipherText;
    }
}
