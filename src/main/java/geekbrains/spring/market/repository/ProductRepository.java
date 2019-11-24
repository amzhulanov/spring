package geekbrains.spring.market.repository;


import geekbrains.spring.market.item.Cart;
import geekbrains.spring.market.item.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.annotation.PostConstruct;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@Repository
public class ProductRepository {
    private List<Product> products;

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

    public Product findByOneId (Long id){
        for (Product item : products) {
            if (item.getId().equals(id)) {
                return item;
            }
        }
        return null;
    }
}
