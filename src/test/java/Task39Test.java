import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class Task39Test {
    Task39 task39;
    String[] input;

    @BeforeEach
    void setUp() {
        task39 = new Task39();
        input = new String[]{"03", "F", "01", "23.4"};
    }

    @Test
    void filter() {
        List<String> expectedList = Task39.filter(input);
        String actual = "03 - 11";
        assertEquals(expectedList.get(0), actual);
    }

    @Test
    void filterSize() {
        List<String> expectedList = Task39.filter(input);
        int actual = 3;
        assertEquals(expectedList.size(), actual);
    }
}