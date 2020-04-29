package org.cap.controller;

import org.cap.dto.ProductDto;
import org.cap.entities.Product;
import org.cap.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ProductRestController {

    @Autowired
    private ProductService productService;

  
	@PostMapping("/product/add")
    public ResponseEntity<Product> addEmployee(@RequestBody ProductDto dto) {
    	Product product = convert(dto);
    	product = productService.addProducts(product);
        ResponseEntity<Product> response = new ResponseEntity<>(product, HttpStatus.OK);
        return response;
    }

    Product convert(ProductDto dto) {
        Product product = new Product();
        product.setProductName(dto.getProductName());
        product.setProductPrice(dto.getProductPrice());
        return product;
    }


    @GetMapping("/product/show")
    public ResponseEntity<List<Product>> fetchAll() {
        List<Product> products = productService.retrieveAllProducts();
        ResponseEntity<List<Product>> response = new ResponseEntity<>(products, HttpStatus.OK);
        return response;
    }

   

}
