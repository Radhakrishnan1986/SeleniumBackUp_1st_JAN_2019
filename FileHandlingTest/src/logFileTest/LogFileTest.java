package logFileTest;

import org.apache.log4j.PropertyConfigurator;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class LogFileTest {
	public static Logger log = LoggerFactory.getLogger(LogFileTest.class);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
PropertyConfigurator.configure("C:\\SeleniumWorkspace\\FileHandlingTest\\LIB\\log4j.properties");
log.info("I am an Information");
log.error("I am error");

	}
}
