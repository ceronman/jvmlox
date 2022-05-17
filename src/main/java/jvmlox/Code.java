package jvmlox;

import java.io.DataOutputStream;
import java.io.IOException;

record Code(Index<MethodrefInfo> method) implements Writer {
    @Override
    public void writeTo(DataOutputStream stream) throws IOException {
        stream.write(5);
        stream.writeByte(0x2a); // aload_0
        stream.writeByte(0xb7); // invokespecial
        method.writeTo(stream);
        stream.writeByte(0xb1); // return
    }
}