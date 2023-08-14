package com.example.pizzariabackend.pizzariabackend.entities;

import com.example.pizzariabackend.pizzariabackend.settings.abstractClasses.AbstractEntity;
import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import jakarta.validation.constraints.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Entity
@Table(name = "flavors", schema = "public")
@NoArgsConstructor
@AllArgsConstructor
@Getter @Setter
public class Flavor extends AbstractEntity {
    @NotBlank(message = ERROR_MESSAGES.NOT_BLANK)
    @NotNull(message = ERROR_MESSAGES.NOT_NULL)
    @Max(value = 50, message = ERROR_MESSAGES.MAX_50)
    @Pattern(regexp = REGULAR_EXPRESSIONS.NAME, message = ERROR_MESSAGES.NAME)
    private String name;
    @NotNull(message = ERROR_MESSAGES.NOT_NULL)
    @NotEmpty(message = ERROR_MESSAGES.NOT_EMPTY)
    @OneToMany
    private List<Ingredient> ingredients;
}