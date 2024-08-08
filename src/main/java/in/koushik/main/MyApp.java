package in.koushik.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import in.koushik.beans.Motor;

public class MyApp {

	public static void main(String[] args) {
		//ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		Motor motor = context.getBean(Motor.class);
		motor.doWork();
		
		ConfigurableApplicationContext cfgCtxt = (ConfigurableApplicationContext) context;
		
		cfgCtxt.registerShutdownHook();
		
	}

}
