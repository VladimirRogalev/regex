package telran.validator.tools;

public class Validator {

	public static boolean checkCreditCard(String str) {
		boolean check = str.matches("\\d{8,16}");
		return check;
	}

	public static boolean checkDateFormatEU(String str) {
		String dataPattern= "([0-9]{0,2}|3[0-1])\\W(0[1-9]|1[0-2])\\W\\d+";
//		boolean check = str.matches("([0-9]{0,2}|3[0-1])\\W(0[1-9]|1[0-2])\\W\\d+");
		return str.matches(dataPattern);
	}

	public static boolean checkDateFormatUS(String str) {
//		String dataPattern = "(0[1-9]|1[0-2])\\\\W([0-9]{0,2}|3[0-1])\\\\W\\\\d+";
		boolean check = str.matches("(0[1-9]|1[0-2])\\W([0-9]{0,2}|3[0-1])\\W\\d+");
		return check;
	}

	public static boolean checkPhoneNumber(String str) {
		String phonePattern = "[+]?\\d{2}\\(\\d{2}\\)\\d{4}-\\d{4}";
//		boolean check = str.matches("[+]?\\d{2}\\(\\d{2}\\)\\d{4}-\\d{4}");
		return str.matches(phonePattern);
	}

	public static boolean checkLessEquals255(String str) {
		String pattern = "([0-9]{0,25}[0-5])";
//		boolean check = str.matches("([0-9]{0,25}[0-5])");
		return str.matches(pattern);
	}

}
