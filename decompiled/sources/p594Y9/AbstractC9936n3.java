package p594Y9;

import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.Serializable;
import p214Ib.C3676s;
import p214Ib.C3677t;
import p253K.C4492c;
import p538W2.C8417b;
import p919o8.C17950Y0;

/* JADX INFO: renamed from: Y9.n3 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC9936n3 {
    /* JADX INFO: renamed from: a */
    public static void m10593a(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (RuntimeException e10) {
                throw e10;
            } catch (Exception unused) {
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: b */
    public static long[] m10594b(Serializable serializable) {
        if (!(serializable instanceof int[])) {
            if (serializable instanceof long[]) {
                return (long[]) serializable;
            }
            return null;
        }
        int[] iArr = (int[]) serializable;
        long[] jArr = new long[iArr.length];
        for (int i10 = 0; i10 < iArr.length; i10++) {
            jArr[i10] = iArr[i10];
        }
        return jArr;
    }

    /* JADX INFO: renamed from: c */
    public static void m10595c(C8417b c8417b, C4492c c4492c, int i10) {
        byte[] bArr = new byte[8192];
        while (i10 > 0) {
            int iMin = Math.min(i10, 8192);
            int i11 = c8417b.read(bArr, 0, iMin);
            if (i11 != iMin) {
                throw new IOException("Failed to copy the given amount of bytes from the inputstream to the output stream.");
            }
            i10 -= i11;
            c4492c.write(bArr, 0, i11);
        }
    }

    /* JADX INFO: renamed from: d */
    public static void m10596d(InputStream inputStream, OutputStream outputStream) {
        byte[] bArr = new byte[8192];
        while (true) {
            int i10 = inputStream.read(bArr);
            if (i10 == -1) {
                return;
            } else {
                outputStream.write(bArr, 0, i10);
            }
        }
    }

    /* JADX INFO: renamed from: e */
    public static C17950Y0 m10597e(C3676s c3676s) {
        try {
            return new C17950Y0(c3676s.m4395w("duration").mo4382p(), c3676s.m4395w("start").mo4382p());
        } catch (IllegalStateException e10) {
            throw new C3677t("Unable to parse json into type FirstByte", e10);
        } catch (NullPointerException e11) {
            throw new C3677t("Unable to parse json into type FirstByte", e11);
        } catch (NumberFormatException e12) {
            throw new C3677t("Unable to parse json into type FirstByte", e12);
        }
    }
}
