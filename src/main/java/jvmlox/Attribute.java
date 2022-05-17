package jvmlox;

sealed public interface Attribute extends Writer
        permits CodeAttribute, SourceFileAttribute {
}
