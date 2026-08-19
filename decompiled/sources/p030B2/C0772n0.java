package p030B2;

import android.graphics.Rect;
import android.util.Log;
import android.view.WindowInsets;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import p979r2.C18862c;

/* JADX INFO: renamed from: B2.n0 */
/* JADX INFO: loaded from: classes.dex */
public final class C0772n0 extends AbstractC0778q0 {

    /* JADX INFO: renamed from: e */
    public static Field f2167e = null;

    /* JADX INFO: renamed from: f */
    public static boolean f2168f = false;

    /* JADX INFO: renamed from: g */
    public static Constructor f2169g = null;

    /* JADX INFO: renamed from: h */
    public static boolean f2170h = false;

    /* JADX INFO: renamed from: c */
    public WindowInsets f2171c;

    /* JADX INFO: renamed from: d */
    public C18862c f2172d;

    public C0772n0() {
        this.f2171c = m1713i();
    }

    /* JADX INFO: renamed from: i */
    private static WindowInsets m1713i() {
        if (!f2168f) {
            try {
                f2167e = WindowInsets.class.getDeclaredField("CONSUMED");
            } catch (ReflectiveOperationException e10) {
                Log.i("WindowInsetsCompat", "Could not retrieve WindowInsets.CONSUMED field", e10);
            }
            f2168f = true;
        }
        Field field = f2167e;
        if (field != null) {
            try {
                WindowInsets windowInsets = (WindowInsets) field.get(null);
                if (windowInsets != null) {
                    return new WindowInsets(windowInsets);
                }
            } catch (ReflectiveOperationException e11) {
                Log.i("WindowInsetsCompat", "Could not get value from WindowInsets.CONSUMED field", e11);
            }
        }
        if (!f2170h) {
            try {
                f2169g = WindowInsets.class.getConstructor(Rect.class);
            } catch (ReflectiveOperationException e12) {
                Log.i("WindowInsetsCompat", "Could not retrieve WindowInsets(Rect) constructor", e12);
            }
            f2170h = true;
        }
        Constructor constructor = f2169g;
        if (constructor != null) {
            try {
                return (WindowInsets) constructor.newInstance(new Rect());
            } catch (ReflectiveOperationException e13) {
                Log.i("WindowInsetsCompat", "Could not invoke WindowInsets(Rect) constructor", e13);
            }
        }
        return null;
    }

    @Override // p030B2.AbstractC0778q0
    /* JADX INFO: renamed from: b */
    public C0794y0 mo1714b() {
        m1747a();
        C0794y0 c0794y0M1812g = C0794y0.m1812g(null, this.f2171c);
        C18862c[] c18862cArr = this.f2180b;
        C0790w0 c0790w0 = c0794y0M1812g.f2209a;
        c0790w0.mo1760q(c18862cArr);
        c0790w0.mo1772s(this.f2172d);
        return c0794y0M1812g;
    }

    @Override // p030B2.AbstractC0778q0
    /* JADX INFO: renamed from: e */
    public void mo1715e(C18862c c18862c) {
        this.f2172d = c18862c;
    }

    @Override // p030B2.AbstractC0778q0
    /* JADX INFO: renamed from: g */
    public void mo1716g(C18862c c18862c) {
        WindowInsets windowInsets = this.f2171c;
        if (windowInsets != null) {
            this.f2171c = windowInsets.replaceSystemWindowInsets(c18862c.f60086a, c18862c.f60087b, c18862c.f60088c, c18862c.f60089d);
        }
    }

    public C0772n0(C0794y0 c0794y0) {
        super(c0794y0);
        this.f2171c = c0794y0.m1817f();
    }
}
