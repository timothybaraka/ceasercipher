import org.junit.*;
import static org.junit.Assert.*;

public class CipherTest {

    @Test
    public void newCipher_instantiatesCorrectly_(){
        Cipher testCipher = new Cipher("today", 4);
        assertEquals(true , testCipher instanceof Cipher);
    }

    @Test
    public void userInput_getsUserInput__String(){
        Cipher testCipher= new Cipher("today", 4);
        assertEquals("today" ,testCipher.getUserInput());
    }

    @Test
    public void userKey_getsUserKey_Int(){
        Cipher testCipher = new Cipher("today",4);
        assertEquals(4,testCipher.getUserKey());
    }


    }
