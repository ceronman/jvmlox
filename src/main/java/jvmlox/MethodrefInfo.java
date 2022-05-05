package jvmlox;

public record MethodrefInfo(Index<ClassInfo> cls, Index<NameAndTypeInfo> nameAndType) implements Constant {
}
