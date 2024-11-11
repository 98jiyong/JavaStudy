package _09Class;

public class _01_Basic_one {
	
	String name = null;
	
	public void setName(String n) {
		name = n;
	}
	public String getName() {
		return name;
	}
	
	public String maskName(String m) {
		String maskingName = name.concat(m);
		return maskingName;
	}
}
