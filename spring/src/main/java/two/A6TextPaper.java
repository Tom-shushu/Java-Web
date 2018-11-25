package two;

import org.springframework.stereotype.Component;

@Component("a6")
public class A6TextPaper implements Paper{

	@Override
	public int getSize() {
		return 16;
	}

}
