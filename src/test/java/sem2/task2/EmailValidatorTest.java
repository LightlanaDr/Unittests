package sem2.task2;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


//Напишите тесты с использованием аннотаций @Test, @Before, @After,
// @BeforeClass, @AfterClass для проверки различных сценариев,
// включая правильные и неправильные адреса.
class EmailValidatorTest {

    private static EmailValidator emailValidator;

    @BeforeEach
    void setUp() {
        emailValidator = new EmailValidator();
    }

    @AfterEach
    void tearDown() {
        emailValidator = null;
    }

    @Test
    void isValidEmail() {
        assertTrue(emailValidator.isValidEmail("ssssss@mail.ru"));
    }

    void isNoValidEmail() {
        assertFalse(emailValidator.isValidEmail("ssssssmail.ru"));
    }
}