package geekbrains.spring.market.services;

import geekbrains.spring.market.item.Cart;
import geekbrains.spring.market.item.Product;
import geekbrains.spring.market.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {
    private ProductRepository productRepository;

    @Autowired
    public void setProductRepository(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    public List<Product> getAllProducts() {
        return productRepository.getAllProducts();
    }

    public List<Cart> getAllCarts() {
        return productRepository.getAllCarts();
    }

    public void insertCart(Long id, Product product) {
        productRepository.insert_cart(id, product);
    }


}
