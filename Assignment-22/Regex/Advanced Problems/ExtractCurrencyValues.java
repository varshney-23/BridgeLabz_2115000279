import java.util.regex.*;

public class ExtractCurrencyValues {
    public static void main(String[] args) {
        String text = "The price is $98.89, and the discount is 18.09.";
        Pattern pattern = Pattern.compile("\\$?\\d+(\\.\\d{2})?");
        Matcher matcher = pattern.matcher(text);

        System.out.println("Extracted Currency: ");
        while (matcher.find()) {
            System.out.println(matcher.group());
        }
    }
}