import com.fasterxml.jackson.databind.MappingIterator;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.dataformat.csv.CsvMapper;
import com.fasterxml.jackson.dataformat.csv.CsvSchema;
import java.io.File;
import java.util.List;

public class ConvertCSVtoJSON {
    public static void main(String[] args) throws Exception {
        CsvMapper csvMapper = new CsvMapper();
        CsvSchema schema = CsvSchema.emptySchema().withHeader();
        MappingIterator<Object> it = csvMapper.readerFor(Object.class).with(schema).readValues(new File("students.csv"));

        List<Object> data = it.readAll();
        String json = new ObjectMapper().writeValueAsString(data);
        System.out.println(json);
    }
}
