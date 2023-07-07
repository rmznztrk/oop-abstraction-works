package multi_layered_architecture_simulation;

import multi_layered_architecture_simulation.business.abstracts.ProductService;
import multi_layered_architecture_simulation.business.concretes.ProductManager;
import multi_layered_architecture_simulation.core.JLoggerManagerAdapter;
import multi_layered_architecture_simulation.dataAccess.concretes.HibernateProductDao;
import multi_layered_architecture_simulation.entities.concretes.Product;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ProductService productService = new ProductManager(new HibernateProductDao(), new JLoggerManagerAdapter());
		
		Product product = new Product(13,2,"casper",14.000,9);
		
		productService.add(product);
	
	}

}


