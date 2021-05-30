import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CaesarCipherTest {
    @Test
    public void newCaesarCipher_instantiatesCorrectly(){
        CaesarCipher testCaesarCipher = new CaesarCipher("hi",5);
        assertEquals(true,testCaesarCipher instanceof CaesarCipher);
    }

    @Test
    public void newCaesarCipher_getMessage_hi() {
        CaesarCipher testCaesarCipher = new CaesarCipher("hi",5);
        assertEquals("message",testCaesarCipher.getMessage());
    }

    @Test
    void newCaesarCipher_getShiftKey_5(){
        CaesarCipher testCaesarCipher = new CaesarCipher("hi",5);
        assertEquals(5,testCaesarCipher.getShiftKey());
    }

    @Test
    void newCaesarCipher_manipulateShiftKeyToGetRightLetter_5(){
        CaesarCipher testCaesarCipher = new CaesarCipher("hi",5);
        assertEquals(5,testCaesarCipher.shiftKeyForEncryption());
    }

    @Test
    void newCaesarCipher_manipulateMessageToEnforceEncryption_mn(){
        CaesarCipher testCaesarCipher = new CaesarCipher("hii",5);
        assertEquals("hi",testCaesarCipher.messageEncryption());
    }
}