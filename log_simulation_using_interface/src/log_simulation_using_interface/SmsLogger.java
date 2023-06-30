package log_simulation_using_interface;


public class SmsLogger implements Logger{

	@Override
	public void log(String message) {
		System.out.println("Sms ile loglandi => " + message);
	}

}
