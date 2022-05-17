package jvmlox;

class AccessFlags {
    public static final short NONE = 0x0000;
    public static final short PUBLIC = 0x0001;
    public static final short PRIVATE = 0x0002;
    public static final short PROTECTED = 0x0004;
    public static final short STATIC = 0x0008;
    public static final short FINAL = 0x0010;
    public static final short SYNCHRONIZED = 0x0020;
    public static final short BRIDGE = 0x0040;
    public static final short VARARGS = 0x0080;
    public static final short NATIVE = 0x0100;
    public static final short ABSTRACT = 0x0400;
    public static final short STRICT = 0x0800;
    public static final short SYNTHETIC = 0x1000;
}