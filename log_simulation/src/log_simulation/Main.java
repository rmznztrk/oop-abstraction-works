package log_simulation;

public class Main {
	public static void main(String[] args) {
    
		
		CustomerManager.add(new DatabaseLogger());
		CustomerManager.add(new EmailLogger());
		CustomerManager.add(new FileLogger());
		
/*  
 **bad code		
		LogManager logManager = new LogManager();
		logManager.log(3); 
*/   
		
		
		 
	}

}
