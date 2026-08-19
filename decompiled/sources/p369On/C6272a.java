package p369On;

import android.gov.nist.javax.sdp.fields.AbstractC10763a;
import kotlin.jvm.internal.AbstractC16544l;
import p1113xn.AbstractC21322p;

/* JADX INFO: renamed from: On.a */
/* JADX INFO: loaded from: classes2.dex */
public final class C6272a implements Comparable {

    /* JADX INFO: renamed from: Y */
    public final int f20374Y;

    /* JADX INFO: renamed from: Z */
    public final int f20375Z;

    public C6272a(int i10, int i11) {
        this.f20374Y = i10;
        this.f20375Z = i11;
        if (i11 < 0) {
            throw new IllegalArgumentException(AbstractC10763a.m11048f(i11, "Digits must be non-negative, but was ").toString());
        }
    }

    /* JADX INFO: renamed from: a */
    public final int m6753a(int i10) {
        int i11 = this.f20374Y;
        int i12 = this.f20375Z;
        if (i10 == i12) {
            return i11;
        }
        int[] iArr = AbstractC6273b.f20376a;
        return i10 > i12 ? i11 * iArr[i10 - i12] : i11 / iArr[i12 - i10];
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        C6272a other = (C6272a) obj;
        AbstractC16544l.m18094g(other, "other");
        int iMax = Math.max(this.f20375Z, other.f20375Z);
        return AbstractC16544l.m18096i(m6753a(iMax), other.m6753a(iMax));
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C6272a) {
            C6272a other = (C6272a) obj;
            AbstractC16544l.m18094g(other, "other");
            int iMax = Math.max(this.f20375Z, other.f20375Z);
            if (AbstractC16544l.m18096i(m6753a(iMax), other.m6753a(iMax)) == 0) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        throw new UnsupportedOperationException("DecimalFraction is not supposed to be used as a hash key");
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        int i10 = AbstractC6273b.f20376a[this.f20375Z];
        int i11 = this.f20374Y;
        sb2.append(i11 / i10);
        sb2.append('.');
        sb2.append(AbstractC21322p.m21688V(String.valueOf((i11 % i10) + i10), "1"));
        String string = sb2.toString();
        AbstractC16544l.m18093f(string, "toString(...)");
        return string;
    }
}
