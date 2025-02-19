import java.io.*;
import java.util.*;

public class WordFrequency {
	
	public static void main(String[] args) throws IOException {
        System.out.println(helper("input.txt"));
    }
	
    public static Map<String, Integer> helper(String filePath) throws IOException {
        Map<String, Integer> wordCount = new HashMap<>();
        BufferedReader br = new BufferedReader(new FileReader(filePath));
        String line;

        while ((line = br.readLine()) != null) {
            String[] words = line.toLowerCase().replaceAll("[^a-z ]", "").split("\\s+");
            for (String word : words) {
                if (!word.isEmpty()) {
                    wordCount.put(word, wordCount.getOrDefault(word, 0) + 1);
                }
            }
        }
        br.close();
        return wordCount;
    }
}
