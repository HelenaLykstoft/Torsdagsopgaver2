class Main{
  public static boolean happy = true;

public static void main(String [] args) {
   if (iAmHappy())
   {
     System.out.println("I clap my hands");
   }
   else
   {
     System.out.println("I don't clap my hands"); 
   }
   upperCase("Davs");
   isItUpperCase("Helena");
}


public static boolean iAmHappy()
{
  // fill out what is missing here: 
  return happy;
}
// 2.b Write a function that receives to integers as parameters and returns the sum of them.
public static int getSum(int a, int b){
  return a + b;
}
// 2.c Write a function that receives a string and returns it as uppercase.
public static String upperCase (String text){
  String answer = text.toUpperCase();
  System.out.println(answer);
  return answer;
}
/*2.d Write a function that receives a string and returns true if the first letter of the 
string is uppercase. (Hints: ".charAt(0)" and "Character.isUpperCase('a');" )*/
public static boolean isItUpperCase (String text){
  if(Character.isUpperCase(text.charAt(0))){
    System.out.println("The first letter in the word "+ text +" is an uppercase");
    return true;
  }
  return false;
}
}