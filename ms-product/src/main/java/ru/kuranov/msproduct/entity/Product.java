package ru.kuranov.msproduct.entity;

import com.fasterxml.jackson.annotation.JsonTypeId;
import lombok.*;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;

@Component
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Product {

    private Long id;
    private String title;
    private BigDecimal cost;
}
