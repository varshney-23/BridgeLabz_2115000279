public class CensorBadWords {
    public static void main(String[] args) {
        String text = "This is a damn bad movie with some stupid plot.";
        String[] badWords = {"damn", "stupid"};
        System.out.println(censorBadWords(text, badWords));
    }

    public static String censorBadWords(String text, String[] badWords) {
        for (String badWord : badWords) {
            text = text.replaceAll("\\b" + badWord + "\\b", "");
        }
        return text;
    }
}
