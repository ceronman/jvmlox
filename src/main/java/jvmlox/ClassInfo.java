package jvmlox;

import java.io.DataOutputStream;
import java.io.IOException;

public record ClassInfo(Index<Utf8Info> name) implements Constant {
    @Override
    public void writeTo(DataOutputStream stream) throws IOException {
        name.writeTo(stream);
    }
}
