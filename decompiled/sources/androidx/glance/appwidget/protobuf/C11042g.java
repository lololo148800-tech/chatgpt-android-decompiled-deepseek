package androidx.glance.appwidget.protobuf;

import android.gov.nist.javax.sdp.fields.AbstractC10763a;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Locale;
import p001A.AbstractC0010F;
import p449S9.C7052V;
import p523V9.AbstractC8194t0;
import p571X9.AbstractC9306j0;
import p911o0.AbstractC17792x;

/* JADX INFO: renamed from: androidx.glance.appwidget.protobuf.g */
/* JADX INFO: loaded from: classes.dex */
public class C11042g implements Iterable, Serializable {

    /* JADX INFO: renamed from: o0 */
    public static final C11042g f33300o0 = new C11042g(AbstractC11063y.f33344b);

    /* JADX INFO: renamed from: p0 */
    public static final C11038e f33301p0;

    /* JADX INFO: renamed from: Y */
    public int f33302Y = 0;

    /* JADX INFO: renamed from: Z */
    public final byte[] f33303Z;

    static {
        f33301p0 = AbstractC11034c.m11982a() ? new C11038e(1) : new C11038e(0);
    }

    public C11042g(byte[] bArr) {
        bArr.getClass();
        this.f33303Z = bArr;
    }

    /* JADX INFO: renamed from: i */
    public static int m12019i(int i10, int i11, int i12) {
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
    public static C11042g m12020j(byte[] bArr, int i10, int i11) {
        byte[] bArrCopyOfRange;
        m12019i(i10, i10 + i11, bArr.length);
        switch (f33301p0.f33289a) {
            case 0:
                bArrCopyOfRange = Arrays.copyOfRange(bArr, i10, i11 + i10);
                break;
            default:
                bArrCopyOfRange = new byte[i11];
                System.arraycopy(bArr, i10, bArrCopyOfRange, 0, i11);
                break;
        }
        return new C11042g(bArrCopyOfRange);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C11042g) || size() != ((C11042g) obj).size()) {
            return false;
        }
        if (size() == 0) {
            return true;
        }
        if (!(obj instanceof C11042g)) {
            return obj.equals(this);
        }
        C11042g c11042g = (C11042g) obj;
        int i10 = this.f33302Y;
        int i11 = c11042g.f33302Y;
        if (i10 != 0 && i11 != 0 && i10 != i11) {
            return false;
        }
        int size = size();
        if (size > c11042g.size()) {
            throw new IllegalArgumentException("Length too large: " + size + size());
        }
        if (size > c11042g.size()) {
            StringBuilder sbM11057o = AbstractC10763a.m11057o(size, "Ran off end of other: 0, ", ", ");
            sbM11057o.append(c11042g.size());
            throw new IllegalArgumentException(sbM11057o.toString());
        }
        int iMo12002m = mo12002m() + size;
        int iMo12002m2 = mo12002m();
        int iMo12002m3 = c11042g.mo12002m();
        while (iMo12002m2 < iMo12002m) {
            if (this.f33303Z[iMo12002m2] != c11042g.f33303Z[iMo12002m3]) {
                return false;
            }
            iMo12002m2++;
            iMo12002m3++;
        }
        return true;
    }

    /* JADX INFO: renamed from: f */
    public byte mo12001f(int i10) {
        return this.f33303Z[i10];
    }

    public final int hashCode() {
        int i10 = this.f33302Y;
        if (i10 == 0) {
            int size = size();
            int iMo12002m = mo12002m();
            int i11 = size;
            for (int i12 = iMo12002m; i12 < iMo12002m + size; i12++) {
                i11 = (i11 * 31) + this.f33303Z[i12];
            }
            i10 = i11 == 0 ? 1 : i11;
            this.f33302Y = i10;
        }
        return i10;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new C7052V(this);
    }

    /* JADX INFO: renamed from: m */
    public int mo12002m() {
        return 0;
    }

    /* JADX INFO: renamed from: p */
    public byte mo12003p(int i10) {
        return this.f33303Z[i10];
    }

    public int size() {
        return this.f33303Z.length;
    }

    public final String toString() {
        C11042g c11040f;
        String string;
        Locale locale = Locale.ROOT;
        String hexString = Integer.toHexString(System.identityHashCode(this));
        int size = size();
        if (size() <= 50) {
            string = AbstractC8194t0.m8796b(this);
        } else {
            StringBuilder sb2 = new StringBuilder();
            int iM12019i = m12019i(0, 47, size());
            if (iM12019i == 0) {
                c11040f = f33300o0;
            } else {
                c11040f = new C11040f(this.f33303Z, mo12002m(), iM12019i);
            }
            sb2.append(AbstractC8194t0.m8796b(c11040f));
            sb2.append("...");
            string = sb2.toString();
        }
        StringBuilder sb3 = new StringBuilder("<ByteString@");
        sb3.append(hexString);
        sb3.append(" size=");
        sb3.append(size);
        sb3.append(" contents=\"");
        return AbstractC9306j0.m9891j(string, "\">", sb3);
    }
}
