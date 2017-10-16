package action;

public class author {
	public int authorID;
	public String name;
	public int age;
	public String country;
	
	
	public author(){
	}
	
	public author(int authorID, String name, int age, String country) {
		this.authorID = authorID;
		this.name = name;
		this.age = age;
		this.country = country;
	}
	
	public int getauthorID() {
		return authorID;
	}
	
	public void setauthorID(int authorID) {
		this.authorID = authorID;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public int getage() {
		return age;
	}
	
	public void setage(int age) {
		this.age = age;
	}
	
	public String getCountry() {
		return country;
	}
	
	public void setCountry(String country) {
		this.country = country;
	}

	
}
