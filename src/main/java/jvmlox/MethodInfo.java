package jvmlox;

import java.util.Collection;

record MethodInfo(short accessFlags,
                  Index<Utf8Info> name,
                  Index<Utf8Info> descriptor,
                  Collection<Attribute> attributes) {
}