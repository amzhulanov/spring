package geekbrains.spring.market.item;

import org.springframework.stereotype.Component;

import java.math.BigDecimal;

@Component
public class Cart {
    private Long id;
    private Long idProduct;
    private BigDecimal price;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getIdProduct() {
        return idProduct;
    }

    public void setIdProduct(Long idProduct) {
        this.idProduct = idProduct;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public Cart(Long id, Long idProduct, BigDecimal price) {
        this.id = id;
        this.idProduct = idProduct;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Cart{" +
                "id=" + id +
                ", idProduct=" + idProduct +
                ", price=" + price +
                '}';
    }
}
