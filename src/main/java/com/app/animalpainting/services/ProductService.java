package com.app.animalpainting.services;

import com.app.animalpainting.web.model.Product;

import java.util.List;

public interface ProductService {
    Product getProduct();
    List<Product> getProducts();
    
}
