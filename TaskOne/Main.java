public class Main {
	public static void main (String[] args){
		System.out.println("Hej med dig");
		/* Det er constructoren fra person.java som vi kalder her, så det skal stå
		på samme måde som i constructoren*/
		Person Helena = new Person ("Helena","Lykstoft","xxxxxx-xxxx","22");
		System.out.println("Hi my name is "+ Helena.getFullName());
		System.out.println("I am " + Helena.getAge() + " years old.");
		System.out.println(Helena.getcprNumber());
	}
}