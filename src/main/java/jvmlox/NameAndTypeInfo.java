package jvmlox;

public record NameAndTypeInfo(Index<Utf8Info> name, Index<Utf8Info> descriptor) implements Constant {
}
