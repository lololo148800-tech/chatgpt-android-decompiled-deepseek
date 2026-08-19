package p030B2;

import android.graphics.Rect;
import android.os.Build;
import android.view.View;
import android.view.WindowInsets;
import io.sentry.android.core.AbstractC15256t;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import p523V9.AbstractC8178r0;
import p817j$.util.Objects;
import p979r2.C18862c;

/* JADX INFO: renamed from: B2.r0 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0780r0 extends C0790w0 {

    /* JADX INFO: renamed from: h */
    public static boolean f2181h = false;

    /* JADX INFO: renamed from: i */
    public static Method f2182i;

    /* JADX INFO: renamed from: j */
    public static Class f2183j;

    /* JADX INFO: renamed from: k */
    public static Field f2184k;

    /* JADX INFO: renamed from: l */
    public static Field f2185l;

    /* JADX INFO: renamed from: c */
    public final WindowInsets f2186c;

    /* JADX INFO: renamed from: d */
    public C18862c[] f2187d;

    /* JADX INFO: renamed from: e */
    public C18862c f2188e;

    /* JADX INFO: renamed from: f */
    public C0794y0 f2189f;

    /* JADX INFO: renamed from: g */
    public C18862c f2190g;

    public AbstractC0780r0(C0794y0 c0794y0, WindowInsets windowInsets) {
        super(c0794y0);
        this.f2188e = null;
        this.f2186c = windowInsets;
    }

    /* JADX INFO: renamed from: t */
    private C18862c m1749t(int i10, boolean z6) {
        C18862c c18862cM20170a = C18862c.f60085e;
        for (int i11 = 1; i11 <= 256; i11 <<= 1) {
            if ((i10 & i11) != 0) {
                c18862cM20170a = C18862c.m20170a(c18862cM20170a, m1762u(i11, z6));
            }
        }
        return c18862cM20170a;
    }

    /* JADX INFO: renamed from: v */
    private C18862c m1750v() {
        C0794y0 c0794y0 = this.f2189f;
        return c0794y0 != null ? c0794y0.f2209a.mo1770i() : C18862c.f60085e;
    }

    /* JADX INFO: renamed from: w */
    private C18862c m1751w(View view) {
        if (Build.VERSION.SDK_INT >= 30) {
            throw new UnsupportedOperationException("getVisibleInsets() should not be called on API >= 30. Use WindowInsets.isVisible() instead.");
        }
        if (!f2181h) {
            m1752y();
        }
        Method method = f2182i;
        if (method != null && f2183j != null && f2184k != null) {
            try {
                Object objInvoke = method.invoke(view, null);
                if (objInvoke == null) {
                    AbstractC15256t.m16483u("WindowInsetsCompat", "Failed to get visible insets. getViewRootImpl() returned null from the provided view. This means that the view is either not attached or the method has been overridden", new NullPointerException());
                    return null;
                }
                Rect rect = (Rect) f2184k.get(f2185l.get(objInvoke));
                if (rect != null) {
                    return C18862c.m20171b(rect.left, rect.top, rect.right, rect.bottom);
                }
                return null;
            } catch (ReflectiveOperationException e10) {
                AbstractC15256t.m16466d("WindowInsetsCompat", "Failed to get visible insets. (Reflection error). " + e10.getMessage(), e10);
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: y */
    private static void m1752y() {
        try {
            f2182i = View.class.getDeclaredMethod("getViewRootImpl", null);
            Class<?> cls = Class.forName("android.view.View$AttachInfo");
            f2183j = cls;
            f2184k = cls.getDeclaredField("mVisibleInsets");
            f2185l = Class.forName("android.view.ViewRootImpl").getDeclaredField("mAttachInfo");
            f2184k.setAccessible(true);
            f2185l.setAccessible(true);
        } catch (ReflectiveOperationException e10) {
            AbstractC15256t.m16466d("WindowInsetsCompat", "Failed to get visible insets. (Reflection error). " + e10.getMessage(), e10);
        }
        f2181h = true;
    }

    @Override // p030B2.C0790w0
    /* JADX INFO: renamed from: d */
    public void mo1753d(View view) {
        C18862c c18862cM1751w = m1751w(view);
        if (c18862cM1751w == null) {
            c18862cM1751w = C18862c.f60085e;
        }
        m1764z(c18862cM1751w);
    }

    @Override // p030B2.C0790w0
    public boolean equals(Object obj) {
        if (super.equals(obj)) {
            return Objects.equals(this.f2190g, ((AbstractC0780r0) obj).f2190g);
        }
        return false;
    }

    @Override // p030B2.C0790w0
    /* JADX INFO: renamed from: f */
    public C18862c mo1754f(int i10) {
        return m1749t(i10, false);
    }

    @Override // p030B2.C0790w0
    /* JADX INFO: renamed from: g */
    public C18862c mo1755g(int i10) {
        return m1749t(i10, true);
    }

    @Override // p030B2.C0790w0
    /* JADX INFO: renamed from: k */
    public final C18862c mo1756k() {
        if (this.f2188e == null) {
            WindowInsets windowInsets = this.f2186c;
            this.f2188e = C18862c.m20171b(windowInsets.getSystemWindowInsetLeft(), windowInsets.getSystemWindowInsetTop(), windowInsets.getSystemWindowInsetRight(), windowInsets.getSystemWindowInsetBottom());
        }
        return this.f2188e;
    }

    @Override // p030B2.C0790w0
    /* JADX INFO: renamed from: m */
    public C0794y0 mo1757m(int i10, int i11, int i12, int i13) {
        AbstractC0778q0 c0774o0;
        C0794y0 c0794y0M1812g = C0794y0.m1812g(null, this.f2186c);
        int i14 = Build.VERSION.SDK_INT;
        if (i14 >= 30) {
            c0774o0 = new C0776p0(c0794y0M1812g);
        } else {
            c0774o0 = i14 >= 29 ? new C0774o0(c0794y0M1812g) : new C0772n0(c0794y0M1812g);
        }
        c0774o0.mo1716g(C0794y0.m1811e(mo1756k(), i10, i11, i12, i13));
        c0774o0.mo1715e(C0794y0.m1811e(mo1770i(), i10, i11, i12, i13));
        return c0774o0.mo1714b();
    }

    @Override // p030B2.C0790w0
    /* JADX INFO: renamed from: o */
    public boolean mo1758o() {
        return this.f2186c.isRound();
    }

    @Override // p030B2.C0790w0
    /* JADX INFO: renamed from: p */
    public boolean mo1759p(int i10) {
        for (int i11 = 1; i11 <= 256; i11 <<= 1) {
            if ((i10 & i11) != 0 && !m1763x(i11)) {
                return false;
            }
        }
        return true;
    }

    @Override // p030B2.C0790w0
    /* JADX INFO: renamed from: q */
    public void mo1760q(C18862c[] c18862cArr) {
        this.f2187d = c18862cArr;
    }

    @Override // p030B2.C0790w0
    /* JADX INFO: renamed from: r */
    public void mo1761r(C0794y0 c0794y0) {
        this.f2189f = c0794y0;
    }

    /* JADX INFO: renamed from: u */
    public C18862c m1762u(int i10, boolean z6) {
        C18862c c18862cMo1770i;
        int i11;
        if (i10 == 1) {
            return z6 ? C18862c.m20171b(0, Math.max(m1750v().f60087b, mo1756k().f60087b), 0, 0) : C18862c.m20171b(0, mo1756k().f60087b, 0, 0);
        }
        if (i10 == 2) {
            if (z6) {
                C18862c c18862cM1750v = m1750v();
                C18862c c18862cMo1770i2 = mo1770i();
                return C18862c.m20171b(Math.max(c18862cM1750v.f60086a, c18862cMo1770i2.f60086a), 0, Math.max(c18862cM1750v.f60088c, c18862cMo1770i2.f60088c), Math.max(c18862cM1750v.f60089d, c18862cMo1770i2.f60089d));
            }
            C18862c c18862cMo1756k = mo1756k();
            C0794y0 c0794y0 = this.f2189f;
            c18862cMo1770i = c0794y0 != null ? c0794y0.f2209a.mo1770i() : null;
            int iMin = c18862cMo1756k.f60089d;
            if (c18862cMo1770i != null) {
                iMin = Math.min(iMin, c18862cMo1770i.f60089d);
            }
            return C18862c.m20171b(c18862cMo1756k.f60086a, 0, c18862cMo1756k.f60088c, iMin);
        }
        C18862c c18862c = C18862c.f60085e;
        if (i10 == 8) {
            C18862c[] c18862cArr = this.f2187d;
            c18862cMo1770i = c18862cArr != null ? c18862cArr[AbstractC8178r0.m8762c(8)] : null;
            if (c18862cMo1770i != null) {
                return c18862cMo1770i;
            }
            C18862c c18862cMo1756k2 = mo1756k();
            C18862c c18862cM1750v2 = m1750v();
            int i12 = c18862cMo1756k2.f60089d;
            if (i12 > c18862cM1750v2.f60089d) {
                return C18862c.m20171b(0, 0, 0, i12);
            }
            C18862c c18862c2 = this.f2190g;
            return (c18862c2 == null || c18862c2.equals(c18862c) || (i11 = this.f2190g.f60089d) <= c18862cM1750v2.f60089d) ? c18862c : C18862c.m20171b(0, 0, 0, i11);
        }
        if (i10 == 16) {
            return mo1777j();
        }
        if (i10 == 32) {
            return mo1776h();
        }
        if (i10 == 64) {
            return mo1778l();
        }
        if (i10 != 128) {
            return c18862c;
        }
        C0794y0 c0794y1 = this.f2189f;
        C0765k c0765kMo1775e = c0794y1 != null ? c0794y1.f2209a.mo1775e() : mo1775e();
        if (c0765kMo1775e == null) {
            return c18862c;
        }
        int i13 = Build.VERSION.SDK_INT;
        return C18862c.m20171b(i13 >= 28 ? AbstractC0761i.m1676h(c0765kMo1775e.f2160a) : 0, i13 >= 28 ? AbstractC0761i.m1678j(c0765kMo1775e.f2160a) : 0, i13 >= 28 ? AbstractC0761i.m1677i(c0765kMo1775e.f2160a) : 0, i13 >= 28 ? AbstractC0761i.m1675g(c0765kMo1775e.f2160a) : 0);
    }

    /* JADX INFO: renamed from: x */
    public boolean m1763x(int i10) {
        if (i10 != 1 && i10 != 2) {
            if (i10 == 4) {
                return false;
            }
            if (i10 != 8 && i10 != 128) {
                return true;
            }
        }
        return !m1762u(i10, false).equals(C18862c.f60085e);
    }

    /* JADX INFO: renamed from: z */
    public void m1764z(C18862c c18862c) {
        this.f2190g = c18862c;
    }
}
