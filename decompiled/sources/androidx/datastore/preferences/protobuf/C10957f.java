package androidx.datastore.preferences.protobuf;

import android.gov.nist.javax.sdp.fields.AbstractC10763a;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Iterator;
import p001A.AbstractC0010F;
import p449S9.C7052V;
import p911o0.AbstractC17792x;

/* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.f */
/* JADX INFO: loaded from: classes.dex */
public class C10957f implements Iterable, Serializable {

    /* JADX INFO: renamed from: o0 */
    public static final C10957f f33028o0 = new C10957f(AbstractC10993x.f33100b);

    /* JADX INFO: renamed from: p0 */
    public static final C10955e f33029p0;

    /* JADX INFO: renamed from: Y */
    public int f33030Y = 0;

    /* JADX INFO: renamed from: Z */
    public final byte[] f33031Z;

    static {
        f33029p0 = AbstractC10951c.m11572a() ? new C10955e(1) : new C10955e(0);
    }

    public C10957f(byte[] bArr) {
        bArr.getClass();
        this.f33031Z = bArr;
    }

    /* JADX INFO: renamed from: f */
    public static C10957f m11580f(byte[] bArr, int i10, int i11) {
        byte[] bArrCopyOfRange;
        int i12 = i10 + i11;
        int length = bArr.length;
        if (((i12 - i10) | i10 | i12 | (length - i12)) < 0) {
            if (i10 < 0) {
                throw new IndexOutOfBoundsException(AbstractC0010F.m19c(i10, "Beginning index: ", " < 0"));
            }
            if (i12 < i10) {
                throw new IndexOutOfBoundsException(AbstractC17792x.m19534q("Beginning index larger than ending index: ", i10, i12, ", "));
            }
            throw new IndexOutOfBoundsException(AbstractC17792x.m19534q("End index: ", i12, length, " >= "));
        }
        switch (f33029p0.f33027a) {
            case 0:
                bArrCopyOfRange = Arrays.copyOfRange(bArr, i10, i11 + i10);
                break;
            default:
                bArrCopyOfRange = new byte[i11];
                System.arraycopy(bArr, i10, bArrCopyOfRange, 0, i11);
                break;
        }
        return new C10957f(bArrCopyOfRange);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C10957f) || size() != ((C10957f) obj).size()) {
            return false;
        }
        if (size() == 0) {
            return true;
        }
        if (!(obj instanceof C10957f)) {
            return obj.equals(this);
        }
        C10957f c10957f = (C10957f) obj;
        int i10 = this.f33030Y;
        int i11 = c10957f.f33030Y;
        if (i10 != 0 && i11 != 0 && i10 != i11) {
            return false;
        }
        int size = size();
        if (size > c10957f.size()) {
            throw new IllegalArgumentException("Length too large: " + size + size());
        }
        if (size > c10957f.size()) {
            StringBuilder sbM11057o = AbstractC10763a.m11057o(size, "Ran off end of other: 0, ", ", ");
            sbM11057o.append(c10957f.size());
            throw new IllegalArgumentException(sbM11057o.toString());
        }
        int iM11581i = m11581i() + size;
        int iM11581i2 = m11581i();
        int iM11581i3 = c10957f.m11581i();
        while (iM11581i2 < iM11581i) {
            if (this.f33031Z[iM11581i2] != c10957f.f33031Z[iM11581i3]) {
                return false;
            }
            iM11581i2++;
            iM11581i3++;
        }
        return true;
    }

    public final int hashCode() {
        int i10 = this.f33030Y;
        if (i10 == 0) {
            int size = size();
            int iM11581i = m11581i();
            int i11 = size;
            for (int i12 = iM11581i; i12 < iM11581i + size; i12++) {
                i11 = (i11 * 31) + this.f33031Z[i12];
            }
            i10 = i11 == 0 ? 1 : i11;
            this.f33030Y = i10;
        }
        return i10;
    }

    /* JADX INFO: renamed from: i */
    public int m11581i() {
        return 0;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new C7052V(this);
    }

    public int size() {
        return this.f33031Z.length;
    }

    public final String toString() {
        return String.format("<ByteString@%s size=%d>", Integer.toHexString(System.identityHashCode(this)), Integer.valueOf(size()));
    }
}
