package com.app.animalpainting.web.model;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.UUID;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder

public class Product {
   
	private int id;
    private String name;
    private int price;
    private String imageUrl;
   
}
