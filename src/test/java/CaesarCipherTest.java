import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CaesarCipherTest {
    @Test
    public void newCaesarCipher_instantiatesCorrectly(){
        CaesarCipher testCaesarCipher = new CaesarCipher("message",5);
        assertEquals(true,testCaesarCipher instanceof CaesarCipher);
    }

    @Test
    public void newCaesarCipher_getMessage_message() {
        CaesarCipher testCaesarCipher = new CaesarCipher("message",5);
        assertEquals("messag",testCaesarCipher.getMessage());
    }
}