package understandingCSV;

import com.opencsv.CSVReader;
import com.opencsv.CSVWriter;
import com.opencsv.exceptions.CsvValidationException;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class mergeTwoCSV {
    public static void main(String[] args) {
        String file1 = "student1.csv";
        String file2 = "student2.csv";
        String outputFile = "merged_students.csv";

        Map<String, String[]> studentData = new HashMap<>();
        try (CSVReader reader = new CSVReader(new FileReader(file1))) {
            String[] record;
            reader.readNext();

            while ((record = reader.readNext()) != null) {
                studentData.put(record[0], record);
            }
        } catch (IOException | CsvValidationException e) {
            e.printStackTrace();
        }

        try (CSVReader reader = new CSVReader(new FileReader(file2))) {
            String[] record;
            reader.readNext();
            while ((record = reader.readNext()) != null) {
                if (studentData.containsKey(record[0])) {
                    String[] details = studentData.get(record[0]);
                    String[] merged = {details[0], details[1], details[2], record[1], record[2]};
                    studentData.put(record[0], merged);
                }
            }
        } catch (IOException | CsvValidationException e) {
            e.printStackTrace();
        }

        try (CSVWriter writer = new CSVWriter(new FileWriter(outputFile))) {
            String[] header = {"ID", "Name", "Age", "Marks", "Grade"};
            writer.writeNext(header);
            for (String[] values : studentData.values()) {
                writer.writeNext(values);
            }

            System.out.println("Merging complete! Check '" + outputFile + "'");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
