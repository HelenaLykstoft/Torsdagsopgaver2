/*For all exercises in Task 4, you are allowed to complete them with arrays of a fixed size. But do consider how the functions you write in 4.b, 4.c, 4.d,  4.e would work, if the array received as a parameter would not have a fixed length. 
4.a create arrays of the following type and assign it at least 3 different values: 
    - Integer array
    - String array
    - boolean array
4.b Write a function that takes in an array of strings as parameter and prints each string.
4.c Write a function that receives an integer array as a parameter and returns the sum of all elements in the array.
4.d Write a function that receives an integer array as a parameter and returns the average value.	
4.e Consider how you could write a function that takes in an integer array as a parameter and returns the array sorted from lowest to highest value.*/
class Arrays{

public static void main(String[] args){
	String[] stringArray ={"a","b","c"};
	int[] intArray ={1,2,3};
	boolean[] booleanArray ={true,false,true};
	stFunc(stringArray);
	int intFunc = intFunc(intArray);
	System.out.println(intFunc);
	int intAve = intAve(intArray);
	System.out.println(intAve);
}

public static void stFunc (String[] stringArr){
	for (String d:stringArr){
		System.out.println(d);
	}

}
public static int intFunc (int[] intArr){
	int sum =0;
	for (int i:intArr){
		sum+=i;
	}
	return sum;
}
public static int intAve (int[] intArr){
	int e = intFunc(intArr);
	return e/intArr.length;
}
}