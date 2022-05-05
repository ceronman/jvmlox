package jvmlox;

import java.util.Collection;

public record AttributeInfo(Index<Utf8Info> name, int length, Collection<Attribute> attributes) {
}
