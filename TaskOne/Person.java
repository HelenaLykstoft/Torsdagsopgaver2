public class Person {
	// 1. Fields
	private String firstName;
	private String lastName;
	private String cprNr;
	private String age;
	// 2. Constructor 
	// this. betyder at vi tager integeren oppe fra Fields og ikke dem i ()
	public Person (String fName, String lName, String cpr, String ageNow){
		this.firstName = fName;
		this.lastName = lName;
		this.cprNr = cpr;
		this.age = ageNow;
	}
	// 3. Methods
	public String getFullName (){
		return this.firstName + " " + this.lastName;
	}
	public String getFirstName(){
		return this.firstName;
	}
	public String getLastName(){
		return this.lastName;
	}
	public String getcprNumber (){
		return this.cprNr;
	}
	public String getAge (){
		return this.age;
	}
	public void changeName( String newFirstName, String newLastName){
		this.firstName = newFirstName;
		this.lastName = newLastName;
	}

}