package p1139z0;

import android.gov.nist.javax.sdp.fields.AbstractC10763a;
import mm.C17309l;
import p1036u9.C20168n;
import p204I1.C3581L;
import p204I1.C3590f;
import p530Vi.AbstractC8301I;
import p544W9.AbstractC8676n;
import p911o0.AbstractC17792x;

/* JADX INFO: renamed from: z0.C */
/* JADX INFO: loaded from: classes.dex */
public final class C21577C {

    /* JADX INFO: renamed from: a */
    public final C21593P f68324a;

    /* JADX INFO: renamed from: b */
    public final C20168n f68325b;

    /* JADX INFO: renamed from: c */
    public int f68326c;

    /* JADX INFO: renamed from: d */
    public int f68327d;

    /* JADX INFO: renamed from: e */
    public C17309l f68328e;

    /* JADX INFO: renamed from: f */
    public int f68329f;

    /* JADX INFO: renamed from: g */
    public int f68330g;

    public C21577C(long j10, String str) {
        new C3590f(6, str, null);
        this.f68324a = new C21593P(str);
        this.f68325b = new C20168n((C20168n) null);
        int i10 = C3581L.f10907c;
        int i11 = (int) (j10 >> 32);
        this.f68326c = i11;
        int i12 = (int) (j10 & 4294967295L);
        this.f68327d = i12;
        this.f68329f = -1;
        this.f68330g = -1;
        m21853a(i11, i12);
    }

    /* JADX INFO: renamed from: a */
    public final void m21853a(int i10, int i11) {
        C21593P c21593p = this.f68324a;
        if (i10 < 0 || i10 > c21593p.length()) {
            StringBuilder sbM11057o = AbstractC10763a.m11057o(i10, "start (", ") offset is outside of text region ");
            sbM11057o.append(c21593p.length());
            throw new IndexOutOfBoundsException(sbM11057o.toString());
        }
        if (i11 < 0 || i11 > c21593p.length()) {
            StringBuilder sbM11057o2 = AbstractC10763a.m11057o(i11, "end (", ") offset is outside of text region ");
            sbM11057o2.append(c21593p.length());
            throw new IndexOutOfBoundsException(sbM11057o2.toString());
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m21854b() {
        this.f68329f = -1;
        this.f68330g = -1;
    }

    /* JADX INFO: renamed from: c */
    public final void m21855c(int i10, int i11) {
        m21853a(i10, i11);
        long jM9365b = AbstractC8676n.m9365b(i10, i11);
        this.f68325b.m20992i(i10, i11, 0);
        this.f68324a.m21939a(C3581L.m4270f(jM9365b), C3581L.m4269e(jM9365b), "", 0, 0);
        long jM21978z = AbstractC21627m.m21978z(AbstractC8676n.m9365b(this.f68326c, this.f68327d), jM9365b);
        m21862j((int) (jM21978z >> 32));
        m21861i((int) (jM21978z & 4294967295L));
        int i12 = this.f68329f;
        if (i12 != -1) {
            long jM21978z2 = AbstractC21627m.m21978z(AbstractC8676n.m9365b(i12, this.f68330g), jM9365b);
            if (C3581L.m4267c(jM21978z2)) {
                m21854b();
            } else {
                this.f68329f = C3581L.m4270f(jM21978z2);
                this.f68330g = C3581L.m4269e(jM21978z2);
            }
        }
        this.f68328e = null;
    }

    /* JADX INFO: renamed from: d */
    public final C3581L m21856d() {
        int i10 = this.f68329f;
        if (i10 != -1) {
            return new C3581L(AbstractC8676n.m9365b(i10, this.f68330g));
        }
        return null;
    }

    /* JADX INFO: renamed from: e */
    public final long m21857e() {
        return AbstractC8676n.m9365b(this.f68326c, this.f68327d);
    }

    /* JADX INFO: renamed from: f */
    public final void m21858f(int i10, int i11, CharSequence charSequence) {
        C21593P c21593p;
        m21853a(i10, i11);
        int iMin = Math.min(i10, i11);
        int iMax = Math.max(i10, i11);
        int i12 = 0;
        int i13 = iMin;
        while (true) {
            c21593p = this.f68324a;
            if (i13 >= iMax || i12 >= charSequence.length() || charSequence.charAt(i12) != c21593p.charAt(i13)) {
                break;
            }
            i12++;
            i13++;
        }
        int length = charSequence.length();
        int i14 = iMax;
        while (i14 > iMin && length > i12 && charSequence.charAt(length - 1) == c21593p.charAt(i14 - 1)) {
            length--;
            i14--;
        }
        this.f68325b.m20992i(i13, i14, length - i12);
        this.f68324a.m21939a(iMin, iMax, charSequence, 0, charSequence.length());
        m21862j(charSequence.length() + iMin);
        m21861i(charSequence.length() + iMin);
        this.f68329f = -1;
        this.f68330g = -1;
        this.f68328e = null;
    }

    /* JADX INFO: renamed from: g */
    public final void m21859g(int i10, int i11) {
        C21593P c21593p = this.f68324a;
        if (i10 < 0 || i10 > c21593p.length()) {
            StringBuilder sbM11057o = AbstractC10763a.m11057o(i10, "start (", ") offset is outside of text region ");
            sbM11057o.append(c21593p.length());
            throw new IndexOutOfBoundsException(sbM11057o.toString());
        }
        if (i11 < 0 || i11 > c21593p.length()) {
            StringBuilder sbM11057o2 = AbstractC10763a.m11057o(i11, "end (", ") offset is outside of text region ");
            sbM11057o2.append(c21593p.length());
            throw new IndexOutOfBoundsException(sbM11057o2.toString());
        }
        if (i10 >= i11) {
            throw new IllegalArgumentException(AbstractC17792x.m19534q("Do not set reversed or empty range: ", i10, i11, " > "));
        }
        this.f68329f = i10;
        this.f68330g = i11;
    }

    /* JADX INFO: renamed from: h */
    public final void m21860h(int i10, int i11) {
        C21593P c21593p = this.f68324a;
        int iM8921l = AbstractC8301I.m8921l(i10, 0, c21593p.length());
        int iM8921l2 = AbstractC8301I.m8921l(i11, 0, c21593p.length());
        m21862j(iM8921l);
        m21861i(iM8921l2);
    }

    /* JADX INFO: renamed from: i */
    public final void m21861i(int i10) {
        if (i10 < 0) {
            throw new IllegalArgumentException(AbstractC10763a.m11048f(i10, "Cannot set selectionEnd to a negative value: ").toString());
        }
        this.f68327d = i10;
        this.f68328e = null;
    }

    /* JADX INFO: renamed from: j */
    public final void m21862j(int i10) {
        if (i10 < 0) {
            throw new IllegalArgumentException(AbstractC10763a.m11048f(i10, "Cannot set selectionStart to a negative value: ").toString());
        }
        this.f68326c = i10;
        this.f68328e = null;
    }

    public final String toString() {
        return this.f68324a.toString();
    }
}
