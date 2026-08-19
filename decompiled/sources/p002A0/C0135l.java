package p002A0;

import p049Bm.InterfaceC1436k;
import p1071w0.AbstractC20740b0;
import p1116y0.C21353b;
import p1139z0.C21582E0;
import p204I1.C3578I;
import p204I1.C3581L;
import p204I1.C3599o;
import p277L.AbstractC4835h;
import p467T1.EnumC7198h;
import p523V9.AbstractC8088f6;
import p544W9.AbstractC8676n;
import p586Y0.AbstractC9556h;
import p586Y0.AbstractC9567s;
import p759g1.C13801c;

/* JADX INFO: renamed from: A0.l */
/* JADX INFO: loaded from: classes.dex */
public final class C0135l {

    /* JADX INFO: renamed from: a */
    public final C21582E0 f562a;

    /* JADX INFO: renamed from: b */
    public final C3578I f563b;

    /* JADX INFO: renamed from: c */
    public final float f564c;

    /* JADX INFO: renamed from: d */
    public final C0136m f565d;

    /* JADX INFO: renamed from: e */
    public final C21353b f566e;

    /* JADX INFO: renamed from: f */
    public long f567f;

    /* JADX INFO: renamed from: g */
    public final String f568g;

    public C0135l(C21582E0 c21582e0, C3578I c3578i, boolean z6, float f10, C0136m c0136m) {
        this.f562a = c21582e0;
        this.f563b = c3578i;
        this.f564c = f10;
        this.f565d = c0136m;
        AbstractC9556h abstractC9556hM10108d = AbstractC9567s.m10108d();
        InterfaceC1436k interfaceC1436kMo10046f = abstractC9556hM10108d != null ? abstractC9556hM10108d.mo10046f() : null;
        AbstractC9556h abstractC9556hM10109e = AbstractC9567s.m10109e(abstractC9556hM10108d);
        try {
            C21353b c21353bM21881c = c21582e0.m21881c();
            AbstractC9567s.m10112h(abstractC9556hM10108d, abstractC9556hM10109e, interfaceC1436kMo10046f);
            this.f566e = c21353bM21881c;
            this.f567f = c21353bM21881c.f67818Z;
            this.f568g = c21353bM21881c.f67817Y.toString();
        } catch (Throwable th2) {
            AbstractC9567s.m10112h(abstractC9556hM10108d, abstractC9556hM10109e, interfaceC1436kMo10046f);
            throw th2;
        }
    }

    /* JADX INFO: renamed from: a */
    public final int m440a() {
        String str = this.f568g;
        C3578I c3578i = this.f563b;
        if (c3578i == null) {
            return str.length();
        }
        long j10 = this.f567f;
        int i10 = C3581L.f10907c;
        int i11 = (int) (j10 & 4294967295L);
        while (true) {
            C21353b c21353b = this.f566e;
            if (i11 >= c21353b.f67817Y.length()) {
                return c21353b.f67817Y.length();
            }
            int length = str.length() - 1;
            if (i11 <= length) {
                length = i11;
            }
            long jM4263m = c3578i.m4263m(length);
            int i12 = C3581L.f10907c;
            int i13 = (int) (jM4263m & 4294967295L);
            if (i13 > i11) {
                return i13;
            }
            i11++;
        }
    }

    /* JADX INFO: renamed from: b */
    public final int m441b() {
        C3578I c3578i = this.f563b;
        if (c3578i == null) {
            return 0;
        }
        long j10 = this.f567f;
        int i10 = C3581L.f10907c;
        for (int i11 = (int) (j10 & 4294967295L); i11 > 0; i11--) {
            int length = this.f568g.length() - 1;
            if (i11 <= length) {
                length = i11;
            }
            long jM4263m = c3578i.m4263m(length);
            int i12 = C3581L.f10907c;
            int i13 = (int) (jM4263m >> 32);
            if (i13 < i11) {
                return i13;
            }
        }
        return 0;
    }

    /* JADX INFO: renamed from: c */
    public final boolean m442c() {
        C3578I c3578i = this.f563b;
        if (c3578i == null) {
            return true;
        }
        long j10 = this.f567f;
        int i10 = C3581L.f10907c;
        return c3578i.m4261k((int) (j10 & 4294967295L)) == EnumC7198h.f22859Y;
    }

    /* JADX INFO: renamed from: d */
    public final int m443d(C3578I c3578i, int i10) {
        long j10 = this.f567f;
        int i11 = C3581L.f10907c;
        int i12 = (int) (j10 & 4294967295L);
        C0136m c0136m = this.f565d;
        if (Float.isNaN(c0136m.f570b)) {
            c0136m.f570b = c3578i.m4253c(i12).f43586a;
        }
        int iM4257g = c3578i.m4257g(i12) + i10;
        if (iM4257g < 0) {
            return 0;
        }
        C3599o c3599o = c3578i.f10893b;
        if (iM4257g >= c3599o.f10963f) {
            return this.f568g.length();
        }
        float fM4310b = c3599o.m4310b(iM4257g) - 1;
        float f10 = c0136m.f570b;
        return ((!m442c() || f10 < c3578i.m4259i(iM4257g)) && (m442c() || f10 > c3578i.m4258h(iM4257g))) ? c3599o.m4313e(AbstractC8088f6.m8536b(f10, fM4310b)) : c3578i.m4256f(iM4257g, true);
    }

    /* JADX INFO: renamed from: e */
    public final int m444e(int i10) {
        long j10 = this.f566e.f67818Z;
        int i11 = C3581L.f10907c;
        int i12 = (int) (j10 & 4294967295L);
        C3578I c3578i = this.f563b;
        if (c3578i != null) {
            float f10 = this.f564c;
            if (!Float.isNaN(f10)) {
                C13801c c13801cM15325l = c3578i.m4253c(i12).m15325l(0.0f, f10 * i10);
                C3599o c3599o = c3578i.f10893b;
                float f11 = c13801cM15325l.f43587b;
                float fM4310b = c3599o.m4310b(c3599o.m4311c(f11));
                float fAbs = Math.abs(f11 - fM4310b);
                float f12 = c13801cM15325l.f43589d;
                return fAbs > Math.abs(f12 - fM4310b) ? c3599o.m4313e(c13801cM15325l.m15320g()) : c3599o.m4313e(AbstractC8088f6.m8536b(c13801cM15325l.f43586a, f12));
            }
        }
        return i12;
    }

    /* JADX INFO: renamed from: f */
    public final void m445f() {
        this.f565d.f570b = Float.NaN;
        if (this.f568g.length() > 0) {
            if (m442c()) {
                m448i();
            } else {
                m446g();
            }
        }
    }

    /* JADX INFO: renamed from: g */
    public final void m446g() {
        this.f565d.f570b = Float.NaN;
        String str = this.f568g;
        if (str.length() > 0) {
            long j10 = this.f567f;
            int i10 = C3581L.f10907c;
            int i11 = (int) (j10 & 4294967295L);
            int iM5455G = AbstractC4835h.m5455G(str, i11, true, this.f562a);
            if (iM5455G != i11) {
                m454o(iM5455G);
            }
        }
    }

    /* JADX INFO: renamed from: h */
    public final void m447h() {
        this.f565d.f570b = Float.NaN;
        String str = this.f568g;
        if (str.length() > 0) {
            int iM21279t = AbstractC20740b0.m21279t(C3581L.m4269e(this.f567f), str);
            if (iM21279t == C3581L.m4269e(this.f567f) && iM21279t != str.length()) {
                iM21279t = AbstractC20740b0.m21279t(iM21279t + 1, str);
            }
            m454o(iM21279t);
        }
    }

    /* JADX INFO: renamed from: i */
    public final void m448i() {
        this.f565d.f570b = Float.NaN;
        String str = this.f568g;
        if (str.length() > 0) {
            long j10 = this.f567f;
            int i10 = C3581L.f10907c;
            int i11 = (int) (j10 & 4294967295L);
            int iM5455G = AbstractC4835h.m5455G(str, i11, false, this.f562a);
            if (iM5455G != i11) {
                m454o(iM5455G);
            }
        }
    }

    /* JADX INFO: renamed from: j */
    public final void m449j() {
        this.f565d.f570b = Float.NaN;
        String str = this.f568g;
        if (str.length() > 0) {
            int iM21280u = AbstractC20740b0.m21280u(C3581L.m4270f(this.f567f), str);
            if (iM21280u == C3581L.m4270f(this.f567f) && iM21280u != 0) {
                iM21280u = AbstractC20740b0.m21280u(iM21280u - 1, str);
            }
            m454o(iM21280u);
        }
    }

    /* JADX INFO: renamed from: k */
    public final void m450k() {
        this.f565d.f570b = Float.NaN;
        if (this.f568g.length() > 0) {
            if (m442c()) {
                m446g();
            } else {
                m448i();
            }
        }
    }

    /* JADX INFO: renamed from: l */
    public final void m451l() {
        this.f565d.f570b = Float.NaN;
        String str = this.f568g;
        if (str.length() > 0) {
            C3578I c3578i = this.f563b;
            m454o(c3578i != null ? c3578i.m4256f(c3578i.m4257g(C3581L.m4269e(this.f567f)), true) : str.length());
        }
    }

    /* JADX INFO: renamed from: m */
    public final void m452m() {
        this.f565d.f570b = Float.NaN;
        if (this.f568g.length() > 0) {
            C3578I c3578i = this.f563b;
            m454o(c3578i != null ? c3578i.m4260j(c3578i.m4257g(C3581L.m4270f(this.f567f))) : 0);
        }
    }

    /* JADX INFO: renamed from: n */
    public final void m453n() {
        if (this.f568g.length() > 0) {
            long j10 = this.f566e.f67818Z;
            int i10 = C3581L.f10907c;
            this.f567f = AbstractC8676n.m9365b((int) (j10 >> 32), (int) (this.f567f & 4294967295L));
        }
    }

    /* JADX INFO: renamed from: o */
    public final void m454o(int i10) {
        this.f567f = AbstractC8676n.m9365b(i10, i10);
    }
}
