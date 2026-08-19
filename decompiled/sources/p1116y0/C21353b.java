package p1116y0;

import kotlin.jvm.internal.AbstractC16544l;
import mm.C17309l;
import p1113xn.AbstractC21329w;
import p204I1.C3581L;
import p544W9.AbstractC8676n;

/* JADX INFO: renamed from: y0.b */
/* JADX INFO: loaded from: classes.dex */
public final class C21353b implements CharSequence {

    /* JADX INFO: renamed from: Y */
    public final CharSequence f67817Y;

    /* JADX INFO: renamed from: Z */
    public final long f67818Z;

    /* JADX INFO: renamed from: o0 */
    public final C3581L f67819o0;

    /* JADX INFO: renamed from: p0 */
    public final C17309l f67820p0;

    public C21353b(CharSequence charSequence, long j10, C3581L c3581l, int i10) {
        this(charSequence, j10, (i10 & 4) != 0 ? null : c3581l, (C17309l) null);
    }

    @Override // java.lang.CharSequence
    public final char charAt(int i10) {
        return this.f67817Y.charAt(i10);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C21353b.class != obj.getClass()) {
            return false;
        }
        C21353b c21353b = (C21353b) obj;
        return C3581L.m4266b(this.f67818Z, c21353b.f67818Z) && AbstractC16544l.m18089b(this.f67819o0, c21353b.f67819o0) && AbstractC16544l.m18089b(this.f67820p0, c21353b.f67820p0) && AbstractC21329w.m21722i(this.f67817Y, c21353b.f67817Y);
    }

    public final int hashCode() {
        int i10;
        int iHashCode = this.f67817Y.hashCode() * 31;
        int i11 = C3581L.f10907c;
        long j10 = this.f67818Z;
        int i12 = (((int) (j10 ^ (j10 >>> 32))) + iHashCode) * 31;
        C3581L c3581l = this.f67819o0;
        if (c3581l != null) {
            long j11 = c3581l.f10908a;
            i10 = (int) ((j11 >>> 32) ^ j11);
        } else {
            i10 = 0;
        }
        int i13 = (i12 + i10) * 31;
        C17309l c17309l = this.f67820p0;
        return i13 + (c17309l != null ? c17309l.hashCode() : 0);
    }

    @Override // java.lang.CharSequence
    public final int length() {
        return this.f67817Y.length();
    }

    @Override // java.lang.CharSequence
    public final CharSequence subSequence(int i10, int i11) {
        return this.f67817Y.subSequence(i10, i11);
    }

    @Override // java.lang.CharSequence
    public final String toString() {
        return this.f67817Y.toString();
    }

    public C21353b(CharSequence charSequence, long j10, C3581L c3581l, C17309l c17309l) {
        this.f67817Y = charSequence instanceof C21353b ? ((C21353b) charSequence).f67817Y : charSequence;
        this.f67818Z = AbstractC8676n.m9366c(charSequence.length(), j10);
        this.f67819o0 = c3581l != null ? new C3581L(AbstractC8676n.m9366c(charSequence.length(), c3581l.f10908a)) : null;
        this.f67820p0 = c17309l != null ? new C17309l(c17309l.f55136Y, new C3581L(AbstractC8676n.m9366c(charSequence.length(), ((C3581L) c17309l.f55137Z).f10908a))) : null;
    }
}
