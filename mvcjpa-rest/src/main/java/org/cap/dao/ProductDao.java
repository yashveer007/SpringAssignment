package org.cap.dao;

import java.util.List;

import org.cap.entities.Product;

public interface ProductDao {
	Product addProducts(Product product);

	List<Product> retrieveAllProducts();
}
