import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class FileProcessorTest {
    FileProcessor processor = new FileProcessor();
    String filename = "testFile.txt";

    @Test
    void testWriteToFile() throws IOException {
        processor.writeToFile(filename, "Hello, World!");
        assertTrue(Files.exists(Path.of(filename)));
    }

    @Test
    void testReadFromFile() throws IOException {
        processor.writeToFile(filename, "Hello, JUnit!");
        assertEquals("Hello, JUnit!", processor.readFromFile(filename));
    }
}
