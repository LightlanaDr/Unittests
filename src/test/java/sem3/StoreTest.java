package sem3;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StoreTest {
    private Store store;
    private Product product;
    private Product product2;

    @BeforeEach
    void setUp() {
        product = new Product("Apple", 999, 3);
        product2 = new Product("Mobile", 999, 3);
        store = new Store();

    }

    @AfterEach
    void tearDown() {
        product = null;
        product2 = null;
        store = null;
    }

    @Test
    @DisplayName("Проверка сохранения продуктов")
    void addProductToInventory() {
        store.addProductToInventory(product);
        store.addProductToInventory(product2);
        assertEquals(2, store.getInventory().size());
    }

    @Test
    @DisplayName("удаления продуктов")
    void removeProductFromInventory() {
        store.addProductToInventory(product);
        store.addProductToInventory(product2);
        store.removeProductFromInventory(product);
        assertEquals(1, store.getInventory().size());
    }

    @Test
    void findProductByName() {
        store.addProductToInventory(product);
        Product findprod = store.findProductByName("Apple");
        assertEquals("Apple", findprod.getName());

    }

    @Test
    void createCart() {
        Cart cart = store.createCart();
        assertNotNull(cart);
    }
}