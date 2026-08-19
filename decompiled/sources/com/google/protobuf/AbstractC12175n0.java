package com.google.protobuf;

import java.nio.ByteBuffer;
import java.nio.charset.Charset;

/* JADX INFO: renamed from: com.google.protobuf.n0 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC12175n0 {

    /* JADX INFO: renamed from: a */
    public static final Charset f37050a;

    /* JADX INFO: renamed from: b */
    public static final byte[] f37051b;

    static {
        Charset.forName("US-ASCII");
        f37050a = Charset.forName("UTF-8");
        Charset.forName("ISO-8859-1");
        byte[] bArr = new byte[0];
        f37051b = bArr;
        ByteBuffer.wrap(bArr);
        AbstractC12186r.m14086h(bArr, 0, 0, false);
    }

    /* JADX INFO: renamed from: a */
    public static void m14013a(Object obj, String str) {
        if (obj == null) {
            throw new NullPointerException(str);
        }
    }

    /* JADX INFO: renamed from: b */
    public static int m14014b(long j10) {
        return (int) (j10 ^ (j10 >>> 32));
    }
}
