package com.app.animalpainting.services;

import com.app.animalpainting.web.model.ProductDto;

import java.util.List;

public interface ProductService {
    ProductDto getProduct();
    List<ProductDto> getProducts();
    
}
