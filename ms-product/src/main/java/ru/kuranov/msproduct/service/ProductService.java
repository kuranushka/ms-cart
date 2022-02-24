package ru.kuranov.msproduct.service;

import org.springframework.stereotype.Service;
import ru.kuranov.msproduct.dto.ProductDto;
import ru.kuranov.msproduct.dto.mapper.MapStructMapper;
import ru.kuranov.msproduct.repository.ProductRepository;

@Service
public class ProductService {
    private final ProductRepository productRepository;
    private final MapStructMapper mapper;

    public ProductService(ProductRepository productRepository, MapStructMapper mapper) {
        this.productRepository = productRepository;
        this.mapper = mapper;
    }

    public ProductDto findById(Long id) {
        return mapper.getProductDto(productRepository.findById(id));
    }
}
