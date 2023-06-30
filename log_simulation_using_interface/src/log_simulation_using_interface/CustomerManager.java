package log_simulation_using_interface;

public class CustomerManager {
	
	private Logger logger;
	private Logger[] loggers;
	
	public CustomerManager(Logger logger) {
		this.logger = logger;  //dependency injection
	}
	public CustomerManager(Logger[] loggers) {
		this.loggers = loggers;  //dependency injection
	}
	
	
	public void add(Customer customer) {
		System.out.println("*Musteri eklendi: " + customer.getFirstName());
		logger.log(customer.getFirstName()); //*loosly coupled
/*		
 * tightly coupled
		DatabaseLogger databaseLogger = new DatabaseLogger();
		databaseLogger.log("musteri eklendi: " + customer.getFirstName());
*/		
	}
	
	public void addMultiple(Customer customer) {
		System.out.println("*Musteri eklendi: " + customer.getFirstName());
		Utils.runLoggers(loggers, customer.getFirstName());
	}
	
	public void delete(Customer customer) {
		System.out.println("*Musteri silindi: " + customer.getFirstName());
		logger.log(customer.getFirstName()); //*loosly coupled	
/*
 * tightly coupled
		DatabaseLogger databaseLogger = new DatabaseLogger();
		databaseLogger.log("musteri silindi: " + customer.getFirstName());
*/
	}
	
	public void deleteMultiple(Customer customer) {
		System.out.println("*Musteri silindi: " + customer.getFirstName());
		Utils.runLoggers(loggers, customer.getFirstName());
	}

}
