package LibraryPack;

public class Person {
	int personID;
	String name;
	public Person() {
		// TODO Auto-generated constructor stub
	}
	
	
	public Person(int personID, String name) {
		super();
		this.personID = personID;
		this.name = name;
	}


	public int getPersonID() {
		return personID;
	}
	public void setPersonID(int personID) {
		this.personID = personID;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
}
