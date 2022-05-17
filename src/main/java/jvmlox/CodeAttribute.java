package jvmlox;

import java.io.DataOutputStream;
import java.io.IOException;

public record CodeAttribute(Index<Utf8Info> name,
                            int maxStack,
                            int maxLocals,
                            Code code) implements Attribute {
    @Override
    public void writeTo(DataOutputStream stream) throws IOException {
        name.writeTo(stream);
        stream.writeShort(maxStack);
        stream.writeShort(maxLocals);
        code.writeTo(stream);
    }
}