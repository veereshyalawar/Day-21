import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MobileNumberValidation {

	public static void main(String[] args) {
		/*
		 * 
		 * ##################################################### 
		 * 1.Taking user input of
		 * mobile number with country code by using scanner 
		 * 3.calling method to print to
		 * print results 
		 * 2.Here we created a method which checks whether the country
		 * code is two digits or not and then space between country code and mobile
		 * number entered is of 10 digits or not
		 * #####################################################
		 *
		 */

		/*
		 * 
		 * $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$ 1.Taking user input of
		 * mobile number with country code by using scanner
		 * $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
		 *
		 */
		Scanner sc = new Scanner(System.in);
		System.out.println("Give space between country code and mobile number../n");
		System.out.println("Enter the mobile number starting with country code: ");
		String MobileNo = sc.nextLine();

		/*
		 * $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$ 3.calling method to print
		 * the result $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
		 *
		 */
		System.out.println(mobile(MobileNo));

	}

	/*
	 * $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$ 2.Here we created a
	 * method which checks whether the country code is two digits or not and then
	 * space between country code and mobile number entered is of 10 digits or not
	 * $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
	 *
	 */
	public static boolean mobile(String mobile) {

		return mobile.matches("[0-9]{2}\s[0-9]{10}");

	}
}