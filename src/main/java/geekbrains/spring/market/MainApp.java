package geekbrains.spring.market;


import geekbrains.spring.market.item.Cart;
import geekbrains.spring.market.item.Product;
import geekbrains.spring.market.services.ProductService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.List;

public class MainApp {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MainConfig.class);

        ProductService productService = context.getBean("productService", ProductService.class);
        List<Product> products = productService.getAllProducts();
        System.out.println(products);

        List<Cart> carts;
        productService.insertCart(3L, products.get(1));//Добавляю в корзину выбранный товар
        carts = productService.getAllCarts();
        System.out.println(carts);

        context.close();
    }
}
