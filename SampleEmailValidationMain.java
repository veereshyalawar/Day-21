import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SampleEmailValidationMain {
	/**
	 * Steps
	 * ===================================================================
	 * 1.Creating an array contain sample email Id 
	 * 2.creating an method to print and validate email samples
	 * 3. loop a sample mails
	 * 4.created a patter and matcher to check sample arrays
	 * ==================================================================
	 */

	static String[] emails = { "abc@yahoo.com", "abc-100@yahoo.com", "abc.100@yahoo.com", "abc111@abc.com",
			"abc-100@abc.net", "abc.100@abc.com.au", "abc@1.com", "abc@gmail.com.com", "abc+100@gmail.com", "abc",
			"abc@.com.my", "abc123@gmail.a", "abc123@.com", "abc123@.com.com", ".abc@abc.com", "abc()*@gmail.com",
			"abc@%*.com", "abc..2002gmail.com", "abc.@gmail.com", "abc@abc@gmail.com", "abc@gmail.com.1a",
			"abc@gmail.com.aa.au"};

	
	/*
	 * 2.creating an method to print and validate email samples
	 */
	public void testForEmails() {

		System.out.println("****************Checking the all sample Emails***********");
		System.out.println();
		
		/*
		 *3. loop a sample mails
		 */
		for (int i = 0; i < emails.length; i++) {

			/*
			 * 4.created a patter and matcher to check sample arrays
			 */
			String regex = "^[a-zA-Z0-9]+([._+-]*[0-9A-Za-z]+)*@[a-zA-Z0-9]+.[a-zA-Z]{2,4}([.][a-z]{2,4})?$";
			
			Pattern pattern = Pattern.compile(regex);
            Matcher matcher = pattern.matcher(emails[i]);

			if (matcher.matches()) {
				System.out.println("Email - " + emails[i]);
				System.out.println("Email is valid");

			} else {
				System.out.println("Email - " + emails[i]);
				System.out.println("Email is Invalid");
			}
			System.out.println(" ");

		}
	}
}