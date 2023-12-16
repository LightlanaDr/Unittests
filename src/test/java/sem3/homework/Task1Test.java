package sem3.homework;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Task1Test {
    private Task1and2 task1;

    @BeforeEach
    void setUp() {
        task1 = new Task1and2();
    }

    @AfterEach
    void tearDown() {
        task1 = null;
    }

    @Test
    @DisplayName("Проверка на четность")
    void evenOddNumberTrue() {
        int numberOne = 4;
        assertTrue(task1.evenOddNumber(numberOne));
    }

    @Test
    @DisplayName("Проверка на нечетность")
    void evenOddNumberFalse() {
        int numberOne = 5;
        assertFalse(task1.evenOddNumber(numberOne));
    }


    @Test
    @DisplayName("Проверка, попадает ли выбранное число в интервал 25-100")
    void numberInIntervalFalse(){
        int numberOne = 5;
        assertFalse(task1.numberInInterval(numberOne));
    }

    @Test
    @DisplayName("Проверка, попадает ли выбранное число в интервал 25-100")
    void numberInIntervalTrue(){
        int numberOne = 26;
        assertTrue(task1.numberInInterval(numberOne));
    }


}