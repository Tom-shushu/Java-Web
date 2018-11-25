package three;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


@Component
public class School implements Intro{

	@Resource
	private Print print;
	
	
	public void print(@Autowired Intro intro){
		print.print(intro.show());
	}
	
	@Override
	public String show() {
		// TODO Auto-generated method stub
		return "school";
	}

}
