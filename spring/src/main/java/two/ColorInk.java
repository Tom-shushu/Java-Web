package two;

import org.springframework.stereotype.Component;

@Component("color")
public class ColorInk implements Ink{

	@Override
	public void color() {
		System.out.println("ʹ�ò�ɫ");
	}

}
