package io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileIOCopyExampler {
    public static void main(String[] args) {
        try(FileInputStream fileInputStream = new FileInputStream("C:\\Users\\User\\Downloads\\screens\\mac4.png");
            FileOutputStream fileOutputStream = new FileOutputStream("C:\\Users\\User\\Downloads\\screens\\2.png")) {
            int c;
            while ((c = fileInputStream.read()) != -1) {
                fileOutputStream.write(c);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
