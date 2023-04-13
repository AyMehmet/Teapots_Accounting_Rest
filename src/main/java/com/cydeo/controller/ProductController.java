package com.cydeo.controller;


import com.cydeo.dto.ProductDto;
import com.cydeo.service.ProductService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping ("/products/api/v1")
public class ProductController {

    private final ProductService productService;

   public ProductController(ProductService productService) {
        this.productService = productService;
    }

    @GetMapping
    public List<ProductDto> getAllProducts(){

        return productService.getAllProduct();
    }


}
