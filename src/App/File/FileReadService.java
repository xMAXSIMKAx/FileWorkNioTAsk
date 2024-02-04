package App.File;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class FileReadService {
    public String ReadFromFile(String fileName) {
        Path filePath = Paths.get(FileBaseURL.BASE_URL + fileName + ".txt");

        try {
            String content = Files.readString(filePath);
            System.out.println("File read successfully");
            return content;

        } catch (IOException e) {
            System.err.println("File read failed");
        }

        return " ";
    }
}
