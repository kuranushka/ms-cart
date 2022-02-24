package ru.kuranov.mscart.entity;

import lombok.*;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Component
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Cart {

    private Long id;
    private LocalDateTime date;
    private BigDecimal totalCost;
    private List<Product> list;
}
