package geekbrains.spring.market.services;

import geekbrains.spring.market.item.Cart;
import geekbrains.spring.market.item.Product;
import geekbrains.spring.market.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;
import java.util.Optional;

@Service
public class ProductService {
    private ProductRepository productRepository;
    private Cart cart;


    @Autowired
    public void setProductRepository(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    @Autowired
    public void setCart(Cart cart) {
        this.cart = cart;
    }

    public List<Product> getAllProducts() {
        return productRepository.getAllProducts();
    }

    public List<Product> getAllCarts() {
        return cart.getAllCart();
    }

    public void addCart(Long id){
        cart.addCart(id);
    }

    public Product findByOneId(Long id) {
        return productRepository.findByOneId(id);
    }

}
