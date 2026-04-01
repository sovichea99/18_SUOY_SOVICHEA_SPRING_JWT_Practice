package org.example._18_suoy_sovichea_spring_jwt_practice.controller;

import io.swagger.v3.oas.annotations.security.SecurityRequirement;
import org.example._18_suoy_sovichea_spring_jwt_practice.model.entity.AppUser;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/products")
@SecurityRequirement(name = "bearerAuth")
public class ProductController {
    @GetMapping
    public String getAllProducts() {
       return "Product Returned.";
    }
}
