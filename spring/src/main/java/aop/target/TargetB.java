package aop.target;

import org.springframework.stereotype.Component;

@Component("targetb")
public class TargetB {

	public void welcome(){
		System.out.println("bbbbb");
	}
}
