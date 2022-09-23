import java.util.Iterator;

public class Main {

	public static void main(String[] args) {
		//set
		Product product1 = new Product();
		product1.setName("Delonghi Kahve Makinesi");
		
		
		//get
		//System.out.println(product.name);
		Product product2 = new Product();
		product2.setName("Delonghi Kahve Makinesi");
		
		Product product3 = new Product();
		product3.setName("Delonghi Kahve Makinesi");
		
		Product[] products = {product1, product2, product3};
		
		System.out.println("<ul>");
		for (Product product : products) {
			System.out.println("<li>"+product.getName()+"</li>");
			
		}
		System.out.println("</ul>");
		
		IndividualCustomer individualCustomer = new IndividualCustomer();
		individualCustomer.setId(0);
		individualCustomer.setCustomerNumber("123");
		individualCustomer.setFirstName(null);
		
		CorporateCustomer corporateCustomer = new CorporateCustomer();
		corporateCustomer.setId(1);
		corporateCustomer.setCompanyName("Kodlama.io");
		
		Customer[] customers = {individualCustomer,corporateCustomer};
		
		

	}

}
