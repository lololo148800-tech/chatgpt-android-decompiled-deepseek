package com.google.protobuf;

import java.io.IOException;
import java.io.OutputStream;
import java.util.Collection;
import java.util.List;
import java.util.logging.Logger;

/* JADX INFO: renamed from: com.google.protobuf.b */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC12138b implements InterfaceC12091G0 {
    protected int memoizedHashCode;

    @Deprecated
    public static <T> void addAll(Iterable<T> iterable, Collection<? super T> collection) {
        AbstractC12121T.m13859a(iterable, (List) collection);
    }

    public static void checkByteStringIsUtf8(AbstractC12171m abstractC12171m) {
        if (!abstractC12171m.mo14003r()) {
            throw new IllegalArgumentException("Byte string is not UTF-8.");
        }
    }

    /* JADX INFO: renamed from: a */
    public final String m13928a(String str) {
        return "Serializing " + getClass().getName() + " to a " + str + " threw an IOException (should never happen).";
    }

    public abstract int getSerializedSize(InterfaceC12134Z0 interfaceC12134Z0);

    public C12179o1 newUninitializedMessageException() {
        return new C12179o1();
    }

    public byte[] toByteArray() {
        try {
            int serializedSize = getSerializedSize();
            byte[] bArr = new byte[serializedSize];
            Logger logger = AbstractC12195u.f37108d;
            C12189s c12189s = new C12189s(serializedSize, bArr);
            writeTo(c12189s);
            if (c12189s.m14113V0() == 0) {
                return bArr;
            }
            throw new IllegalStateException("Did not write as much data as expected.");
        } catch (IOException e10) {
            throw new RuntimeException(m13928a("byte array"), e10);
        }
    }

    public AbstractC12171m toByteString() {
        try {
            int serializedSize = getSerializedSize();
            C12168l c12168l = AbstractC12171m.f37047Z;
            byte[] bArr = new byte[serializedSize];
            Logger logger = AbstractC12195u.f37108d;
            C12189s c12189s = new C12189s(serializedSize, bArr);
            writeTo(c12189s);
            if (c12189s.m14113V0() == 0) {
                return new C12168l(bArr);
            }
            throw new IllegalStateException("Did not write as much data as expected.");
        } catch (IOException e10) {
            throw new RuntimeException(m13928a("ByteString"), e10);
        }
    }

    public void writeDelimitedTo(OutputStream outputStream) {
        int serializedSize = getSerializedSize();
        int iM14148v0 = AbstractC12195u.m14148v0(serializedSize) + serializedSize;
        if (iM14148v0 > 4096) {
            iM14148v0 = 4096;
        }
        C12192t c12192t = new C12192t(outputStream, iM14148v0);
        c12192t.mo14110S0(serializedSize);
        writeTo(c12192t);
        if (c12192t.f37104h > 0) {
            c12192t.m14121a1();
        }
    }

    public void writeTo(OutputStream outputStream) {
        int serializedSize = getSerializedSize();
        Logger logger = AbstractC12195u.f37108d;
        if (serializedSize > 4096) {
            serializedSize = 4096;
        }
        C12192t c12192t = new C12192t(outputStream, serializedSize);
        writeTo(c12192t);
        if (c12192t.f37104h > 0) {
            c12192t.m14121a1();
        }
    }

    public static <T> void addAll(Iterable<T> iterable, List<? super T> list) {
        AbstractC12121T.m13859a(iterable, list);
    }
}
