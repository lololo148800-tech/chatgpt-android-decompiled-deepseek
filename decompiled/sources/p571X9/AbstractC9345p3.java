package p571X9;

import android.graphics.Color;
import android.os.Build;
import android.view.View;
import android.view.Window;
import kotlin.jvm.internal.AbstractC16544l;
import p030B2.C0717A0;
import p030B2.C0721C0;
import p030B2.C0723D0;
import p030B2.C0795z;
import p030B2.C0796z0;
import p523V9.AbstractC8186s0;
import p769gj.C14183y;
import p908nk.C17645a;
import p908nk.C17646b;
import p979r2.AbstractC18861b;

/* JADX INFO: renamed from: X9.p3 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC9345p3 {
    /* JADX INFO: renamed from: a */
    public static final void m9937a(C14183y c14183y, int i10) {
        AbstractC8186s0 c0717a0;
        AbstractC16544l.m18094g(c14183y, "<this>");
        Object obj = c14183y.f44578a.get(C17646b.f56435b);
        C17645a c17645a = obj instanceof C17645a ? (C17645a) obj : null;
        if (c17645a != null) {
            int iRgb = Color.rgb(Color.red(i10), Color.green(i10), Color.blue(i10));
            double dM20165c = AbstractC18861b.m20165c(-1, iRgb);
            double dM20165c2 = AbstractC18861b.m20165c(-16777216, iRgb);
            Window window = c17645a.f56432a;
            View decorView = window.getDecorView();
            if (Build.VERSION.SDK_INT >= 30) {
                new C0795z(decorView, 3).f2210o0 = decorView;
            }
            int i11 = Build.VERSION.SDK_INT;
            if (i11 >= 35) {
                c0717a0 = new C0723D0(window);
            } else if (i11 >= 30) {
                c0717a0 = new C0721C0(window);
            } else {
                c0717a0 = i11 >= 26 ? new C0717A0(window) : new C0796z0(window);
            }
            if (c17645a.f56433b) {
                c0717a0.mo1489b(dM20165c < dM20165c2);
            }
            if (c17645a.f56434c) {
                c0717a0.mo1532c(dM20165c < dM20165c2);
            }
        }
    }
}
