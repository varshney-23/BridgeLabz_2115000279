import java.util.Scanner;
public class FriendsComparisonAyushi {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int ageAmar = scanner.nextInt();
        int heightAmar = scanner.nextInt();
        int ageAkbar = scanner.nextInt();
        int heightAkbar = scanner.nextInt();
        int ageAnthony = scanner.nextInt();
        int heightAnthony = scanner.nextInt();
        int youngestAge = Math.min(ageAmar, Math.min(ageAkbar, ageAnthony));
        if (youngestAge == ageAmar) {
            System.out.println("The youngest friend is Amar with age " + ageAmar);
        } else if (youngestAge == ageAkbar) {
            System.out.println("The youngest friend is Akbar with age " + ageAkbar);
        } else {
            System.out.println("The youngest friend is Anthony with age " + ageAnthony);
        }
        int tallestHeight = Math.max(heightAmar, Math.max(heightAkbar, heightAnthony));
        if (tallestHeight == heightAmar) {
            System.out.println("The tallest friend is Amar with height " + heightAmar);
        } else if (tallestHeight == heightAkbar) {
            System.out.println("The tallest friend is Akbar with height " + heightAkbar);
        } else {
            System.out.println("The tallest friend is Anthony with height " + heightAnthony);
        }
    }
}
