package sem3;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CartTest {

    private Store store;
    private Product product;
    private Product product2;

    private Cart cart;


    @BeforeEach
    void setUp() {
        product = new Product("Apple", 999, 3);
        product2 = new Product("Mobile", 999, 3);
        cart = new Cart();
    }

    @AfterEach
    void tearDown() {
        product = null;
        product2 = null;
        cart = null;
    }



    @Test
    void addProduct() {
        cart.addProduct(product);
        assertEquals(1, cart.getProducts());

    }

    @Test
    void removeProduct() {
        cart.addProduct(product);
        cart.addProduct(product2);
        cart.removeProduct(product);
        assertEquals(1, cart.getProducts());
    }

    @Test
    void calculateTotalPrice() {
        cart.addProduct(product);
        cart.addProduct(product2);
        double totalSum = cart.calculateTotalPrice();
        assertEquals(5994, cart.calculateTotalPrice(), 0.1);

    }
}