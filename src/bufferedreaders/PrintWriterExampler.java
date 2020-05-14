package bufferedreaders;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class PrintWriterExampler {
    public static void main(String[] args) {
        try(PrintWriter printWriter = new PrintWriter(new FileWriter("...\\screens\\1.txt"))) {
            String login = "Some login";
            printWriter.printf("Ошибка при регистрации пользователя %s", login);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
