package jvmlox;

import java.io.*;

public class App {
    public static void main(String[] args) {
        var filename = "Test.class";
        var cls = new ClassFile();

        try (var fileOutputStream = new FileOutputStream(filename);
            var bufferedStream = new BufferedOutputStream(fileOutputStream);
            var dataOutputStream = new DataOutputStream((bufferedStream))) {
            cls.write(dataOutputStream);

        } catch (IOException e) {
            System.err.println("File Error: " + e);
            e.printStackTrace();
        }
        System.out.println("Hello World!");
    }
}
