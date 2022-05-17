package jvmlox;

import java.io.DataOutputStream;
import java.io.IOException;
import java.util.Collection;
import java.util.List;

record Array<T extends Writer>(Collection<T> items) implements Writer {

    @SafeVarargs
    public static <T extends Writer> Array<T> of(T... items) {
        return new Array(List.of(items));
    }
    @Override
    public void writeTo(DataOutputStream stream) throws IOException {
        stream.writeShort(items.size());
        for (Writer item : items) {
            item.writeTo(stream);
        }
    }
}
