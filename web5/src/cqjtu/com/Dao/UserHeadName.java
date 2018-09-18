package cqjtu.com.Dao;

public class UserHeadName {
	private int id;
	private String name;
	private String image;
	public UserHeadName(int id, String name, String image) {
		super();
		this.id = id;
		this.image = image;
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
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
	

}
