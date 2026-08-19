package com.google.android.gms.internal.play_billing;

import java.nio.ByteBuffer;
import java.nio.charset.Charset;

/* JADX INFO: renamed from: com.google.android.gms.internal.play_billing.o1 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC11989o1 {

    /* JADX INFO: renamed from: a */
    public static final Charset f36309a;

    /* JADX INFO: renamed from: b */
    public static final byte[] f36310b;

    static {
        Charset.forName("US-ASCII");
        f36309a = Charset.forName("UTF-8");
        Charset.forName("ISO-8859-1");
        byte[] bArr = new byte[0];
        f36310b = bArr;
        ByteBuffer.wrap(bArr);
    }
}
