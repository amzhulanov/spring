package geekbrains.spring.market.item;

import geekbrains.spring.market.services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@Component
public class Cart {
    ProductService productService;
    private List<Product> cart = new ArrayList<>();
//    private Long id;
//    private Long idProduct;
//    private BigDecimal price;


    @Autowired
    public void setProductService(ProductService productService) {
        this.productService = productService;
    }

    public void addCart(Long id) {
        cart.add(productService.findByOneId(id));
    }

    public List<Product> getAllCart() {
        return Collections.unmodifiableList(cart);
    }
}
