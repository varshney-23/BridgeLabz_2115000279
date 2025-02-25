package understandingCSV;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class readLargeCSVFile {
    public static void main(String[] args) {
        String filePath = "employees.csv";
        int batchSize = 100;
        int recordCount = 0;
        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line;
            boolean isHeader = true;

            while ((line = br.readLine()) != null) {

                if (isHeader) {
                    isHeader = false;
                    continue;
                }

                recordCount++;

                if (recordCount % batchSize == 0) {
                    System.out.println("Processed records: " + recordCount);
                }
            }

            System.out.println("Total records processed: " + recordCount);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

