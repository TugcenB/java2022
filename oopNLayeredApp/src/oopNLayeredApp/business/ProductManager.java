package oopNLayeredApp.business;

import java.util.List;

import oopNLayeredApp.core.logging.Logger;
import oopNLayeredApp.dataAccess.ProductDao;
import oopNLayeredApp.entities.Product;

public class ProductManager {
	private ProductDao productDao;
	private Logger[] loggers;

	public ProductManager(ProductDao productDao, Logger[] loggers) {
		this.productDao = productDao;
		this.loggers = loggers;
	}


	public void add(Product product) throws Exception {
		//business rules
		if (product.getPrice()<10) {
			throw new Exception("Ürün fiyatı 10'dan küçük olamaz");
		}
		
		productDao.add(product);
		
		for (Logger logger: loggers) {
			logger.Log(product.getName());
		}
	}

}
