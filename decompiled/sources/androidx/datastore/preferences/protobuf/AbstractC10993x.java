package androidx.datastore.preferences.protobuf;

import java.nio.ByteBuffer;
import java.nio.charset.Charset;

/* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.x */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC10993x {

    /* JADX INFO: renamed from: a */
    public static final Charset f33099a = Charset.forName("UTF-8");

    /* JADX INFO: renamed from: b */
    public static final byte[] f33100b;

    static {
        Charset.forName("ISO-8859-1");
        byte[] bArr = new byte[0];
        f33100b = bArr;
        ByteBuffer.wrap(bArr);
        if (0 + 0 <= Integer.MAX_VALUE) {
            return;
        }
        try {
            throw C10997z.m11731f();
        } catch (C10997z e10) {
            throw new IllegalArgumentException(e10);
        }
    }

    /* JADX INFO: renamed from: a */
    public static void m11723a(Object obj, String str) {
        if (obj == null) {
            throw new NullPointerException(str);
        }
    }

    /* JADX INFO: renamed from: b */
    public static int m11724b(long j10) {
        return (int) (j10 ^ (j10 >>> 32));
    }

    /* JADX INFO: renamed from: c */
    public static AbstractC10987u m11725c(Object obj, Object obj2) {
        AbstractC10987u abstractC10987u = (AbstractC10987u) ((AbstractC10947a) obj);
        AbstractC10983s abstractC10983s = (AbstractC10983s) abstractC10987u.mo7129d(5);
        abstractC10983s.m11713c();
        AbstractC10983s.m11710d(abstractC10983s.f33095Z, abstractC10987u);
        AbstractC10947a abstractC10947a = (AbstractC10947a) obj2;
        if (!abstractC10983s.f33094Y.getClass().isInstance(abstractC10947a)) {
            throw new IllegalArgumentException("mergeFrom(MessageLite) can only merge messages of the same type.");
        }
        abstractC10983s.m11713c();
        AbstractC10983s.m11710d(abstractC10983s.f33095Z, (AbstractC10987u) abstractC10947a);
        return abstractC10983s.m11712b();
    }
}
