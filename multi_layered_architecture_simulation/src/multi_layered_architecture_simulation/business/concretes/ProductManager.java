package multi_layered_architecture_simulation.business.concretes;

import java.util.List;

import multi_layered_architecture_simulation.business.abstracts.ProductService;
import multi_layered_architecture_simulation.core.LoggerService;
import multi_layered_architecture_simulation.dataAccess.abstracts.ProductDao;
import multi_layered_architecture_simulation.dataAccess.concretes.HibernateProductDao;
import multi_layered_architecture_simulation.entities.concretes.Product;

public class ProductManager implements ProductService{
    
	private ProductDao productDao;
	private LoggerService loggerService;
	
	public ProductManager(ProductDao productDao, LoggerService loggerService) {
		this.productDao = productDao;
		this.loggerService = loggerService;
	}
	
	@Override
	public void add(Product product) {
		if (product.getCategoryId() == 1) {
			System.out.println("Bu kategoride urun eklenemiyor!");
			return;
		}
		this.productDao.add(product);
		loggerService.logToSystem(product.getName());
	}

	@Override
	public List<Product> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

}
