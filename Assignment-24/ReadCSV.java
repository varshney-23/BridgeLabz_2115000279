package understandingCSV;

import com.opencsv.CSVReader;
import com.opencsv.exceptions.CsvValidationException;
import java.io.FileReader;
import java.io.IOException;

public class ReadCSV {
    public static void main(String[] args) {
        String fileName = "students.csv";

        try (CSVReader reader = new CSVReader(new FileReader(fileName))) {
            String[] nextRecord;
            boolean isHeader = true;
            while ((nextRecord = reader.readNext()) != null) {
                if (isHeader) { 
                    isHeader = false; 
                    continue; 
                }
                System.out.println("ID: " + nextRecord[0] + ", Name: " + nextRecord[1] + ", Age: " + nextRecord[2] + ", Marks: " + nextRecord[3]);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } catch (CsvValidationException e) {
			e.printStackTrace();
		}
    }
}
