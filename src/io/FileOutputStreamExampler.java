package io;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamExampler {
    public static void main(String[] args) {
        try (FileOutputStream fileOutputStream = new FileOutputStream("C:\\Users\\User\\Downloads\\screens\\2.txt")) {
            fileOutputStream.write(56);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
