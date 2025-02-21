import java.io.*;

public class CompileTimeException {
	public static void main(String [] args) {
		try {
			BufferedReader reader = new BufferedReader(new FileReader("date.txt"));
			String line;
			while((line = reader.readLine()) != null) {
				System.out.println(line);
			}
		} catch (FileNotFoundException e) {
            System.out.println("File not found");
        } catch (IOException e) {
            System.out.println("An error occurred while reading the file.");
        }
	}
}
