package oopNLayeredApp;

import java.util.List;

import oopNLayeredApp.business.ProductManager;
import oopNLayeredApp.core.logging.DatabaseLogger;
import oopNLayeredApp.core.logging.FileLogger;
import oopNLayeredApp.core.logging.Logger;
import oopNLayeredApp.dataAccess.HibernateProductDao;
import oopNLayeredApp.dataAccess.JdbcProductDao;
import oopNLayeredApp.entities.Product;

public class Main {

	public static void main(String[] args) throws Exception {
		Product product1 = new Product(1,"IPhone Xr",10000);
		
		Logger[] loggers= {new DatabaseLogger(), new FileLogger()};
		
		ProductManager productManager = new ProductManager(new JdbcProductDao(),loggers);
		productManager.add(product1);
		

	}

}
