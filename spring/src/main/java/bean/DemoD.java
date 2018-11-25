package bean;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

public class DemoD {

	private Integer id;
	private String name;
	private DemoB db;
	private Boolean isNew;
	private String [] array;
	private List<DemoA> list;// Set效果一样
	private Map<String, Object> map;
	public DemoD(Integer id, String name, DemoB db, Boolean isNew, String[] array, List<DemoA> list,
			Map<String, Object> map) {
		this.id = id;
		this.name = name;
		this.db = db;
		this.isNew = isNew;
		this.array = array;
		this.list = list;
		this.map = map;
	}
	@Override
	public String toString() {
		return "DemoD [id=" + id + ", name=" + name + ", db=" + db + ", isNew=" + isNew + ", array="
				+ Arrays.toString(array) + ", list=" + list + ", map=" + map + "]";
	}
	
}
