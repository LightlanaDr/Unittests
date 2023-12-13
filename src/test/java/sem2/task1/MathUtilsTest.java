package sem2.task1;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

//Напишите тесты с использованием ассертов assertEquals, assertTrue, assertFalse, assertNull,
// assertNotNull и проверьте работу методов на различных наборах данных.

class MathUtilsTest {

    private MathUtils mathUtils;

    @BeforeEach
    void setUp() {
        mathUtils = new MathUtils();
    }

    @AfterEach
    void tearDown() {
        mathUtils = null;
    }

    @Test
    void add() {
        assertEquals(5, mathUtils.add(2, 3));
    }

    @Test
    void subtract() {
        assertTrue( mathUtils.subtract(12,7) == 5);
    }

    @Test
    void multiply() {
        assertFalse(mathUtils.multiply(2,2) == 5);
    }

    @Test
    @DisplayName("Проверка деления")
    void divide() {

    }


    @Test
    @DisplayName("Проверка отсутствия объекта")
    void testNull() {
        mathUtils = null;
        assertNull(mathUtils);
    }
}