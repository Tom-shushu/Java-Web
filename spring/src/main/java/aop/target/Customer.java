package aop.target;

import org.springframework.stereotype.Component;

@Component("customer")
public class Customer {

	public void buy() {
		// int i = 9 / 0;
		System.out.println("��׼��������ѽ!!");
	}

	public void buy(String name, double price) {
		System.out.println("��׼������:" + name + ",����:" + price + "Ԫ");
	}
}
