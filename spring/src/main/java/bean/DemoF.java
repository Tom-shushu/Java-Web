package bean;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("df")
public class DemoF {

	@Value("1")
	private Integer id;
	@Value("уехЩ")
	private String name;
	@Autowired
	@Qualifier("de")
	private DemoE hhhh;
	@Resource(name="dg")
	private DemoG dg;
	@Override
	public String toString() {
		return "DemoF [id=" + id + ", name=" + name + ", hhhh=" + hhhh + ", dg=" + dg + "]";
	}
	
}
/*<bean id="df" class="bean.DemoF">
	<property name="id" value="1"/>
	<property name="de" ref="de"/>
</bean>*/