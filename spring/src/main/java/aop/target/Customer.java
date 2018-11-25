package aop.target;

import org.springframework.stereotype.Component;

@Component("customer")
public class Customer {

	public void buy() {
		// int i = 9 / 0;
		System.out.println("我准备购买东西呀!!");
	}

	public void buy(String name, double price) {
		System.out.println("我准备购买:" + name + ",带了:" + price + "元");
	}
}
