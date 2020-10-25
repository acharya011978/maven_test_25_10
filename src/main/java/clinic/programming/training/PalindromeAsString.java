package clinic.programming.training;
import java.util.*; 
public class PalindromeAsString {

private String original; 
public String reverse = ""; 
public String setOrigin(String n) { 

original = n; 
return 	original;
}

public String getOriginal() { 
return original;
}

public void palli(){ 
int length = original.length(); 
for ( int i = length - 1; i >= 0; i-- ) 
reverse = reverse + original.charAt(i); 
if(original.equals(reverse))
		System.out.println("Yes, it's a palindrome"); 
else System.out.println("Entered string is not a palindrome.");
 		  }
}
                                                                                                           
 
