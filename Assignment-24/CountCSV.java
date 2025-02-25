package understandingCSV;

import com.opencsv.CSVReader;
import com.opencsv.exceptions.CsvValidationException;
import java.io.FileReader;
import java.io.IOException;

public class CountCSV {
    public static void main(String[] args) {
        String fileName = "students.csv";
        int rowCount = 0;

        try (CSVReader reader = new CSVReader(new FileReader(fileName))) {
            String[] nextRecord;
            boolean isHeader = true;
            while ((nextRecord = reader.readNext()) != null) {
                if (isHeader) { 
                    isHeader = false; 
                    continue; 
                }
                rowCount++;
            }
            System.out.println("Total records (excluding header): " + rowCount);
        } catch (IOException e) {
            e.printStackTrace();
        } catch (CsvValidationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    }
}
