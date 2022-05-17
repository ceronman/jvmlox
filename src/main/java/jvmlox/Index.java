package jvmlox;

import java.io.DataOutputStream;
import java.io.IOException;

public record Index<T extends Constant>(int index) implements Writer {
    @Override
    public void writeTo(DataOutputStream stream) throws IOException {
        // TODO: Check if index is bigger than short.
        stream.writeShort(index);
    }
}
