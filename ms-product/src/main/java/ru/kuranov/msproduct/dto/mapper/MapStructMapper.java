package ru.kuranov.msproduct.dto.mapper;

import org.mapstruct.Mapper;
import ru.kuranov.msproduct.dto.ProductDto;
import ru.kuranov.msproduct.entity.Product;

@Mapper
public interface MapStructMapper {
    Product getProduct(ProductDto productDto);

    ProductDto getProductDto(Product product);
}
