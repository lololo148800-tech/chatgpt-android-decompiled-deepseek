package androidx.glance.appwidget.protobuf;

import java.nio.ByteBuffer;
import java.nio.charset.Charset;

/* JADX INFO: renamed from: androidx.glance.appwidget.protobuf.y */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC11063y {

    /* JADX INFO: renamed from: a */
    public static final Charset f33343a;

    /* JADX INFO: renamed from: b */
    public static final byte[] f33344b;

    static {
        Charset.forName("US-ASCII");
        f33343a = Charset.forName("UTF-8");
        Charset.forName("ISO-8859-1");
        byte[] bArr = new byte[0];
        f33344b = bArr;
        ByteBuffer.wrap(bArr);
        try {
            new C11044h(bArr, 0, 0, false).mo1620i(0);
        } catch (C11005A e10) {
            throw new IllegalArgumentException(e10);
        }
    }

    /* JADX INFO: renamed from: a */
    public static void m12106a(Object obj, String str) {
        if (obj == null) {
            throw new NullPointerException(str);
        }
    }

    /* JADX INFO: renamed from: b */
    public static int m12107b(long j10) {
        return (int) (j10 ^ (j10 >>> 32));
    }
}
