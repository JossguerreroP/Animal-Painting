package com.app.animalpainting.web.mapper;
import com.app.animalpainting.domain.Product;
import com.app.animalpainting.web.model.ProductDto;
import org.mapstruct.Mapper;
@Mapper
public interface ProductMapper {

	Product productDtoToProduct(ProductDto dto);
	ProductDto  producToProductDto(Product product);
}

