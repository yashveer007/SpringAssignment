package org.cap.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import org.cap.entities.Product;
import org.springframework.stereotype.Repository;

@Repository
public class ProductDaoImpl implements ProductDao {
	private EntityManager em;

	public EntityManager getEm() {
		return em;
	}

	@PersistenceContext // @Autowired
	public void setEm(EntityManager em) {
		this.em = em;
	}

	@Override
	public Product addProducts(Product product) {
		product = em.merge(product);
		return product;
	}

	@Override
	public List<Product> retrieveAllProducts() {
		String jql = "from Product";
		TypedQuery<Product> query = em.createQuery(jql, Product.class);
		List<Product> list = query.getResultList();
		return list;
	}

}
