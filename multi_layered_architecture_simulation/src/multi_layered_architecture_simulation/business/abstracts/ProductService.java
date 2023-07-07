package multi_layered_architecture_simulation.business.abstracts;

import java.util.List;

import multi_layered_architecture_simulation.entities.concretes.Product;

public interface ProductService {

	void add(Product product);
	
	List<Product> getAll();
	
}
