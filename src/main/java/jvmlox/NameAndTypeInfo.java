package jvmlox;

import java.io.DataOutputStream;
import java.io.IOException;

public record NameAndTypeInfo(Index<Utf8Info> name, Index<Utf8Info> descriptor) implements Constant {
    @Override
    public void writeTo(DataOutputStream stream) throws IOException {
        name.writeTo(stream);
        descriptor.writeTo(stream);
    }
}
