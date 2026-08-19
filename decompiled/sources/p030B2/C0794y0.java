package p030B2;

import android.os.Build;
import android.view.View;
import android.view.WindowInsets;
import java.util.WeakHashMap;
import p817j$.util.Objects;
import p979r2.C18862c;

/* JADX INFO: renamed from: B2.y0 */
/* JADX INFO: loaded from: classes.dex */
public final class C0794y0 {

    /* JADX INFO: renamed from: b */
    public static final C0794y0 f2208b;

    /* JADX INFO: renamed from: a */
    public final C0790w0 f2209a;

    static {
        if (Build.VERSION.SDK_INT >= 30) {
            f2208b = C0788v0.f2202q;
        } else {
            f2208b = C0790w0.f2205b;
        }
    }

    public C0794y0(WindowInsets windowInsets) {
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 30) {
            this.f2209a = new C0788v0(this, windowInsets);
            return;
        }
        if (i10 >= 29) {
            this.f2209a = new C0786u0(this, windowInsets);
        } else if (i10 >= 28) {
            this.f2209a = new C0784t0(this, windowInsets);
        } else {
            this.f2209a = new C0782s0(this, windowInsets);
        }
    }

    /* JADX INFO: renamed from: e */
    public static C18862c m1811e(C18862c c18862c, int i10, int i11, int i12, int i13) {
        int iMax = Math.max(0, c18862c.f60086a - i10);
        int iMax2 = Math.max(0, c18862c.f60087b - i11);
        int iMax3 = Math.max(0, c18862c.f60088c - i12);
        int iMax4 = Math.max(0, c18862c.f60089d - i13);
        return (iMax == i10 && iMax2 == i11 && iMax3 == i12 && iMax4 == i13) ? c18862c : C18862c.m20171b(iMax, iMax2, iMax3, iMax4);
    }

    /* JADX INFO: renamed from: g */
    public static C0794y0 m1812g(View view, WindowInsets windowInsets) {
        windowInsets.getClass();
        C0794y0 c0794y0 = new C0794y0(windowInsets);
        if (view != null && view.isAttachedToWindow()) {
            WeakHashMap weakHashMap = AbstractC0738T.f2096a;
            C0794y0 c0794y0M1557a = AbstractC0731L.m1557a(view);
            C0790w0 c0790w0 = c0794y0.f2209a;
            c0790w0.mo1761r(c0794y0M1557a);
            c0790w0.mo1753d(view.getRootView());
        }
        return c0794y0;
    }

    /* JADX INFO: renamed from: a */
    public final int m1813a() {
        return this.f2209a.mo1756k().f60089d;
    }

    /* JADX INFO: renamed from: b */
    public final int m1814b() {
        return this.f2209a.mo1756k().f60086a;
    }

    /* JADX INFO: renamed from: c */
    public final int m1815c() {
        return this.f2209a.mo1756k().f60088c;
    }

    /* JADX INFO: renamed from: d */
    public final int m1816d() {
        return this.f2209a.mo1756k().f60087b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0794y0)) {
            return false;
        }
        return Objects.equals(this.f2209a, ((C0794y0) obj).f2209a);
    }

    /* JADX INFO: renamed from: f */
    public final WindowInsets m1817f() {
        C0790w0 c0790w0 = this.f2209a;
        if (c0790w0 instanceof AbstractC0780r0) {
            return ((AbstractC0780r0) c0790w0).f2186c;
        }
        return null;
    }

    public final int hashCode() {
        C0790w0 c0790w0 = this.f2209a;
        if (c0790w0 == null) {
            return 0;
        }
        return c0790w0.hashCode();
    }

    public C0794y0() {
        this.f2209a = new C0790w0(this);
    }
}
