package com.google.android.gms.internal.play_billing;

import java.io.Serializable;
import java.util.Iterator;
import java.util.Locale;
import p001A.AbstractC0010F;
import p315Me.Myis.CxcULo;
import p449S9.C7052V;
import p571X9.AbstractC9306j0;
import p911o0.AbstractC17792x;

/* JADX INFO: renamed from: com.google.android.gms.internal.play_billing.Z0 */
/* JADX INFO: loaded from: classes.dex */
public class C11929Z0 implements Iterable, Serializable {

    /* JADX INFO: renamed from: o0 */
    public static final C11929Z0 f36227o0 = new C11929Z0(AbstractC11989o1.f36310b);

    /* JADX INFO: renamed from: Y */
    public int f36228Y = 0;

    /* JADX INFO: renamed from: Z */
    public final byte[] f36229Z;

    static {
        int i10 = AbstractC11914U0.f36197a;
    }

    public C11929Z0(byte[] bArr) {
        bArr.getClass();
        this.f36229Z = bArr;
    }

    /* JADX INFO: renamed from: m */
    public static int m13374m(int i10, int i11, int i12) {
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

    /* JADX INFO: renamed from: p */
    public static C11929Z0 m13375p(byte[] bArr, int i10, int i11) {
        m13374m(i10, i10 + i11, bArr.length);
        byte[] bArr2 = new byte[i11];
        System.arraycopy(bArr, i10, bArr2, 0, i11);
        return new C11929Z0(bArr2);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C11929Z0) || mo13368j() != ((C11929Z0) obj).mo13368j()) {
            return false;
        }
        if (mo13368j() == 0) {
            return true;
        }
        if (!(obj instanceof C11929Z0)) {
            return obj.equals(this);
        }
        C11929Z0 c11929z0 = (C11929Z0) obj;
        int i10 = this.f36228Y;
        int i11 = c11929z0.f36228Y;
        if (i10 != 0 && i11 != 0 && i10 != i11) {
            return false;
        }
        int iMo13368j = mo13368j();
        if (iMo13368j > c11929z0.mo13368j()) {
            throw new IllegalArgumentException(CxcULo.YNbLhCYfWTeM + iMo13368j + mo13368j());
        }
        if (iMo13368j > c11929z0.mo13368j()) {
            throw new IllegalArgumentException(AbstractC17792x.m19534q("Ran off end of other: 0, ", iMo13368j, c11929z0.mo13368j(), ", "));
        }
        int i12 = 0;
        int i13 = 0;
        while (i12 < iMo13368j) {
            if (this.f36229Z[i12] != c11929z0.f36229Z[i13]) {
                return false;
            }
            i12++;
            i13++;
        }
        return true;
    }

    /* JADX INFO: renamed from: f */
    public byte mo13366f(int i10) {
        return this.f36229Z[i10];
    }

    public final int hashCode() {
        int i10 = this.f36228Y;
        if (i10 != 0) {
            return i10;
        }
        int iMo13368j = mo13368j();
        int i11 = iMo13368j;
        for (int i12 = 0; i12 < iMo13368j; i12++) {
            i11 = (i11 * 31) + this.f36229Z[i12];
        }
        if (i11 == 0) {
            i11 = 1;
        }
        this.f36228Y = i11;
        return i11;
    }

    /* JADX INFO: renamed from: i */
    public byte mo13367i(int i10) {
        return this.f36229Z[i10];
    }

    @Override // java.lang.Iterable
    public final /* synthetic */ Iterator iterator() {
        return new C7052V(this);
    }

    /* JADX INFO: renamed from: j */
    public int mo13368j() {
        return this.f36229Z.length;
    }

    public final String toString() {
        String strConcat;
        Locale locale = Locale.ROOT;
        String hexString = Integer.toHexString(System.identityHashCode(this));
        int iMo13368j = mo13368j();
        if (mo13368j() <= 50) {
            strConcat = AbstractC11957g1.m13444f(this);
        } else {
            int iM13374m = m13374m(0, 47, mo13368j());
            strConcat = AbstractC11957g1.m13444f(iM13374m == 0 ? f36227o0 : new C11926Y0(iM13374m, this.f36229Z)).concat("...");
        }
        StringBuilder sb2 = new StringBuilder("<ByteString@");
        sb2.append(hexString);
        sb2.append(" size=");
        sb2.append(iMo13368j);
        sb2.append(" contents=\"");
        return AbstractC9306j0.m9891j(strConcat, "\">", sb2);
    }
}
