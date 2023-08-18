package com.example.pizzariabackend.pizzariabackend.controllers;

import com.example.pizzariabackend.pizzariabackend.dtos.in.ingredientDtos.IngredientIdDTO;
import com.example.pizzariabackend.pizzariabackend.dtos.in.ingredientDtos.IngredientInDTO;
import com.example.pizzariabackend.pizzariabackend.dtos.in.ingredientDtos.IngredientUpdateDTO;
import com.example.pizzariabackend.pizzariabackend.dtos.out.ingredientDtos.IngredientOutDTO;
import com.example.pizzariabackend.pizzariabackend.abstractClasses.AbstractController;
import com.example.pizzariabackend.pizzariabackend.abstractClasses.AbstractService;

public class IngredientController extends AbstractController<AbstractService,
        IngredientIdDTO,
        IngredientInDTO,
        IngredientUpdateDTO,
        IngredientOutDTO> {
}
