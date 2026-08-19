package p523V9;

import android.content.res.Configuration;
import android.os.Build;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import p030B2.AbstractC0767l;
import p1072w2.C20793e;
import p1072w2.C20796h;
import p133F3.InterfaceC2661g;
import p725eb.C13357b;

/* JADX INFO: renamed from: V9.l5 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC8135l5 implements InterfaceC2661g {
    /* JADX INFO: renamed from: b */
    public static List m8654b(int... iArr) {
        return iArr.length == 0 ? Collections.emptyList() : new C13357b(0, iArr.length, iArr);
    }

    /* JADX INFO: renamed from: c */
    public static int m8655c(long j10) {
        int i10 = (int) j10;
        AbstractC8020X.m8352b(((long) i10) == j10, "Out of range: %s", j10);
        return i10;
    }

    /* JADX INFO: renamed from: d */
    public static int m8656d(byte[] bArr) {
        boolean z6 = bArr.length >= 4;
        int length = bArr.length;
        if (!z6) {
            throw new IllegalArgumentException(AbstractC8027Y.m8374e("array too small: %s < %s", Integer.valueOf(length), 4));
        }
        return (bArr[3] & 255) | ((bArr[2] & 255) << 8) | (bArr[0] << 24) | ((bArr[1] & 255) << 16);
    }

    /* JADX INFO: renamed from: e */
    public static C20793e m8657e(Configuration configuration) {
        return Build.VERSION.SDK_INT >= 24 ? new C20793e(new C20796h(AbstractC0767l.m1709d(configuration))) : C20793e.m21309a(configuration.locale);
    }

    /* JADX INFO: renamed from: i */
    public static int m8658i(long j10) {
        if (j10 > 2147483647L) {
            return Integer.MAX_VALUE;
        }
        if (j10 < -2147483648L) {
            return Integer.MIN_VALUE;
        }
        return (int) j10;
    }

    /* JADX INFO: renamed from: k */
    public static int[] m8659k(Collection collection) {
        if (collection instanceof C13357b) {
            C13357b c13357b = (C13357b) collection;
            return Arrays.copyOfRange(c13357b.f42396Y, c13357b.f42397Z, c13357b.f42398o0);
        }
        Object[] array = collection.toArray();
        int length = array.length;
        int[] iArr = new int[length];
        for (int i10 = 0; i10 < length; i10++) {
            Object obj = array[i10];
            obj.getClass();
            iArr[i10] = ((Number) obj).intValue();
        }
        return iArr;
    }
}
