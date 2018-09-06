package palindromerecursion;

/**
 * @author Lavin
 *
 */
class MainClass {
	public static void main(String[] args) {

		/**
		 * Takes input String. Case Senstively checks for Palindrome
		 */
		String s = "Nitin";
		System.out.println("String is: " + s);
		checkPalindrome(s, 0);

		s = "nitin";
		System.out.println("\nString is: " + s);
		checkPalindrome(s, 0);

		s = "abccba";
		System.out.println("\nString is: " + s);
		checkPalindrome(s, 0);

		s = "ABCDEF";
		System.out.println("\nString is: " + s);
		checkPalindrome(s, 0);
	}

	public static void checkPalindrome(String s, int i) {

		if (i > s.length() / 2) {
			System.out.println("String is Palindrome");
			return;
		}

		if (s.charAt(i) == s.charAt(s.length() - i - 1)) {
			checkPalindrome(s, i + 1);
		} else {
			System.out.println("String is Not Palindrome");
		}
	}
}
/**
 * 
 * String is: Nitin. String is Not Palindrome
 * 
 * String is: nitin. String is Palindrome
 * 
 * String is: abccba. String is Palindrome
 * 
 * String is: ABCDEF. String is Not Palindrome
 * 
 */
