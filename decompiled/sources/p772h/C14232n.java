package p772h;

import android.os.Build;
import android.view.View;
import android.view.Window;
import kotlin.jvm.internal.AbstractC16544l;
import p030B2.C0717A0;
import p030B2.C0721C0;
import p030B2.C0723D0;
import p030B2.C0795z;
import p030B2.C0796z0;
import p523V9.AbstractC8170q0;
import p523V9.AbstractC8186s0;
import p544W9.AbstractC8736x;

/* JADX INFO: renamed from: h.n */
/* JADX INFO: loaded from: classes.dex */
public class C14232n extends AbstractC8736x {
    @Override // p544W9.AbstractC8736x
    /* JADX INFO: renamed from: c */
    public void mo9471c(C14218I statusBarStyle, C14218I navigationBarStyle, Window window, View view, boolean z6, boolean z10) {
        AbstractC8186s0 c0717a0;
        AbstractC16544l.m18094g(statusBarStyle, "statusBarStyle");
        AbstractC16544l.m18094g(navigationBarStyle, "navigationBarStyle");
        AbstractC16544l.m18094g(window, "window");
        AbstractC16544l.m18094g(view, "view");
        AbstractC8170q0.m8754c(window, false);
        window.setStatusBarColor(z6 ? statusBarStyle.f44653b : statusBarStyle.f44652a);
        window.setNavigationBarColor(z10 ? navigationBarStyle.f44653b : navigationBarStyle.f44652a);
        if (Build.VERSION.SDK_INT >= 30) {
            new C0795z(view, 3).f2210o0 = view;
        }
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 35) {
            c0717a0 = new C0723D0(window);
        } else if (i10 >= 30) {
            c0717a0 = new C0721C0(window);
        } else {
            c0717a0 = i10 >= 26 ? new C0717A0(window) : new C0796z0(window);
        }
        c0717a0.mo1532c(!z6);
        c0717a0.mo1489b(!z10);
    }
}
