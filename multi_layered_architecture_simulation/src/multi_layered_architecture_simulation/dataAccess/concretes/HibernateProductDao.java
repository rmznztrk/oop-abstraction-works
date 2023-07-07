package multi_layered_architecture_simulation.dataAccess.concretes;

import java.util.List;

import multi_layered_architecture_simulation.dataAccess.abstracts.ProductDao;
import multi_layered_architecture_simulation.entities.concretes.Product;

public class HibernateProductDao implements ProductDao{

	@Override
	public void add(Product product) {
		System.out.println("Urun hibernate ile eklendi: " + product.getName());
	}

	@Override
	public void delete(Product product) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void update(Product product) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Product get(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Product> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

}
