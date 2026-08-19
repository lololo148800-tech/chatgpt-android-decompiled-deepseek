package com.google.protobuf;

import java.io.Serializable;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Locale;
import p001A.AbstractC0010F;
import p449S9.C7052V;
import p571X9.AbstractC9306j0;
import p911o0.AbstractC17792x;

/* JADX INFO: renamed from: com.google.protobuf.m */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC12171m implements Iterable, Serializable {

    /* JADX INFO: renamed from: Z */
    public static final C12168l f37047Z = new C12168l(AbstractC12175n0.f37051b);

    /* JADX INFO: renamed from: o0 */
    public static final C12162j f37048o0;

    /* JADX INFO: renamed from: Y */
    public int f37049Y;

    static {
        f37048o0 = AbstractC12144d.m13942a() ? new C12162j(1) : new C12162j(0);
    }

    /* JADX INFO: renamed from: i */
    public static int m14009i(int i10, int i11, int i12) {
        int i13 = i11 - i10;
        if ((i10 | i11 | i13 | (i12 - i11)) >= 0) {
            return i13;
        }
        if (i10 < 0) {
            throw new IndexOutOfBoundsException(AbstractC0010F.m19c(i10, "Beginning index: ", " < 0"));
        }
        if (i11 < i10) {
            throw new IndexOutOfBoundsException(AbstractC17792x.m19534q("Beginning index larger than ending index: ", i10, i11, ", "));
        }
        throw new IndexOutOfBoundsException(AbstractC17792x.m19534q("End index: ", i11, i12, " >= "));
    }

    /* JADX INFO: renamed from: j */
    public static C12168l m14010j(byte[] bArr, int i10, int i11) {
        byte[] bArrCopyOfRange;
        m14009i(i10, i10 + i11, bArr.length);
        switch (f37048o0.f37036a) {
            case 0:
                bArrCopyOfRange = Arrays.copyOfRange(bArr, i10, i11 + i10);
                break;
            default:
                bArrCopyOfRange = new byte[i11];
                System.arraycopy(bArr, i10, bArrCopyOfRange, 0, i11);
                break;
        }
        return new C12168l(bArrCopyOfRange);
    }

    /* JADX INFO: renamed from: m */
    public static C12168l m14011m(String str) {
        return new C12168l(str.getBytes(AbstractC12175n0.f37050a));
    }

    /* JADX INFO: renamed from: f */
    public abstract byte mo13999f(int i10);

    public final int hashCode() {
        int iMo14005t = this.f37049Y;
        if (iMo14005t == 0) {
            int size = size();
            iMo14005t = mo14005t(size, size);
            if (iMo14005t == 0) {
                iMo14005t = 1;
            }
            this.f37049Y = iMo14005t;
        }
        return iMo14005t;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new C7052V(this);
    }

    /* JADX INFO: renamed from: p */
    public abstract void mo14000p(int i10, byte[] bArr);

    /* JADX INFO: renamed from: q */
    public abstract byte mo14001q(int i10);

    /* JADX INFO: renamed from: r */
    public abstract boolean mo14003r();

    /* JADX INFO: renamed from: s */
    public abstract AbstractC12186r mo14004s();

    public abstract int size();

    /* JADX INFO: renamed from: t */
    public abstract int mo14005t(int i10, int i11);

    public final String toString() {
        String strM13959T;
        Locale locale = Locale.ROOT;
        String hexString = Integer.toHexString(System.identityHashCode(this));
        int size = size();
        if (size() <= 50) {
            strM13959T = AbstractC12153g.m13959T(this);
        } else {
            strM13959T = AbstractC12153g.m13959T(mo14006u(47)) + "...";
        }
        StringBuilder sb2 = new StringBuilder("<ByteString@");
        sb2.append(hexString);
        sb2.append(" size=");
        sb2.append(size);
        sb2.append(" contents=\"");
        return AbstractC9306j0.m9891j(strM13959T, "\">", sb2);
    }

    /* JADX INFO: renamed from: u */
    public abstract AbstractC12171m mo14006u(int i10);

    /* JADX INFO: renamed from: v */
    public abstract String mo14007v(Charset charset);

    /* JADX INFO: renamed from: w */
    public final String m14012w() {
        return size() == 0 ? "" : mo14007v(AbstractC12175n0.f37050a);
    }

    /* JADX INFO: renamed from: x */
    public abstract void mo14008x(AbstractC12195u abstractC12195u);
}
