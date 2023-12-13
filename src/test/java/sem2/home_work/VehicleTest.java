package sem2.home_work;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class VehicleTest {

    private Car car;
    private Motorcycle moto;


    @BeforeEach
    void setUp() {
        car = new Car("Opel", "Mokka", 2015);
        moto = new Motorcycle("Upiter", "5", 2020);
    }

    @AfterEach
    void tearDown() {
        car = null;
        moto = null;
    }

    @Test
    @DisplayName("Проверка, что авто с 4 колесами")
    void getWheelsCar(){
        assertEquals(4, car.getNumWheels());
    }

    @Test
    @DisplayName("Проверка, что мото с 2 колесами")
    void getWheelsMoto(){
        assertEquals(2, moto.getNumWheels());
    }
    @Test
    @DisplayName("Проверка, что авто может развивать скорость 60 км/ч")
    void testDriveCar() {
        car.testDrive();
        assertEquals(60, car.getSpeed());
    }

    @Test
    @DisplayName("Проверка, что мото может развивать скорость 75 км/ч")
    void testDriveMoto() {
        moto.testDrive();
        assertEquals(75, moto.getSpeed());
    }

    @Test
    @DisplayName("Проверка, что что в режиме парковки (сначала testDrive, потом park, " +
            "т.е. эмуляция движения транспорта) машина останавливается (speed = 0).")
    void parkCar() {
        car.testDrive();
        car.park();
        assertEquals(0, car.getSpeed());
    }

    @Test
    @DisplayName("Проверка, в режиме парковки " +
            "(сначала testDrive, потом park, т.е. эмуляция движения транспорта) мотоцикл останавливается (speed = 0).")
    void parkMoto() {
        moto.testDrive();
        moto.park();
        assertEquals(0, moto.getSpeed());
    }
}