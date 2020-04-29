package org.cap.service;

import java.util.List;

import org.cap.dao.ProductDao;
import org.cap.entities.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class ProductServiceImpl implements ProductService {
	private ProductDao productDao;

	public ProductDao getProductDao() {
		return productDao;
	}

	@Autowired
	public void setProductDao(ProductDao productDao) {
		this.productDao = productDao;
	}

	@Override
	public Product addProducts(Product product) {
		product = productDao.addProducts(product);
		return product;
	}

	@Override
	public List<Product> retrieveAllProducts() {
		List<Product> products = productDao.retrieveAllProducts();
		return products;
	}

}
