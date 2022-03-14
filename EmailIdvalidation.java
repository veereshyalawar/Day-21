import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EmailIdvalidation {

public static void main(String[] args) {
		/*
		 * 
		 *#####################################################
		 *  1.Taking user input of first name by using scanner
		 *  3.calling method to print to print results
		 *  2.Here we created a method which checks whether the name starts with capital letter or not
	     *    and have at least 3 letters
		 *#####################################################
		 *
		 */

		/*
		 * 
		 * $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
		 *1.Taking user input of first name And Last name by using scanner
		 *$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
		 *
		 */
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the First Name ");
		String FirstName = sc.nextLine();
		
		System.out.println("Enter the Last Name ");
		String LastName = sc.nextLine();

		/*
		 *$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
		 *3.calling method to print the result
		 *$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
		 *
		 */
		System.out.println(name(FirstName));
		
		
	}

	    /*
	     *$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
	     *2.Here we created a method which checks whether the First name and Last name starts with capital letter or not
	     *  and have at least 3 letters 
	     *$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
     	 *
	     */
public static boolean name(String firstName) {
	
	return firstName.matches("[A-Z]{1}[a-z]{3,}");
	
    }
}