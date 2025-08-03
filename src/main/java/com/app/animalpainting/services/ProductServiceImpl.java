package com.app.animalpainting.services;

import com.app.animalpainting.web.model.ProductDto;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ProductServiceImpl implements ProductService {
    List<ProductDto> products = new ArrayList<>();

    @Override
    public ProductDto getProduct() {
       return ProductDto.builder().build();
    }

    @Override
    public List<ProductDto> getProducts() {
        this.cleanProducts();
        this.loadProducts();
        return this.products;
    }

    private void cleanProducts(){
        this.products.clear();
    }

    private void loadProducts(){
        this.products.add(new ProductDto(1, "Dog", 79, "Product_01.jpg"));
        this.products.add(new ProductDto(2, "Dinosaur", 39, "Product_02.jpg"));
        this.products.add(new ProductDto(3, "Iguana", 49, "Product_03.jpg"));
        this.products.add(new ProductDto(4, "Bird", 89, "Product_04.jpg"));
        this.products.add(new ProductDto(5, "Tiger", 79, "Product_05.jpg"));
        this.products.add(new ProductDto(6, "Cat", 19, "Product_06.jpg"));
        this.products.add(new ProductDto(7, "Lion", 29, "Product_07.jpg"));
        this.products.add(new ProductDto(8, "Owl", 49, "Product_08.jpg"));
        this.products.add(new ProductDto(9, "Cat 2", 79, "Product_09.jpg"));
        this.products.add(new ProductDto(10, "Deer Stag", 99, "Product_10.jpg"));
        this.products.add(new ProductDto(11, "Elephant", 119, "Product_11.jpg"));
        this.products.add(new ProductDto(12, "Dog 2", 109, "Product_12.jpg"));
    }
}
