package p692d0;

import android.gov.nist.javax.sdp.fields.AbstractC10763a;
import java.util.Arrays;
import kotlin.jvm.internal.AbstractC16544l;
import p200Hm.C3508g;
import p530Vi.AbstractC8301I;
import p909nm.AbstractC17678l;

/* JADX INFO: renamed from: d0.t */
/* JADX INFO: loaded from: classes.dex */
public final class C12981t {

    /* JADX INFO: renamed from: a */
    public int[] f41202a;

    /* JADX INFO: renamed from: b */
    public int f41203b;

    public C12981t(int i10) {
        this.f41202a = i10 == 0 ? AbstractC12973l.f41183a : new int[i10];
    }

    /* JADX INFO: renamed from: a */
    public final void m14684a(int i10) {
        m14685b(this.f41203b + 1);
        int[] iArr = this.f41202a;
        int i11 = this.f41203b;
        iArr[i11] = i10;
        this.f41203b = i11 + 1;
    }

    /* JADX INFO: renamed from: b */
    public final void m14685b(int i10) {
        int[] iArr = this.f41202a;
        if (iArr.length < i10) {
            int[] iArrCopyOf = Arrays.copyOf(iArr, Math.max(i10, (iArr.length * 3) / 2));
            AbstractC16544l.m18093f(iArrCopyOf, "copyOf(this, newSize)");
            this.f41202a = iArrCopyOf;
        }
    }

    /* JADX INFO: renamed from: c */
    public final int m14686c(int i10) {
        if (i10 >= 0 && i10 < this.f41203b) {
            return this.f41202a[i10];
        }
        StringBuilder sbM11057o = AbstractC10763a.m11057o(i10, "Index ", " must be in 0..");
        sbM11057o.append(this.f41203b - 1);
        throw new IndexOutOfBoundsException(sbM11057o.toString());
    }

    /* JADX INFO: renamed from: d */
    public final int m14687d(int i10) {
        int i11;
        if (i10 < 0 || i10 >= (i11 = this.f41203b)) {
            StringBuilder sbM11057o = AbstractC10763a.m11057o(i10, "Index ", " must be in 0..");
            sbM11057o.append(this.f41203b - 1);
            throw new IndexOutOfBoundsException(sbM11057o.toString());
        }
        int[] iArr = this.f41202a;
        int i12 = iArr[i10];
        if (i10 != i11 - 1) {
            AbstractC17678l.m19303j(i10, i10 + 1, i11, iArr, iArr);
        }
        this.f41203b--;
        return i12;
    }

    /* JADX INFO: renamed from: e */
    public final void m14688e(int i10, int i11) {
        if (i10 < 0 || i10 >= this.f41203b) {
            StringBuilder sbM11057o = AbstractC10763a.m11057o(i10, "set index ", " must be between 0 .. ");
            sbM11057o.append(this.f41203b - 1);
            throw new IndexOutOfBoundsException(sbM11057o.toString());
        }
        int[] iArr = this.f41202a;
        int i12 = iArr[i10];
        iArr[i10] = i11;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C12981t) {
            C12981t c12981t = (C12981t) obj;
            int i10 = c12981t.f41203b;
            int i11 = this.f41203b;
            if (i10 == i11) {
                int[] iArr = this.f41202a;
                int[] iArr2 = c12981t.f41202a;
                C3508g c3508gM8929t = AbstractC8301I.m8929t(0, i11);
                int i12 = c3508gM8929t.f10591Y;
                int i13 = c3508gM8929t.f10592Z;
                if (i12 > i13) {
                    return true;
                }
                while (iArr[i12] == iArr2[i12]) {
                    if (i12 == i13) {
                        return true;
                    }
                    i12++;
                }
                return false;
            }
        }
        return false;
    }

    public final int hashCode() {
        int[] iArr = this.f41202a;
        int i10 = this.f41203b;
        int i11 = 0;
        for (int i12 = 0; i12 < i10; i12++) {
            i11 += iArr[i12] * 31;
        }
        return i11;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append((CharSequence) "[");
        int[] iArr = this.f41202a;
        int i10 = this.f41203b;
        for (int i11 = 0; i11 < i10; i11++) {
            int i12 = iArr[i11];
            if (i11 == -1) {
                sb2.append((CharSequence) "...");
                String string = sb2.toString();
                AbstractC16544l.m18093f(string, "StringBuilder().apply(builderAction).toString()");
                return string;
            }
            if (i11 != 0) {
                sb2.append((CharSequence) ", ");
            }
            sb2.append(i12);
        }
        sb2.append((CharSequence) "]");
        String string2 = sb2.toString();
        AbstractC16544l.m18093f(string2, "StringBuilder().apply(builderAction).toString()");
        return string2;
    }

    public /* synthetic */ C12981t() {
        this(16);
    }
}
