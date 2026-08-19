package p523V9;

import android.content.Context;
import android.os.Build;
import android.view.View;
import android.view.ViewParent;
import java.util.WeakHashMap;
import java.util.concurrent.Executor;
import p030B2.AbstractC0730K;
import p030B2.AbstractC0738T;
import p030B2.AbstractC0767l;
import p140Fa.C2684d;
import p140Fa.C2686f;
import p140Fa.C2687g;
import p140Fa.C2689i;
import p501Ub.C7604f;
import p594Y9.AbstractC9799R4;
import p748fc.C13609a;
import p748fc.C13610b;
import p748fc.C13614f;
import p768gc.C13836a;
import va.C20509a;

/* JADX INFO: renamed from: V9.n5 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC8151n5 {
    /* JADX INFO: renamed from: a */
    public static AbstractC8143m5 m8693a(int i10) {
        if (i10 != 0) {
            return i10 != 1 ? new C2689i() : new C2684d();
        }
        return new C2689i();
    }

    /* JADX INFO: renamed from: b */
    public static C13609a m8694b(C13836a c13836a) {
        C13614f c13614f = (C13614f) C7604f.m7950c().m7951a(C13614f.class);
        c13614f.getClass();
        C13610b c13610b = (C13610b) c13614f.f43003a.m4539y(c13836a);
        c13836a.getClass();
        return new C13609a(c13610b, (Executor) c13614f.f43004b.f24036a.get(), AbstractC9799R4.m10422d(c13836a.m15475b()), c13836a);
    }

    /* JADX INFO: renamed from: c */
    public static boolean m8695c(Context context) {
        if (Build.VERSION.SDK_INT >= 24) {
            return AbstractC0767l.m1710e(context);
        }
        return true;
    }

    /* JADX INFO: renamed from: d */
    public static void m8696d(View view, C2687g c2687g) {
        C20509a c20509a = c2687g.f8246Y.f8221b;
        if (c20509a == null || !c20509a.f65115a) {
            return;
        }
        float fM1548e = 0.0f;
        for (ViewParent parent = view.getParent(); parent instanceof View; parent = parent.getParent()) {
            WeakHashMap weakHashMap = AbstractC0738T.f2096a;
            fM1548e += AbstractC0730K.m1548e((View) parent);
        }
        C2686f c2686f = c2687g.f8246Y;
        if (c2686f.f8231l != fM1548e) {
            c2686f.f8231l = fM1548e;
            c2687g.m3687q();
        }
    }
}
