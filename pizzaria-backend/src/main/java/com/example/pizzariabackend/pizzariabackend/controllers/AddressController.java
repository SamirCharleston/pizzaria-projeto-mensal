package com.example.pizzariabackend.pizzariabackend.controllers;

import com.example.pizzariabackend.pizzariabackend.dtos.in.addressDtos.AddressIdDTO;
import com.example.pizzariabackend.pizzariabackend.dtos.in.addressDtos.AddressInDTO;
import com.example.pizzariabackend.pizzariabackend.dtos.in.addressDtos.AddressUpdateDTO;
import com.example.pizzariabackend.pizzariabackend.dtos.out.addressDtos.AddressOutDTO;
import com.example.pizzariabackend.pizzariabackend.settings.abstractClasses.AbstractController;
import com.example.pizzariabackend.pizzariabackend.settings.abstractClasses.AbstractService;

public class AddressController extends AbstractController<
        AbstractService,
        AddressIdDTO,
        AddressInDTO,
        AddressUpdateDTO,
        AddressOutDTO
        > {
}
