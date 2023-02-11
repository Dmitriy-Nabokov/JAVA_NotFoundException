package ru.netology;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ExceptionsTest {

        Product product1 = new Book(1, "Колобок", 400, "Константин Ушинский");
        Product product2 = new Smartphone(312, "XPeria Ray", 18_000, "SonyEricsson");
        Product product3 = new Book(41, "The fellowship of the Ring", 4_000, "J.R.R.Tolkien");
        Product product4 = new Smartphone(544, "MI8", 20_000, "Xiaomi");

    @Test
    public void removeByID() {
        ProductRepository repo = new ProductRepository();
        repo.add(product1);
        repo.add(product2);
        repo.add(product3);
        repo.add(product4);
        repo.removeById(312);
        repo.removeById(41);

        Product[] expected = {product1, product4};
        Product[] actual = repo.findAll();


        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void ShouldDisplayError() {
        ProductRepository repo = new ProductRepository();
        repo.add(product1);
        repo.add(product2);
        repo.add(product3);
        repo.add(product4);

        Assertions.assertThrows(NotFoundException.class, () -> {
            repo.removeById(2);
        });
    }
}
