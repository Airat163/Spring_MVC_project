package org.example.controllers;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.example.model.Product;
import org.example.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequiredArgsConstructor(onConstructor = @__(@Autowired))
@RequestMapping("/api")
@Slf4j
public class ProductController {

    private final ProductService productService;

    @GetMapping("/add")
    public String addProduct(@RequestParam String name, @RequestParam double price) {
        Product product = new Product(name, price);
        return "redirect:/products/list";
    }

   /* public String getProductById(int id, Model model) {

    }*/
}
