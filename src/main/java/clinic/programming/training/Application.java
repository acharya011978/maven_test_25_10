package clinic.programming.training;

import java.util.*; 
import java.util.Scanner; 
import java.util.List;
import java.util.ArrayList;

public class Application {

	public void greet(){
	List<String> greetings = new ArrayList<>();
	greetings.add ("Hello, we are adding ArrayList here");
	
	for (String greeting : greetings){
		System.out.println("Greetings : " + greeting);
					 }
			   }



  public Application() { 
System.out.println ("\n \n Good Job. Keep it up !!!  \n Ok See you later ! \n Ba Bye !!!");
		    }
// method main(): ALWAYS the APPLICATION entry point
          public static void main (String[] args) {



System.out.println ("Starting Application");
	  
		String input, name; // Objects of String class 
		Scanner in = new Scanner(System.in); 
		System.out.println("Would you don't mind to tell your name: \t"); 	
		name = in.nextLine(); 
		System.out.println("Dear ! " + name +
                    ", Please enter a string/number to check if it is a palindrome : \t "); 
		input = in.nextLine(); 
		PalindromeAsString p = new PalindromeAsString();
		p.setOrigin(input); 
		p.palli();
		Application app = new Application();
		app.greet();
    }
}


