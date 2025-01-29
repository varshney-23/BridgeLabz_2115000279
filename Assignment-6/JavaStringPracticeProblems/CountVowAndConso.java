import java.util.*;
public class CountVowAndConso {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		char [] chArray = {'a', 'e', 'i', 'o', 'u'};
		HashSet<Character> set = new HashSet<Character>();
		for(char ch : chArray) {
			set.add(ch);
		}
		int vow = 0, cons  = 0;
		for(char ch : str.toCharArray()) {
			if(set.contains(ch)) {
				vow++;
			} else {
				cons++;
			}
		}
		System.out.println("No. of Vowels: " + vow + "\n" + "No. of Consonants: " + cons);
		sc.close();
	}

}
