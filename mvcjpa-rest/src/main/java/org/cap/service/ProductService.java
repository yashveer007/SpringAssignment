package org.cap.service;

import java.util.List;

import org.cap.entities.Product;

public interface ProductService {
	Product addProducts(Product product);

	List<Product> retrieveAllProducts();
}
