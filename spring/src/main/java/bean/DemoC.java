package bean;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class DemoC {

	private String [] array;
	private List<String> list;
	private Set<String> set;
	private Map<String, String> map;
	public DemoC() {
		// TODO Auto-generated constructor stub
	}
	public String[] getArray() {
		return array;
	}
	public void setArray(String[] array) {
		this.array = array;
	}
	public List<String> getList() {
		return list;
	}
	public void setList(List<String> list) {
		this.list = list;
	}
	public Set<String> getSet() {
		return set;
	}
	public void setSet(Set<String> set) {
		this.set = set;
	}
	public Map<String, String> getMap() {
		return map;
	}
	public void setMap(Map<String, String> map) {
		this.map = map;
	}
	@Override
	public String toString() {
		return "DemoC [array=" + Arrays.toString(array) + ", list=" + list + ", set=" + set + ", map=" + map + "]";
	}
	
}
