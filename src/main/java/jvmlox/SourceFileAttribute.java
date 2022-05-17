package jvmlox;

import java.io.DataOutputStream;
import java.io.IOException;

public record SourceFileAttribute(Index<Utf8Info> name,
                                  Index<Utf8Info> sourceFile) implements Attribute {
    @Override
    public void writeTo(DataOutputStream stream) throws IOException {
        name.writeTo(stream);
        sourceFile.writeTo(stream);
    }
}
