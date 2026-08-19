package p449S9;

import android.gov.nist.javax.sdp.fields.AbstractC10763a;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.util.Arrays;

/* JADX INFO: renamed from: S9.h0 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC7072h0 implements Comparable {
    /* JADX INFO: renamed from: d */
    public static int m7475d(byte b) {
        return (b >> 5) & 7;
    }

    /* JADX INFO: renamed from: e */
    public static AbstractC7072h0 m7476e(byte... bArr) {
        bArr.getClass();
        C7076j0 c7076j0 = new C7076j0(new ByteArrayInputStream(Arrays.copyOf(bArr, bArr.length)));
        try {
            return AbstractC7057a.m7466k(c7076j0);
        } finally {
            try {
                c7076j0.close();
            } catch (IOException unused) {
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public abstract int mo7454a();

    /* JADX INFO: renamed from: b */
    public int mo7455b() {
        return 0;
    }

    /* JADX INFO: renamed from: c */
    public final AbstractC7072h0 m7477c(Class cls) throws C7070g0 {
        if (cls.isInstance(this)) {
            return (AbstractC7072h0) cls.cast(this);
        }
        throw new C7070g0(AbstractC10763a.m11055m("Expected a ", cls.getName(), " value, but got ", getClass().getName()));
    }
}
