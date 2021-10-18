import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Task1Test {
    Task1 task1;

    @BeforeEach
    void setUp() {
        task1 = new Task1();
    }

    @Test
    void filter() {
        List<String> expectedList = Task1.convert();
        String actual = "10 - a";
        assertEquals(expectedList.get(0), actual);
    }

    @Test
    void filterSize() {
        List<String> expectedList = Task1.convert();
        int actual = 5;
        assertEquals(expectedList.size(), actual);
    }
}
