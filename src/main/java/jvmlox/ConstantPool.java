package jvmlox;

import java.io.DataOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class ConstantPool implements Writer {
    private final Map<Constant, Integer> seen = new HashMap<>();
    private final List<Constant> constants = new ArrayList<>();

    <T extends Constant> Index<T> create(T constant) {
        constants.add(constant);
        int index = seen.computeIfAbsent(constant, c -> constants.size());
        return new Index<>((short) index);
    }

    Index<Utf8Info> create(String content) {
        return create(new Utf8Info(content));
    }

    @Override
    public void writeTo(DataOutputStream stream) throws IOException {
        stream.writeShort(seen.size());
        for (Constant constant : seen.keySet()) {
            constant.writeTo(stream);
        }
    }

    public int size() {
        return constants.size();
    }
}