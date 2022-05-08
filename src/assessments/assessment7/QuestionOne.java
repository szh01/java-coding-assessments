package assessments.assessment7;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class QuestionOne {
    public static void main(String[] args) throws IOException {
        Path filePath = Path.of("File1.txt");
        StringBuilder contentBuilder = new StringBuilder();
        try (Stream<String> stream= Files.lines(Paths.get(String.valueOf(filePath)), StandardCharsets.UTF_8))
        {
            stream.forEach(s -> contentBuilder.append(s).append("\n"));
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
        String fileContent = contentBuilder.toString();
        System.out.println(fileContent);
    }

}
