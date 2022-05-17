package jvmlox;

import java.io.DataOutputStream;
import java.io.IOException;

public record Utf8Info(String content) implements Constant {
    @Override
    public void writeTo(DataOutputStream stream) throws IOException {
        stream.writeUTF(content);
    }
}
