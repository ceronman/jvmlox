package jvmlox;

import java.io.DataOutputStream;
import java.io.IOException;

interface Writer {
    void writeTo(DataOutputStream stream) throws IOException;
}
