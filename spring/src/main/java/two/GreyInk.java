package two;

import org.springframework.stereotype.Component;

@Component("grey")
public class GreyInk implements Ink{

	@Override
	public void color() {
		System.out.println("ʹ�úڰ�ɫ");
	}

}
