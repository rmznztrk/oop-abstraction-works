package log_simulation_using_interface;


public class FileLogger implements Logger{

	@Override
	public void log(String message) {
		System.out.println("File'e loglandi => " + message);		
	}
	
}
