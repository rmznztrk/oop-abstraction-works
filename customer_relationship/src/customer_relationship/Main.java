package customer_relationship;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		IndividualCustomer ramazan = new IndividualCustomer();
		CorporateCustomer kardesler = new CorporateCustomer();
		SyndicateCustomer xSendikaci = new SyndicateCustomer();
		
		ramazan.customerNumber = "111";
		kardesler.customerNumber = "133";
		xSendikaci.customerNumber = "150";
		
		System.out.println("Bireysel ekleme");
		CustomerManager.add(ramazan); 
		CustomerManager.add(kardesler);
		CustomerManager.add(xSendikaci);
		
		Customer[] customers = {ramazan, kardesler, xSendikaci};
		
		System.out.println("Toplu ekleme");
		CustomerManager.addMultiple(customers);
		
		
	}

}
