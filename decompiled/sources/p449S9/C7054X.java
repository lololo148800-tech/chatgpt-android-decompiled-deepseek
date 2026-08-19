package p449S9;

import java.io.ByteArrayInputStream;
import java.io.Serializable;
import java.util.Iterator;
import java.util.Locale;
import p001A.AbstractC0010F;
import p571X9.AbstractC9306j0;
import p911o0.AbstractC17792x;

/* JADX INFO: renamed from: S9.X */
/* JADX INFO: loaded from: classes.dex */
public class C7054X implements Iterable, Serializable {

    /* JADX INFO: renamed from: o0 */
    public static final C7054X f22525o0 = new C7054X(AbstractC7055Y.f22528a);

    /* JADX INFO: renamed from: Y */
    public int f22526Y = 0;

    /* JADX INFO: renamed from: Z */
    public final byte[] f22527Z;

    static {
        int i10 = AbstractC7051U.f22518a;
    }

    public C7054X(byte[] bArr) {
        bArr.getClass();
        this.f22527Z = bArr;
    }

    /* JADX INFO: renamed from: r */
    public static int m7450r(int i10, int i11, int i12) {
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

    /* JADX INFO: renamed from: s */
    public static C7054X m7451s(int i10, byte[] bArr) {
        m7450r(0, i10, bArr.length);
        byte[] bArr2 = new byte[i10];
        System.arraycopy(bArr, 0, bArr2, 0, i10);
        return new C7054X(bArr2);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C7054X) || mo7448m() != ((C7054X) obj).mo7448m()) {
            return false;
        }
        if (mo7448m() == 0) {
            return true;
        }
        if (!(obj instanceof C7054X)) {
            return obj.equals(this);
        }
        C7054X c7054x = (C7054X) obj;
        int i10 = this.f22526Y;
        int i11 = c7054x.f22526Y;
        if (i10 != 0 && i11 != 0 && i10 != i11) {
            return false;
        }
        int iMo7448m = mo7448m();
        if (iMo7448m > c7054x.mo7448m()) {
            throw new IllegalArgumentException("Length too large: " + iMo7448m + mo7448m());
        }
        if (iMo7448m > c7054x.mo7448m()) {
            throw new IllegalArgumentException(AbstractC17792x.m19534q("Ran off end of other: 0, ", iMo7448m, c7054x.mo7448m(), ", "));
        }
        int iMo7447j = mo7447j() + iMo7448m;
        int iMo7447j2 = mo7447j();
        int iMo7447j3 = c7054x.mo7447j();
        while (iMo7447j2 < iMo7447j) {
            if (this.f22527Z[iMo7447j2] != c7054x.f22527Z[iMo7447j3]) {
                return false;
            }
            iMo7447j2++;
            iMo7447j3++;
        }
        return true;
    }

    /* JADX INFO: renamed from: f */
    public byte mo7445f(int i10) {
        return this.f22527Z[i10];
    }

    public final int hashCode() {
        int i10 = this.f22526Y;
        if (i10 != 0) {
            return i10;
        }
        int iMo7448m = mo7448m();
        int iMo7447j = mo7447j();
        byte[] bArr = AbstractC7055Y.f22528a;
        int i11 = iMo7448m;
        for (int i12 = iMo7447j; i12 < iMo7447j + iMo7448m; i12++) {
            i11 = (i11 * 31) + this.f22527Z[i12];
        }
        int i13 = i11 != 0 ? i11 : 1;
        this.f22526Y = i13;
        return i13;
    }

    /* JADX INFO: renamed from: i */
    public byte mo7446i(int i10) {
        return this.f22527Z[i10];
    }

    @Override // java.lang.Iterable
    public final /* synthetic */ Iterator iterator() {
        return new C7052V(this);
    }

    /* JADX INFO: renamed from: j */
    public int mo7447j() {
        return 0;
    }

    /* JADX INFO: renamed from: m */
    public int mo7448m() {
        return this.f22527Z.length;
    }

    /* JADX INFO: renamed from: p */
    public void mo7449p(int i10, byte[] bArr) {
        System.arraycopy(this.f22527Z, 0, bArr, 0, i10);
    }

    /* JADX INFO: renamed from: q */
    public final ByteArrayInputStream m7452q() {
        return new ByteArrayInputStream(this.f22527Z, mo7447j(), mo7448m());
    }

    /* JADX INFO: renamed from: t */
    public final byte[] m7453t() {
        int iMo7448m = mo7448m();
        if (iMo7448m == 0) {
            return AbstractC7055Y.f22528a;
        }
        byte[] bArr = new byte[iMo7448m];
        mo7449p(iMo7448m, bArr);
        return bArr;
    }

    public final String toString() {
        C7054X c7053w;
        String strConcat;
        Locale locale = Locale.ROOT;
        String hexString = Integer.toHexString(System.identityHashCode(this));
        int iMo7448m = mo7448m();
        if (mo7448m() <= 50) {
            strConcat = AbstractC7057a.m7458c(this);
        } else {
            int iM7450r = m7450r(0, 47, mo7448m());
            if (iM7450r == 0) {
                c7053w = f22525o0;
            } else {
                c7053w = new C7053W(this.f22527Z, mo7447j(), iM7450r);
            }
            strConcat = AbstractC7057a.m7458c(c7053w).concat("...");
        }
        StringBuilder sb2 = new StringBuilder("<ByteString@");
        sb2.append(hexString);
        sb2.append(" size=");
        sb2.append(iMo7448m);
        sb2.append(" contents=\"");
        return AbstractC9306j0.m9891j(strConcat, "\">", sb2);
    }
}
