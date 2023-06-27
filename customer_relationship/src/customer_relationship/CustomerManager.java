package customer_relationship;

public class CustomerManager {

	public static void add(Customer customer) {
		System.out.println("customer number: "+customer.customerNumber + ", eklendi."); 
	}
	
	
	//bulk insert
	public static void addMultiple(Customer[] customers) {
		for(Customer customer : customers) {
			add(customer);
		}
	}
	
	
}
