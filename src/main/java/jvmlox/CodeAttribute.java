package jvmlox;

public record CodeAttribute(Index<Utf8Info> name,
                           int length,
                           short maxStack,
                           short maxLocals,
                           Code code) {
}