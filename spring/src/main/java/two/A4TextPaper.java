package two;

import org.springframework.stereotype.Component;

@Component("a4")
public class A4TextPaper implements Paper{

	@Override
	public int getSize() {
		// TODO Auto-generated method stub
		return 12;
	}

}
