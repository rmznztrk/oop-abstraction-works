package log_simulation_using_interface;


public class DatabaseLogger implements Logger{

	@Override
	public void log(String message) {
		System.out.println("Database' e loglandi => " + message);		
	}
	
}
