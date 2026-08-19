package p893n;

import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.app.AppLocalesMetadataHolderService;
import java.lang.ref.WeakReference;
import p032B4.RunnableC0811f;
import p1072w2.C20793e;
import p277L.ExecutorC4828a;
import p501Ub.ExecutorC7613o;
import p692d0.C12962a;
import p692d0.C12967f;
import p896n2.AbstractC17452e;

/* JADX INFO: renamed from: n.k */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC17379k {

    /* JADX INFO: renamed from: Y */
    public static final ExecutorC7613o f55484Y = new ExecutorC7613o(new ExecutorC4828a(3));

    /* JADX INFO: renamed from: Z */
    public static int f55485Z = -100;

    /* JADX INFO: renamed from: o0 */
    public static C20793e f55486o0 = null;

    /* JADX INFO: renamed from: p0 */
    public static C20793e f55487p0 = null;

    /* JADX INFO: renamed from: q0 */
    public static Boolean f55488q0 = null;

    /* JADX INFO: renamed from: r0 */
    public static boolean f55489r0 = false;

    /* JADX INFO: renamed from: s0 */
    public static final C12967f f55490s0 = new C12967f(0);

    /* JADX INFO: renamed from: t0 */
    public static final Object f55491t0 = new Object();

    /* JADX INFO: renamed from: u0 */
    public static final Object f55492u0 = new Object();

    /* JADX INFO: renamed from: a */
    public static void m19059a() {
        C20793e c20793e;
        C12967f c12967f = f55490s0;
        c12967f.getClass();
        C12962a c12962a = new C12962a(c12967f);
        while (c12962a.hasNext()) {
            AbstractC17379k abstractC17379k = (AbstractC17379k) ((WeakReference) c12962a.next()).get();
            if (abstractC17379k != null) {
                LayoutInflaterFactory2C17390v layoutInflaterFactory2C17390v = (LayoutInflaterFactory2C17390v) abstractC17379k;
                Context context = layoutInflaterFactory2C17390v.f55572w0;
                if (m19061d(context) && (c20793e = f55486o0) != null && !c20793e.equals(f55487p0)) {
                    f55484Y.execute(new RunnableC0811f(context, 3));
                }
                layoutInflaterFactory2C17390v.m19098o(true, true);
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public static Object m19060b() {
        Context context;
        C12967f c12967f = f55490s0;
        c12967f.getClass();
        C12962a c12962a = new C12962a(c12967f);
        while (c12962a.hasNext()) {
            AbstractC17379k abstractC17379k = (AbstractC17379k) ((WeakReference) c12962a.next()).get();
            if (abstractC17379k != null && (context = ((LayoutInflaterFactory2C17390v) abstractC17379k).f55572w0) != null) {
                return context.getSystemService("locale");
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: d */
    public static boolean m19061d(Context context) {
        if (f55488q0 == null) {
            try {
                int i10 = AppLocalesMetadataHolderService.f32077Y;
                Bundle bundle = context.getPackageManager().getServiceInfo(new ComponentName(context, (Class<?>) AppLocalesMetadataHolderService.class), Build.VERSION.SDK_INT >= 24 ? AbstractC17394z.m19107a() | 128 : 640).metaData;
                if (bundle != null) {
                    f55488q0 = Boolean.valueOf(bundle.getBoolean("autoStoreLocales"));
                }
            } catch (PackageManager.NameNotFoundException unused) {
                Log.d("AppCompatDelegate", "Checking for metadata for AppLocalesMetadataHolderService : Service not found");
                f55488q0 = Boolean.FALSE;
            }
        }
        return f55488q0.booleanValue();
    }

    /* JADX INFO: renamed from: g */
    public static void m19062g(LayoutInflaterFactory2C17390v layoutInflaterFactory2C17390v) {
        synchronized (f55491t0) {
            try {
                C12967f c12967f = f55490s0;
                c12967f.getClass();
                C12962a c12962a = new C12962a(c12967f);
                while (c12962a.hasNext()) {
                    AbstractC17379k abstractC17379k = (AbstractC17379k) ((WeakReference) c12962a.next()).get();
                    if (abstractC17379k == layoutInflaterFactory2C17390v || abstractC17379k == null) {
                        c12962a.remove();
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX INFO: renamed from: l */
    public static void m19063l(int i10) {
        if (i10 != -1 && i10 != 0 && i10 != 1 && i10 != 2 && i10 != 3) {
            Log.d("AppCompatDelegate", "setDefaultNightMode() called with an unknown mode");
            return;
        }
        if (f55485Z != i10) {
            f55485Z = i10;
            synchronized (f55491t0) {
                try {
                    C12967f c12967f = f55490s0;
                    c12967f.getClass();
                    C12962a c12962a = new C12962a(c12967f);
                    while (c12962a.hasNext()) {
                        AbstractC17379k abstractC17379k = (AbstractC17379k) ((WeakReference) c12962a.next()).get();
                        if (abstractC17379k != null) {
                            ((LayoutInflaterFactory2C17390v) abstractC17379k).m19098o(true, true);
                        }
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    /* JADX INFO: renamed from: n */
    public static void m19064n(Context context) {
        if (m19061d(context)) {
            if (Build.VERSION.SDK_INT >= 33) {
                if (f55489r0) {
                    return;
                }
                f55484Y.execute(new RunnableC0811f(context, 2));
                return;
            }
            synchronized (f55492u0) {
                try {
                    C20793e c20793e = f55486o0;
                    if (c20793e == null) {
                        if (f55487p0 == null) {
                            f55487p0 = C20793e.m21310b(AbstractC17452e.m19131e(context));
                        }
                        if (f55487p0.f66056a.isEmpty()) {
                        } else {
                            f55486o0 = f55487p0;
                        }
                    } else if (!c20793e.equals(f55487p0)) {
                        C20793e c20793e2 = f55486o0;
                        f55487p0 = c20793e2;
                        AbstractC17452e.m19130d(context, c20793e2.f66056a.mo21311a());
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    /* JADX INFO: renamed from: c */
    public abstract void mo19065c();

    /* JADX INFO: renamed from: e */
    public abstract void mo19066e();

    /* JADX INFO: renamed from: f */
    public abstract void mo19067f();

    /* JADX INFO: renamed from: h */
    public abstract boolean mo19068h(int i10);

    /* JADX INFO: renamed from: i */
    public abstract void mo19069i(int i10);

    /* JADX INFO: renamed from: j */
    public abstract void mo19070j(View view);

    /* JADX INFO: renamed from: k */
    public abstract void mo19071k(View view, ViewGroup.LayoutParams layoutParams);

    /* JADX INFO: renamed from: m */
    public abstract void mo19072m(CharSequence charSequence);
}
