package com.app.animalpainting.services;

import com.app.animalpainting.web.model.Product;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ProductServiceImpl implements ProductService {
    List<Product> products = new ArrayList<>();

    @Override
    public Product getProduct() {
       return Product.builder().build();
    }

    @Override
    public List<Product> getProducts() {
        this.cleanProducts();
        this.loadProducts();
        return this.products;
    }

    private void cleanProducts(){
        this.products.clear();
    }

    private void loadProducts(){
        this.products.add(new Product(1, "Dog", 79, "Product_01.jpg"));
        this.products.add(new Product(2, "Dinosaur", 39, "Product_02.jpg"));
        this.products.add(new Product(3, "Iguana", 49, "Product_03.jpg"));
        this.products.add(new Product(4, "Bird", 89, "Product_04.jpg"));
        this.products.add(new Product(5, "Tiger", 79, "Product_05.jpg"));
        this.products.add(new Product(6, "Cat", 19, "Product_06.jpg"));
        this.products.add(new Product(7, "Lion", 29, "Product_07.jpg"));
        this.products.add(new Product(8, "Owl", 49, "Product_08.jpg"));
        this.products.add(new Product(9, "Cat 2", 79, "Product_09.jpg"));
        this.products.add(new Product(10, "Deer Stag", 99, "Product_10.jpg"));
        this.products.add(new Product(11, "Elephant", 119, "Product_11.jpg"));
        this.products.add(new Product(12, "Dog 2", 109, "Product_12.jpg"));
    }
}
