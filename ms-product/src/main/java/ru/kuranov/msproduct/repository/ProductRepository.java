package ru.kuranov.msproduct.repository;

import org.springframework.stereotype.Component;
import ru.kuranov.msproduct.entity.Product;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

@Component
public class ProductRepository {

    private List<Product> products = new ArrayList<>();

    public ProductRepository() {
        Product grapes = Product.builder()
                .id(0L)
                .title("Grapes")
                .cost(BigDecimal.valueOf(100L))
                .build();
        Product water = Product.builder()
                .id(1L)
                .title("Water")
                .cost(BigDecimal.valueOf(40L))
                .build();
        Product milk = Product.builder()
                .id(2L)
                .title("Milk")
                .cost(BigDecimal.valueOf(70L))
                .build();
        products = List.of(grapes, water, milk);
    }

    public Product findById(Long id) {
        return products.stream()
                .filter(product -> product.getId().equals(id))
                .findFirst().orElseThrow(NoSuchElementException::new);
    }
}
