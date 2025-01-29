import java.util.*;
public class PalindromeCheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String string = sc.next();
		System.out.print(ifPalindrome(string));
		sc.close();
	}
	static boolean ifPalindrome(String string) {
		int str = 0;
		int lst = string.length() - 1;
		while(str <= lst) {
			if(string.charAt(str) != string.charAt(lst)) {
				return false;
			}
			str++;
			lst--;
		}
		return true;
	}
}
