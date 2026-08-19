package p030B2;

import android.os.Build;
import android.view.View;
import p817j$.util.Objects;
import p979r2.C18862c;

/* JADX INFO: renamed from: B2.w0 */
/* JADX INFO: loaded from: classes.dex */
public class C0790w0 {

    /* JADX INFO: renamed from: b */
    public static final C0794y0 f2205b;

    /* JADX INFO: renamed from: a */
    public final C0794y0 f2206a;

    static {
        AbstractC0778q0 c0774o0;
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 30) {
            c0774o0 = new C0776p0();
        } else {
            c0774o0 = i10 >= 29 ? new C0774o0() : new C0772n0();
        }
        f2205b = c0774o0.mo1714b().f2209a.mo1774a().f2209a.mo1768b().f2209a.mo1769c();
    }

    public C0790w0(C0794y0 c0794y0) {
        this.f2206a = c0794y0;
    }

    /* JADX INFO: renamed from: a */
    public C0794y0 mo1774a() {
        return this.f2206a;
    }

    /* JADX INFO: renamed from: b */
    public C0794y0 mo1768b() {
        return this.f2206a;
    }

    /* JADX INFO: renamed from: c */
    public C0794y0 mo1769c() {
        return this.f2206a;
    }

    /* JADX INFO: renamed from: e */
    public C0765k mo1775e() {
        return null;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0790w0)) {
            return false;
        }
        C0790w0 c0790w0 = (C0790w0) obj;
        return mo1758o() == c0790w0.mo1758o() && mo1771n() == c0790w0.mo1771n() && Objects.equals(mo1756k(), c0790w0.mo1756k()) && Objects.equals(mo1770i(), c0790w0.mo1770i()) && Objects.equals(mo1775e(), c0790w0.mo1775e());
    }

    /* JADX INFO: renamed from: f */
    public C18862c mo1754f(int i10) {
        return C18862c.f60085e;
    }

    /* JADX INFO: renamed from: g */
    public C18862c mo1755g(int i10) {
        if ((i10 & 8) == 0) {
            return C18862c.f60085e;
        }
        throw new IllegalArgumentException("Unable to query the maximum insets for IME");
    }

    /* JADX INFO: renamed from: h */
    public C18862c mo1776h() {
        return mo1756k();
    }

    public int hashCode() {
        return Objects.hash(Boolean.valueOf(mo1758o()), Boolean.valueOf(mo1771n()), mo1756k(), mo1770i(), mo1775e());
    }

    /* JADX INFO: renamed from: i */
    public C18862c mo1770i() {
        return C18862c.f60085e;
    }

    /* JADX INFO: renamed from: j */
    public C18862c mo1777j() {
        return mo1756k();
    }

    /* JADX INFO: renamed from: k */
    public C18862c mo1756k() {
        return C18862c.f60085e;
    }

    /* JADX INFO: renamed from: l */
    public C18862c mo1778l() {
        return mo1756k();
    }

    /* JADX INFO: renamed from: m */
    public C0794y0 mo1757m(int i10, int i11, int i12, int i13) {
        return f2205b;
    }

    /* JADX INFO: renamed from: n */
    public boolean mo1771n() {
        return false;
    }

    /* JADX INFO: renamed from: o */
    public boolean mo1758o() {
        return false;
    }

    /* JADX INFO: renamed from: p */
    public boolean mo1759p(int i10) {
        return true;
    }

    /* JADX INFO: renamed from: d */
    public void mo1753d(View view) {
    }

    /* JADX INFO: renamed from: q */
    public void mo1760q(C18862c[] c18862cArr) {
    }

    /* JADX INFO: renamed from: r */
    public void mo1761r(C0794y0 c0794y0) {
    }

    /* JADX INFO: renamed from: s */
    public void mo1772s(C18862c c18862c) {
    }
}
