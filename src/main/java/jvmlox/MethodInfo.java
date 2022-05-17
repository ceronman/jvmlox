package jvmlox;

import java.io.DataOutputStream;
import java.io.IOException;

record MethodInfo(short accessFlags,
                  Index<Utf8Info> name,
                  Index<Utf8Info> descriptor,
                  Array<Attribute> attributes) implements Writer {
    @Override
    public void writeTo(DataOutputStream stream) throws IOException {
        stream.writeShort(accessFlags);
        name.writeTo(stream);
        descriptor.writeTo(stream);
        attributes.writeTo(stream);
    }
}