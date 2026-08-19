package p350O1;

import android.gov.nist.javax.sdp.fields.AbstractC10763a;
import p1073w3.C20811m;
import p204I1.C3581L;
import p204I1.C3590f;
import p239Ja.C4312o;
import p544W9.AbstractC8676n;
import p544W9.AbstractC8747y4;
import p824j4.C16106b;
import p824j4.InterfaceC16108d;
import p911o0.AbstractC17792x;

/* JADX INFO: renamed from: O1.j */
/* JADX INFO: loaded from: classes.dex */
public final class C6061j implements InterfaceC16108d {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f19743Y = 2;

    /* JADX INFO: renamed from: Z */
    public int f19744Z;

    /* JADX INFO: renamed from: o0 */
    public int f19745o0;

    /* JADX INFO: renamed from: p0 */
    public int f19746p0;

    /* JADX INFO: renamed from: q0 */
    public int f19747q0;

    /* JADX INFO: renamed from: r0 */
    public final Object f19748r0;

    public C6061j(C3590f c3590f, long j10) {
        String str = c3590f.f10934Y;
        C4312o c4312o = new C4312o(2, (byte) 0);
        c4312o.f14018d = str;
        c4312o.f14016b = -1;
        c4312o.f14017c = -1;
        this.f19748r0 = c4312o;
        this.f19744Z = C3581L.m4270f(j10);
        this.f19745o0 = C3581L.m4269e(j10);
        this.f19746p0 = -1;
        this.f19747q0 = -1;
        int iM4270f = C3581L.m4270f(j10);
        int iM4269e = C3581L.m4269e(j10);
        String str2 = c3590f.f10934Y;
        if (iM4270f < 0 || iM4270f > str2.length()) {
            StringBuilder sbM11057o = AbstractC10763a.m11057o(iM4270f, "start (", ") offset is outside of text region ");
            sbM11057o.append(str2.length());
            throw new IndexOutOfBoundsException(sbM11057o.toString());
        }
        if (iM4269e < 0 || iM4269e > str2.length()) {
            StringBuilder sbM11057o2 = AbstractC10763a.m11057o(iM4269e, "end (", ") offset is outside of text region ");
            sbM11057o2.append(str2.length());
            throw new IndexOutOfBoundsException(sbM11057o2.toString());
        }
        if (iM4270f > iM4269e) {
            throw new IllegalArgumentException(AbstractC17792x.m19534q("Do not set reversed range: ", iM4270f, iM4269e, " > "));
        }
    }

    @Override // p824j4.InterfaceC16108d
    /* JADX INFO: renamed from: a */
    public int mo6627a() {
        return -1;
    }

    @Override // p824j4.InterfaceC16108d
    /* JADX INFO: renamed from: b */
    public int mo6628b() {
        return this.f19744Z;
    }

    /* JADX INFO: renamed from: c */
    public void m6629c(int i10, int i11) {
        long jM9365b = AbstractC8676n.m9365b(i10, i11);
        ((C4312o) this.f19748r0).m5078J(i10, i11, "");
        long jM9499b = AbstractC8747y4.m9499b(AbstractC8676n.m9365b(this.f19744Z, this.f19745o0), jM9365b);
        m6637k(C3581L.m4270f(jM9499b));
        m6636j(C3581L.m4269e(jM9499b));
        int i12 = this.f19746p0;
        if (i12 != -1) {
            long jM9499b2 = AbstractC8747y4.m9499b(AbstractC8676n.m9365b(i12, this.f19747q0), jM9365b);
            if (C3581L.m4267c(jM9499b2)) {
                this.f19746p0 = -1;
                this.f19747q0 = -1;
            } else {
                this.f19746p0 = C3581L.m4270f(jM9499b2);
                this.f19747q0 = C3581L.m4269e(jM9499b2);
            }
        }
    }

    /* JADX INFO: renamed from: d */
    public char m6630d(int i10) {
        C4312o c4312o = (C4312o) this.f19748r0;
        C6063l c6063l = (C6063l) c4312o.f14019e;
        if (c6063l == null) {
            return ((String) c4312o.f14018d).charAt(i10);
        }
        if (i10 < c4312o.f14016b) {
            return ((String) c4312o.f14018d).charAt(i10);
        }
        int iM6638a = c6063l.f19750b - c6063l.m6638a();
        int i11 = c4312o.f14016b;
        if (i10 >= iM6638a + i11) {
            return ((String) c4312o.f14018d).charAt(i10 - ((iM6638a - c4312o.f14017c) + i11));
        }
        int i12 = i10 - i11;
        int i13 = c6063l.f19752d;
        return i12 < i13 ? c6063l.f19751c[i12] : c6063l.f19751c[(i12 - i13) + c6063l.f19753e];
    }

    @Override // p824j4.InterfaceC16108d
    /* JADX INFO: renamed from: e */
    public int mo6631e() {
        C20811m c20811m = (C20811m) this.f19748r0;
        int i10 = this.f19745o0;
        if (i10 == 8) {
            return c20811m.m21365t();
        }
        if (i10 == 16) {
            return c20811m.m21371z();
        }
        int i11 = this.f19746p0;
        this.f19746p0 = i11 + 1;
        if (i11 % 2 != 0) {
            return this.f19747q0 & 15;
        }
        int iM21365t = c20811m.m21365t();
        this.f19747q0 = iM21365t;
        return (iM21365t & 240) >> 4;
    }

    /* JADX INFO: renamed from: f */
    public C3581L m6632f() {
        int i10 = this.f19746p0;
        if (i10 != -1) {
            return new C3581L(AbstractC8676n.m9365b(i10, this.f19747q0));
        }
        return null;
    }

    /* JADX INFO: renamed from: g */
    public void m6633g(int i10, int i11, String str) {
        C4312o c4312o = (C4312o) this.f19748r0;
        if (i10 < 0 || i10 > c4312o.m5100s()) {
            StringBuilder sbM11057o = AbstractC10763a.m11057o(i10, "start (", ") offset is outside of text region ");
            sbM11057o.append(c4312o.m5100s());
            throw new IndexOutOfBoundsException(sbM11057o.toString());
        }
        if (i11 < 0 || i11 > c4312o.m5100s()) {
            StringBuilder sbM11057o2 = AbstractC10763a.m11057o(i11, "end (", ") offset is outside of text region ");
            sbM11057o2.append(c4312o.m5100s());
            throw new IndexOutOfBoundsException(sbM11057o2.toString());
        }
        if (i10 > i11) {
            throw new IllegalArgumentException(AbstractC17792x.m19534q("Do not set reversed range: ", i10, i11, " > "));
        }
        c4312o.m5078J(i10, i11, str);
        m6637k(str.length() + i10);
        m6636j(str.length() + i10);
        this.f19746p0 = -1;
        this.f19747q0 = -1;
    }

    /* JADX INFO: renamed from: h */
    public void m6634h(int i10, int i11) {
        C4312o c4312o = (C4312o) this.f19748r0;
        if (i10 < 0 || i10 > c4312o.m5100s()) {
            StringBuilder sbM11057o = AbstractC10763a.m11057o(i10, "start (", ") offset is outside of text region ");
            sbM11057o.append(c4312o.m5100s());
            throw new IndexOutOfBoundsException(sbM11057o.toString());
        }
        if (i11 < 0 || i11 > c4312o.m5100s()) {
            StringBuilder sbM11057o2 = AbstractC10763a.m11057o(i11, "end (", ") offset is outside of text region ");
            sbM11057o2.append(c4312o.m5100s());
            throw new IndexOutOfBoundsException(sbM11057o2.toString());
        }
        if (i10 >= i11) {
            throw new IllegalArgumentException(AbstractC17792x.m19534q("Do not set reversed or empty range: ", i10, i11, " > "));
        }
        this.f19746p0 = i10;
        this.f19747q0 = i11;
    }

    /* JADX INFO: renamed from: i */
    public void m6635i(int i10, int i11) {
        C4312o c4312o = (C4312o) this.f19748r0;
        if (i10 < 0 || i10 > c4312o.m5100s()) {
            StringBuilder sbM11057o = AbstractC10763a.m11057o(i10, "start (", ") offset is outside of text region ");
            sbM11057o.append(c4312o.m5100s());
            throw new IndexOutOfBoundsException(sbM11057o.toString());
        }
        if (i11 < 0 || i11 > c4312o.m5100s()) {
            StringBuilder sbM11057o2 = AbstractC10763a.m11057o(i11, "end (", ") offset is outside of text region ");
            sbM11057o2.append(c4312o.m5100s());
            throw new IndexOutOfBoundsException(sbM11057o2.toString());
        }
        if (i10 > i11) {
            throw new IllegalArgumentException(AbstractC17792x.m19534q("Do not set reversed range: ", i10, i11, " > "));
        }
        m6637k(i10);
        m6636j(i11);
    }

    /* JADX INFO: renamed from: j */
    public void m6636j(int i10) {
        if (i10 < 0) {
            throw new IllegalArgumentException(AbstractC10763a.m11048f(i10, "Cannot set selectionEnd to a negative value: ").toString());
        }
        this.f19745o0 = i10;
    }

    /* JADX INFO: renamed from: k */
    public void m6637k(int i10) {
        if (i10 < 0) {
            throw new IllegalArgumentException(AbstractC10763a.m11048f(i10, "Cannot set selectionStart to a negative value: ").toString());
        }
        this.f19744Z = i10;
    }

    public String toString() {
        switch (this.f19743Y) {
            case 0:
                return ((C4312o) this.f19748r0).toString();
            default:
                return super.toString();
        }
    }

    public C6061j(int i10, int i11, int i12, int i13, int i14, byte[] bArr) {
        this.f19744Z = i11;
        this.f19745o0 = i12;
        this.f19746p0 = i13;
        this.f19747q0 = i14;
        this.f19748r0 = bArr;
    }

    public C6061j(C16106b c16106b) {
        C20811m c20811m = c16106b.f49886o0;
        this.f19748r0 = c20811m;
        c20811m.m21344F(12);
        this.f19745o0 = c20811m.m21369x() & 255;
        this.f19744Z = c20811m.m21369x();
    }
}
