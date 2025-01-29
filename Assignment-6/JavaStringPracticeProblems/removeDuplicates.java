import java.util.*;
public class removeDuplicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		String string = scanner.next();
		StringBuilder sBuilder = new StringBuilder();
		HashSet<Character> set = new HashSet<Character>();
		for(char ch : string.toCharArray()) {
			if(set.contains(ch)) {
				continue;
			} else {
				sBuilder.append(ch);
				set.add(ch);
			}
		}
		System.out.print("Removed: " + sBuilder);
		scanner.close();
	}
}
