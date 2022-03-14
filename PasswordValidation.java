
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PasswordValidation {

	public static void main(String[] args) {
		/*
		 * 
		 * ##################################################### 
		 * 1.Taking user input of password
		 * 3.calling method to print to print results  
		 * 2.Here we created a method which checks whether the entered password is maches or not
		 * #####################################################
		 *
		 */

		/*
		 * 
		 * $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$ 
		 * 1.Taking user input of password
		 * $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
		 *
		 */
		Scanner sc = new Scanner(System.in);
		System.out.println("password must contain atleast 8 character");
		System.out.println("Enter the password: ");
		String Password = sc.nextLine();

		/*
		 * $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$ 
		 * 3.calling method to print
		 * the result $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
		 *
		 */
		System.out.println(password(Password));

	}

	/*
	 * $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$ 
	 * 2.Here we created a method which checks whether the entered password is matches or not
	 * $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
	 *
	 */
	public static boolean password(String password) {

		return password.matches("[A-za-z0-9]{8,}");

	}
}