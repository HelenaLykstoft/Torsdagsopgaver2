/*3.a Create a new file and save it by the name "Datamatik".
3.b Create a new file called "Teacher" and another one called "Student". Save both files with the extension .java, and in the same folder as Datamatik.java

3.i Returning to the Datamatik class add a main() function and in this function, create a new object/instance of the type Teacher and give it the name, age and gender of your teacher. 
3.j Also in the main() function of Datamatik, create two new objects/instances of the type Student. The first one, with your own name, age and gender. The second one with the name, age and gender of a student in your study group. 
3.k in the main() function print the name of the teacher
3.l in the main() function print the names of both students and which teams they are from. Do this witout writing any toString() methods*/
public class Datamatik {

	static Student[] studArray = new Student[10];

	public static void main(String[] args) {
		Student Helena = new Student("Helena","22",true,"idk");
		Student Isak = new Student("Isak","23",false,"idk");
		System.out.println(Isak.getName() +  Isak.getTeam());
		System.out.println(Helena.getName() +  Helena.getTeam());

		studArray[0] = new Student("Monkey","230",false,"Supercool");
		studArray[1] = new Student("Pineapple","7",true,"Foodies");
		studArray[2] = new Student("Rhinocerus","1024",false,"Supercool");
		studArray[3] = new Student("Dino","104865",true,"Supercool");
		studArray[4] = new Student("Axolotl","1",false,"Supercool");
		studArray[5] = new Student("Banana","14",true,"Foodies");
		studArray[6] = new Student("Viper","28",true,"Valo");
		studArray[7] = new Student("Ahri","16",true,"Lol");
		studArray[8] = new Student("Brand","32",false,"Lol");
		studArray[9] = new Student("Kiwi","4",true,"Foodies");
		String result = coolies(studArray,5);
		System.out.println(result);
	}
	public static String coolies (Student[] studArr,int index){
		return studArr[index].studentName;
	}
}




/*5.a Create a new class Datamatik or reuse the one you created earlier. Add an array of Students with 10 elements in it. This should be a class variable (static). From the main method, add 10 
student instances to the array. Each student must have a unique reference.

5.b Create a function in Datamatik that takes in the array from 5.a as a parameter as well as an integer. The function should return the field "name" (the name of the student) and print it 
(the integer should be used as the index nuber of the student to be printed). Call this method with different parameters (only the integer - not the array) from the main() of Datamatik.

5.c Create a similar function to that of 5.b, but instead of receiving the array and an integer, it receives the array and a string. Loop through all elements in the array until you find the element 
with the name received as a parameter. Then return the index of that student. Call this method with different names from the main method of Datamatik*/