package io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Arrays;

public class FileInputStreamExampler {
    public static void main(String[] args) {
        try(FileInputStream fileInputStream = new FileInputStream("C:\\Users\\User\\Downloads\\screens\\mac4.png")) {
            int firstByte = fileInputStream.read();
            byte[] buf = new byte[10];

            System.out.println(Arrays.toString(buf));
            fileInputStream.read(buf);
            System.out.println(firstByte);
            System.out.println(Arrays.toString(buf));
        } catch (FileNotFoundException e) {
            System.out.println("Ошибка доступа к файлу");
        } catch (IOException e) {
            System.out.println();
        }
    }
}
