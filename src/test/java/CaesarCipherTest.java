import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CaesarCipherTest {
    @Test
    public void newCaesarCipher_instantiatesCorrectly(){
        CaesarCipher testCaesarCipher = new CaesarCipher("Happy Coding",5);
        assertEquals(true,testCaesarCipher instanceof CaesarCipher);
    }
}