import java.util.*;
public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		String str = scanner.next();
		StringBuilder sBuilder = new StringBuilder();
		for(int i = str.length() - 1 ; i >= 0 ; i--) {
			sBuilder.append(str.charAt(i));
		}
		System.out.print(sBuilder);
		scanner.close();
	}
}
