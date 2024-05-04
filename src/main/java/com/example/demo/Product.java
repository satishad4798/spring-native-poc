package com.example.demo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Product {
    public int id;
    public String pname;
    public String batchno;
    public double price;
    public int noofproduct;
//default constructor  

}