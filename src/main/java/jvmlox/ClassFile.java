package jvmlox;

import java.io.DataOutputStream;
import java.io.IOException;

public class ClassFile {
    private static final int magic = 0xCAFEBABE;
    private static final int minorVersion = 0;
    private static final int majorVersion = 61;

    public void write(DataOutputStream stream) throws IOException {
        stream.writeInt(magic);
        stream.writeShort(minorVersion);
        stream.writeShort(majorVersion);
    }
}