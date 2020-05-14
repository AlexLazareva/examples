package characterstreams;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileReaderExampler {
    public static void main(String[] args) {
        try(FileReader fileReader = new FileReader("...\\screens\\1.txt");
            FileWriter fileWriter = new FileWriter("...\\screens\\4.txt")) {
            int c;
            while ((c = fileReader.read()) != -1) {
                fileWriter.write(c);
            }
            fileWriter.append("п \r\n");
            fileWriter.append("Какая-то строка в конец файла \r\n");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
