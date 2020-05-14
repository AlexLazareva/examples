package bufferedreaders;

import java.io.*;

public class BufferedIOExampler {
    public static void main(String[] args) {
        try(BufferedReader bufferedReader = new BufferedReader(new FileReader("...\\screens\\4.txt"));
            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("...\\screens\\5.txt"))) {
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                System.out.println(line);
                bufferedWriter.write(line + "\r\n");
            }
            bufferedWriter.write("Новая строка");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
