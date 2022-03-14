
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PasswordRule2 {

	public static void main(String[] args) {
		/*
		 * 
		 * ##################################################### 
		 * 1.Taking user input of password
		 * 3.calling method to print to print results  
		 * 2.Here we created a method which checks whether the entered password is maches or not
		 * and at least contain an upper case and one numeric or not
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
		System.out.println("Password must contain atleast 8 character and atleast one upper case and one numeric");
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
	 *   and at least contain an upper case and one numeric or not
	 * $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
	 *
	 */
	public static boolean password(String password) {

		return password.matches("^(?=.*[A-Z]+)(?=.*[0-9]+)(?=.*[a-z]+).{8,}$");

	}
}