package three;

import org.springframework.stereotype.Component;

@Component
public class Teacher implements Intro{

	@Override
	public String show() {
		// TODO Auto-generated method stub
		return "teacher";
	}

}
