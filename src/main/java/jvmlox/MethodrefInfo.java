package jvmlox;

import java.io.DataOutputStream;
import java.io.IOException;

public record MethodrefInfo(Index<ClassInfo> cls, Index<NameAndTypeInfo> nameAndType) implements Constant {
    @Override
    public void writeTo(DataOutputStream stream) throws IOException {
        cls.writeTo(stream);
        nameAndType.writeTo(stream);
    }
}
