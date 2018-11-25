package bean;

import java.text.SimpleDateFormat;
import java.util.Date;

public class ClientInfo {

	private String name;
	private String image;
	private String date;
	
	public ClientInfo() {
		// TODO Auto-generated constructor stub
	}
	
	public ClientInfo(String name, String image) {
		this.name = name;
		this.image = image;
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		this.date = sdf.format(new Date());
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getImage() {
		return image;
	}
	public void setImage(String image) {
		this.image = image;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
}
