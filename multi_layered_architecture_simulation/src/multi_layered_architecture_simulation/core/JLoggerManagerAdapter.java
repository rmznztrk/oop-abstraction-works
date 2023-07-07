package multi_layered_architecture_simulation.core;

import multi_layered_architecture_simulation.jlogger.JLoggerManager;

public class JLoggerManagerAdapter implements LoggerService{

	@Override
	public void logToSystem(String message) {
		JLoggerManager jLoggerManager = new JLoggerManager();
		jLoggerManager.log(message);
	}

}
