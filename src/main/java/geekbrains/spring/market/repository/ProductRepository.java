package geekbrains.spring.market.repository;


import geekbrains.spring.market.item.Cart;
import geekbrains.spring.market.item.Product;
import org.springframework.stereotype.Repository;

import javax.annotation.PostConstruct;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@Repository
public class ProductRepository {
    private List<Product> products;
    private List<Cart> carts;

    @PostConstruct
    public void init() {
        products = new ArrayList<>();
        products.add(new Product(1L, "Milk", new BigDecimal(67.0)));
        products.add(new Product(2L, "Bread", new BigDecimal(27.0)));
        products.add(new Product(3L, "Meat", new BigDecimal(267.0)));
    }

    public List<Product> getAllProducts() {
        return Collections.unmodifiableList(products);
    }

    public List<Cart> getAllCarts() {
        return Collections.unmodifiableList(carts);
    }

    public void insert(Product product) {
        products.add(product);
    }

    public void insert_cart(Long id, Product product) {
        carts = new ArrayList<>();
        carts.add(new Cart(id, product.getId(), product.getPrice()));
    }
}
