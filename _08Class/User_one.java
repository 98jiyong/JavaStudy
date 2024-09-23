package _08Class;

public class User_one {
	private String id;
	private String name;
	
	public void setId(String id) {
		if(id.length()>10) {
			this.id = id.substring(0, 10);
		}else {
			this.id = id;
		}
	}
	public String getId() {
		return id;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}



}
