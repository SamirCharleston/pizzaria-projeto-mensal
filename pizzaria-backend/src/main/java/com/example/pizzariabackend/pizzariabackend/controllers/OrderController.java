package com.example.pizzariabackend.pizzariabackend.controllers;

import com.example.pizzariabackend.pizzariabackend.dtos.in.orderDtos.OrderIdDTO;
import com.example.pizzariabackend.pizzariabackend.dtos.in.orderDtos.OrderInDTO;
import com.example.pizzariabackend.pizzariabackend.dtos.in.orderDtos.OrderUpdateDTO;
import com.example.pizzariabackend.pizzariabackend.dtos.out.orderDtos.OrderOutDTO;
import com.example.pizzariabackend.pizzariabackend.abstractClasses.AbstractController;
import com.example.pizzariabackend.pizzariabackend.abstractClasses.AbstractService;
import com.example.pizzariabackend.pizzariabackend.services.OrderService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
@Controller
@RequestMapping(value = "/order")
public class OrderController {
}
