package com.example.pizzariabackend.pizzariabackend.entities;

import com.example.pizzariabackend.pizzariabackend.settings.abstractClasses.AbstractEntity;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import jakarta.validation.constraints.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import java.math.BigDecimal;

@Entity
@Table(name = "other_products", schema = "public")
@NoArgsConstructor
@AllArgsConstructor
@Getter @Setter
public class OtherProduct extends AbstractEntity {
    @Pattern(regexp = REGULAR_EXPRESSIONS.NAME, message = ERROR_MESSAGES.NAME)
    private String name;
    @NotNull(message = ERROR_MESSAGES.NOT_NULL)
    @Positive(message = ERROR_MESSAGES.POSITIVE)
    private BigDecimal price;
    @Max(value = 20, message = ERROR_MESSAGES.MAX_20)
    @NotNull(message = ERROR_MESSAGES.NOT_NULL)
    @NotBlank(message = ERROR_MESSAGES.NOT_BLANK)
    private String kind;
}