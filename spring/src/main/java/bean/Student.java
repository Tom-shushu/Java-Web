package bean;

public class Student {

	private Integer id;
	private String name;
	private Double weight;
	private String address;
	private Character sex;
	private Boolean isNew;
	public Student() {
		// TODO Auto-generated constructor stub
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Double getWeight() {
		return weight;
	}
	public void setWeight(Double weight) {
		this.weight = weight;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public Character getSex() {
		return sex;
	}
	public void setSex(Character sex) {
		this.sex = sex;
	}
	public Boolean getIsNew() {
		return isNew;
	}
	public void setIsNew(Boolean isNew) {
		this.isNew = isNew;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", weight=" + weight + ", address=" + address + ", sex=" + sex
				+ ", isNew=" + isNew + "]";
	}
	
}
