package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class ProductController {

    //mapping the getProduct() method to /product
    @GetMapping(value = "/product")
    public List<Product> getProduct() {

        List<Product> list = new ArrayList<>();
        Product test = new Product();
        test.batchno = "test";
        list.add(test);
        list.add(test);
//finds all the products  

//returns the product list  
        return list;
    }
}  