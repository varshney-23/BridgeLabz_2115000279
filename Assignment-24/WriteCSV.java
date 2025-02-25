package understandingCSV;

import com.opencsv.CSVWriter;
import java.io.FileWriter;
import java.io.IOException;

public class WriteCSV {
    public static void main(String[] args) {
        String fileName = "students.csv";

        try (CSVWriter writer = new CSVWriter(new FileWriter(fileName))) {
            // Header row
            String[] header = {"ID", "Name", "Age", "Marks"};
            writer.writeNext(header);

            // Data rows
            String[] row1 = {"101", "Ayushi", "22", "85"};
            String[] row2 = {"102", "Pranjal", "19", "90"};
            String[] row3 = {"103", "Panda", "19", "78"};
            String[] row4 = {"101", "Alex", "20", "85"};
            String[] row5 = {"102", "Paayushi", "21", "90"};
            String[] row6 = {"103", "Shreya", "19", "78"};
            
            writer.writeNext(row1);
            writer.writeNext(row2);
            writer.writeNext(row3);
            writer.writeNext(row4);
            writer.writeNext(row5);
            writer.writeNext(row6);

            System.out.println("CSV file created successfully!");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

