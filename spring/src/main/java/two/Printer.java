package two;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("print")
public class Printer {

	@Resource(name="color")
	private Ink ink;
	@Autowired
	@Qualifier("a4")
	private Paper paper;
	
	public void print(String str){
		ink.color();
		int size = paper.getSize();
		char [] cs = str.toCharArray();
		for (int i = 0; i < cs.length; i++) {
			if((i+1)%size==0){
				System.out.println("");
			}
			System.out.print(cs[i]);
		}
	}
	
}
