package log_simulation_using_interface;

public class Utils {

	public static void runLoggers(Logger[] loggers,String message) {
		for (Logger logger : loggers) {
			logger.log(message);
		}
	}
}
