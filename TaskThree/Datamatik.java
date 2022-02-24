/*3.a Create a new file and save it by the name "Datamatik".
3.b Create a new file called "Teacher" and another one called "Student". Save both files with the extension .java, and in the same folder as Datamatik.java

3.i Returning to the Datamatik class add a main() function and in this function, create a new object/instance of the type Teacher and give it the name, age and gender of your teacher. 
3.j Also in the main() function of Datamatik, create two new objects/instances of the type Student. The first one, with your own name, age and gender. The second one with the name, age and gender of a student in your study group. 
3.k in the main() function print the name of the teacher
3.l in the main() function print the names of both students and which teams they are from. Do this witout writing any toString() methods*/
public class Datamatik {
	public static void main(String[] args) {
		Teacher Tess = new Teacher("Tess","30",true);
		Student Helena = new Student("Helena","22",true,"idk");
		Student Isak = new Student("Isak","23",false,"idk");
		System.out.println(Tess.getTeacherName());
		System.out.println(Isak.getName() +  Isak.getTeam());
		System.out.println(Helena.getName() +  Helena.getTeam());
	}
}

