package jvmlox;

import java.io.BufferedOutputStream;
import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class App {
    public static void main(String[] args) {
        var filename = "Test.class";
        var constantPool = new ConstantPool();
        var classInfo = new ClassInfo(constantPool.create("java/lang/Object"));
        var nameAndType = new NameAndTypeInfo(constantPool.create("<init>"), constantPool.create("()V"));
        var methodRef = new MethodrefInfo(constantPool.create(classInfo), constantPool.create(nameAndType));
        var code = new CodeAttribute(constantPool.create("Code"), 1, 1, new Code(constantPool.create(methodRef)));
        var method = new MethodInfo(
                AccessFlags.NONE, constantPool.create("<init>"), constantPool.create("()V"), Array.of(code));

        var cls = new ClassFile(constantPool, Array.of(method), Array.of());

        try (var fileOutputStream = new FileOutputStream(filename);
             var bufferedStream = new BufferedOutputStream(fileOutputStream);
             var dataOutputStream = new DataOutputStream((bufferedStream))) {
            cls.writeTo(dataOutputStream);

        } catch (IOException e) {
            System.err.println("File Error: " + e);
            e.printStackTrace();
        }
        System.out.println(constantPool.size());
        System.out.println("Hello World!");
    }
}
