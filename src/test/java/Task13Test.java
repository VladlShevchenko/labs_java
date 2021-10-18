import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Task13Test {
    Task13 task13;
    String plainText;

    @BeforeEach
    void setUp() {
        task13 = new Task13();
        plainText = "cypher";

    }

    @Test
    void encrypt() {
        String expected = Task13.encrypt(plainText, 3);
        String actual = " FBSKHU";
        assertEquals(expected, actual);
    }
}