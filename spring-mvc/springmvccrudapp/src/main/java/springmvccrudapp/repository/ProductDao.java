package springmvccrudapp.repository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import springmvccrudapp.entity.Product;

@Component
public class ProductDao {

	@Autowired
	private HibernateTemplate hibernateTemplate;
	
	@Transactional
	public void createProduct(Product product)
	{
		this.hibernateTemplate.saveOrUpdate(product);
	}
	
	public List<Product> getAllProduct()
	{
		List<Product> allProducts = this.hibernateTemplate.loadAll(Product.class);
		return allProducts;
	}
	
	@Transactional
	public void deleteProduct(int pid)
	{
		Product product = this.hibernateTemplate.load(Product.class, pid);
		this.hibernateTemplate.delete(product);
	}
	
	public Product getProductById(int pid)
	{
		return this.hibernateTemplate.get(Product.class, pid);
	}
}
