package log_simulation_using_interface;


public class EmailLogger implements Logger{

	@Override
	public void log(String message) {
		System.out.println("E-mail ile loglandi => " + message);		
	}

}
