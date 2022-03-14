import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class LastNameValidation {

public static void main(String[] args) {
		/*
		 * 
		 *#####################################################
		 *  1.Taking user input of emailId by using scanner
		 *  3.calling method to print to print results
		 *  2.created method to check email minimum 3-char minimum 2-number minimum one @ minimum
	     *    one . minimum 3 char at last
		 *#####################################################
		 *
		 */

		/*
		 * 
		 * $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
		 *1.Taking user input of emailId by using scanner
		 *$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
		 *
		 */
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Example: veereshyalawar2@gmail.com\n");
		System.out.println("Enter the Email address : ");
		String emailId = sc.nextLine();

		/*
		 *$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
		 *3.calling method to print the result
		 *$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
		 *
		 */
		System.out.println(email(emailId));
		
		
	}

	    /*
	     *$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
	     *2.created method to check email minimum 3-char minimum 2-number minimum one @ minimum
	     *  one . minimum 3 char at last
	     *$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
     	 *
	     */
public static boolean email(String email) {
	
	return email.matches("[A-Za-z0-9]+[@][a-z]+[.][a-z]{2,3}");
	
    }
}