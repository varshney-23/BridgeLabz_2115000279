package understandingCSV;

import com.opencsv.CSVReader;
import com.opencsv.exceptions.CsvValidationException;
import java.io.FileReader;
import java.io.IOException;

public class filterRecordsFromCSV {
    public static void main(String[] args) {
        String filePath = "students.csv";
        try (CSVReader reader = new CSVReader(new FileReader(filePath))) {
            String[] header = reader.readNext();
            System.out.println(String.join(",", header));

            String[] data;
            while ((data = reader.readNext()) != null) {
                int marks = Integer.parseInt(data[3]);
                if (marks > 80) {
                    System.out.println(String.join(",", data));
                }
            }
        } catch (IOException | NumberFormatException e) {
            e.printStackTrace();
        } catch (CsvValidationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    }
}
