package App.File;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class FileWriteService {
    public void WriteToFile(String fileName, String content) {
        Path filePath = Paths.get(FileBaseURL.BASE_URL + fileName + ".txt");

        try {
            Files.write(filePath, content.getBytes());
            System.out.println("File written successfully");
        } catch (IOException e) {
            System.err.println("File write failed" + e.getMessage());
        }

    }
}
