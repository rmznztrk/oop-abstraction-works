package log_simulation_using_interface;

public class Main {

	public static void main(String[] args) {
		
		System.out.println("Tekli loglama");
		CustomerManager customerManager = new CustomerManager(new DatabaseLogger());
		Customer customer = new Customer(151, "Ramazan", "Ozturk");
		customerManager.add(customer);
		
		System.out.println("----");
		
		System.out.println("Coklu loglama");
		Logger[] loggers = {new SmsLogger(),new DatabaseLogger(),new FileLogger()};
		CustomerManager customerManager2 = new CustomerManager(loggers);
		customerManager2.addMultiple(customer);
		customerManager2.deleteMultiple(customer);
		
//		System.out.println("init");
		
	}

}
