/*3.c in the Student class, declare the class "Student" and add 4 fields: "name", "age", "isFemale", "datamatikerTeam" using appropriate data types for each.
3.d in the Student class, add a constructor that takes in 4 parameters with the names "tmpName", "tmpAge", "tmpIsFemale", "tmpDatamatikerTeam" with the same data types used in 3.c
3.e populate the fields created in 3.c with the parameters of the constructor added in 3.d (you may use shaddowing with the keyword this)*/
public class Student {
	// Fields
	private String studentName;
	private String studentAge;
	private boolean isFemale;
	private String datamatikerTeam;

	// Constructor
	public Student (String tmpName, String tmpAge, boolean tmpIsFemale, String tmpDatamatikerTeam){
		this.studentName=tmpName;
		this.studentAge=tmpAge;
		this.isFemale=tmpIsFemale;
		this.datamatikerTeam=tmpDatamatikerTeam;
	}
	// functions
	public String getName(){
		return this.studentName;
	}
	public String getTeam(){
		return this.datamatikerTeam;
	}
}

