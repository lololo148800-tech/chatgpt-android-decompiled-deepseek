package p1116y0;

import android.gov.nist.javax.sdp.fields.AbstractC10763a;
import p1036u9.C20168n;
import p1139z0.C21593P;
import p204I1.C3581L;
import p349O0.C5960K;
import p544W9.AbstractC8676n;
import p926of.yRae.sVDIzpC;

/* JADX INFO: renamed from: y0.a */
/* JADX INFO: loaded from: classes.dex */
public final class C21352a implements Appendable {

    /* JADX INFO: renamed from: Y */
    public final C5960K f67813Y;

    /* JADX INFO: renamed from: Z */
    public final C21593P f67814Z;

    /* JADX INFO: renamed from: o0 */
    public C20168n f67815o0;

    /* JADX INFO: renamed from: p0 */
    public long f67816p0;

    public C21352a(C21353b c21353b, C20168n c20168n, C5960K c5960k, int i10) {
        c20168n = (i10 & 2) != 0 ? null : c20168n;
        this.f67813Y = (i10 & 8) != 0 ? null : c5960k;
        this.f67814Z = new C21593P(c21353b);
        this.f67815o0 = c20168n != null ? new C20168n(c20168n) : null;
        this.f67816p0 = c21353b.f67818Z;
    }

    /* JADX INFO: renamed from: a */
    public final C20168n m21746a() {
        C20168n c20168n = this.f67815o0;
        if (c20168n != null) {
            return c20168n;
        }
        C20168n c20168n2 = new C20168n((C20168n) null);
        this.f67815o0 = c20168n2;
        return c20168n2;
    }

    @Override // java.lang.Appendable
    public final Appendable append(char c9) {
        C21593P c21593p = this.f67814Z;
        m21747b(c21593p.length(), c21593p.length(), 1);
        int length = c21593p.length();
        int length2 = c21593p.length();
        String strValueOf = String.valueOf(c9);
        c21593p.m21939a(length, length2, strValueOf, 0, strValueOf.length());
        return this;
    }

    /* JADX INFO: renamed from: b */
    public final void m21747b(int i10, int i11, int i12) {
        int i13;
        m21746a().m20992i(i10, i11, i12);
        C5960K c5960k = this.f67813Y;
        if (c5960k != null) {
            c5960k.m6401h(i10, i11, i12);
        }
        int iMin = Math.min(i10, i11);
        int iMax = Math.max(i10, i11);
        int iM4270f = C3581L.m4270f(this.f67816p0);
        int iM4269e = C3581L.m4269e(this.f67816p0);
        if (iM4269e < iMin) {
            return;
        }
        if (iM4270f <= iMin && iMax <= iM4269e) {
            i13 = i12 - (iMax - iMin);
            if (iM4270f == iM4269e) {
            }
            iMin = iM4269e + i13;
            this.f67816p0 = AbstractC8676n.m9365b(iM4270f, iMin);
        }
        if (iM4270f > iMin && iM4269e < iMax) {
            iMin += i12;
            iM4270f = iMin;
        } else if (iM4270f >= iMax) {
            i13 = i12 - (iMax - iMin);
        } else if (iMin < iM4270f) {
            iM4270f = iMin + i12;
            iMin = (i12 - (iMax - iMin)) + iM4269e;
        }
        this.f67816p0 = AbstractC8676n.m9365b(iM4270f, iMin);
        iM4270f += i13;
        iMin = iM4269e + i13;
        this.f67816p0 = AbstractC8676n.m9365b(iM4270f, iMin);
    }

    public final String toString() {
        return this.f67814Z.toString();
    }

    /* JADX INFO: renamed from: c */
    public final void m21748c(int i10, CharSequence charSequence) {
        int length = charSequence.length();
        if (i10 >= 0) {
            if (length >= 0) {
                m21747b(0, i10, length);
                this.f67814Z.m21939a(0, i10, charSequence, 0, length);
                return;
            }
            throw new IllegalArgumentException(AbstractC10763a.m11048f(length, sVDIzpC.XLtUA).toString());
        }
        throw new IllegalArgumentException(AbstractC10763a.m11048f(i10, "Expected start=0 <= end=").toString());
    }

    @Override // java.lang.Appendable
    public final Appendable append(CharSequence charSequence) {
        if (charSequence != null) {
            C21593P c21593p = this.f67814Z;
            m21747b(c21593p.length(), c21593p.length(), charSequence.length());
            c21593p.m21939a(c21593p.length(), c21593p.length(), charSequence, 0, charSequence.length());
        }
        return this;
    }

    @Override // java.lang.Appendable
    public final Appendable append(CharSequence charSequence, int i10, int i11) {
        if (charSequence != null) {
            C21593P c21593p = this.f67814Z;
            m21747b(c21593p.length(), c21593p.length(), i11 - i10);
            int length = c21593p.length();
            int length2 = c21593p.length();
            CharSequence charSequenceSubSequence = charSequence.subSequence(i10, i11);
            c21593p.m21939a(length, length2, charSequenceSubSequence, 0, charSequenceSubSequence.length());
        }
        return this;
    }
}
