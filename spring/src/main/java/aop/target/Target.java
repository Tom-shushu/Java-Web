package aop.target;

import org.springframework.stereotype.Component;

@Component("target")
public class Target {

	public void welcome(){
		System.out.println("Œ“¿¥¡À!");
	}
}
