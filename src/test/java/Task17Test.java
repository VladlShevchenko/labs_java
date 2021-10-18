import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Task17Test {
    Task17 task17;
    String[] input;

    @BeforeEach
    void setUp() {
        task17 = new Task17();
        input = new String[]{"+380", "word", "43a", "23.4"};
    }

    @Test
    void filter() {
        List<String> expectedList = Task17.filter(input);
        String actual = "+380 Decimal";
        assertEquals(expectedList.get(0), actual);
    }

    @Test
    void filterSize() {
        List<String> expectedList = Task17.filter(input);
        int actual = 4;
        assertEquals(expectedList.size(), actual);
    }
}