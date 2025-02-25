package understandingCSV;
import com.opencsv.CSVWriter;
import java.io.FileWriter;
import java.io.IOException;

public class employeeDetails {
    public static void main(String[] args) {
        String filePath = "employees.csv"; 

        try (CSVWriter writer = new CSVWriter(new FileWriter(filePath))) {
            String[] header = {"ID", "Name", "Department", "Salary"};
            writer.writeNext(header);

            String[] row1 = {"101", "Ayushi", "HR", "85000"};
            String[] row2 = {"102", "Pranjal", "IT", "90000"};
            String[] row3 = {"103", "Panda", "Finance", "78000"};
            String[] row4 = {"104", "Alex", "Marketing", "85000"};
            String[] row5 = {"105", "Paayushi", "Sales", "90000"};
            String[] row6 = {"106", "Shreya", "Admin", "78000"};

            writer.writeNext(row1);
            writer.writeNext(row2);
            writer.writeNext(row3);
            writer.writeNext(row4);
            writer.writeNext(row5);
            writer.writeNext(row6);

            System.out.println("CSV file written successfully!");

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
