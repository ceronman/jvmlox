package jvmlox;

import java.io.DataOutputStream;
import java.io.IOException;

record ClassFile(ConstantPool constantPool, Array<MethodInfo> methods, Array<Attribute> attributes) implements Writer {
    private static final int magic = 0xCAFEBABE;
    private static final int minorVersion = 0;
    private static final int majorVersion = 61;

    @Override
    public void writeTo(DataOutputStream stream) throws IOException {
        stream.writeInt(magic);
        stream.writeShort(minorVersion);
        stream.writeShort(majorVersion);
        constantPool.writeTo(stream);
    }
}