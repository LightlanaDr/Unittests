import org.junit.Test;
import org.junit.jupiter.api.*;
import static org.junit.Assert.assertEquals;

public class TaskOneTest {
//    @Test
//    public void testMethod() {
//        assertEquals(5, 2 + 3);
//    }

//    @BeforeEach
//    public void setup() {
//// Инициализация ресурсов
//    }
//
//    @AfterEach
//    public void teardown() {
//// Очистка ресурсов
//    }
//
//    @BeforeAll
//    public static void globalSetup() {
//// Инициализация ресурсов один раз всех
//    }
//
//    @AfterAll
//    public static void globalTeardown() {
//// Очистка ресурсов один раз всех
//    }

    @Test
    @DisplayName("Тест суммирования")
    public void testSum() {
        assertEquals(5, 2 + 3);
    }
}
