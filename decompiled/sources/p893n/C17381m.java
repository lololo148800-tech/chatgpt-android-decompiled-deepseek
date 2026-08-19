package p893n;

import android.view.View;
import android.view.ViewGroup;
import android.widget.PopupWindow;
import java.util.WeakHashMap;
import p030B2.AbstractC0728I;
import p030B2.AbstractC0738T;
import p523V9.AbstractC8162p0;
import p658b5.C11234e;

/* JADX INFO: renamed from: n.m */
/* JADX INFO: loaded from: classes.dex */
public final class C17381m extends AbstractC8162p0 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f55495a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f55496b;

    public /* synthetic */ C17381m(Object obj, int i10) {
        this.f55495a = i10;
        this.f55496b = obj;
    }

    @Override // p523V9.AbstractC8162p0, p030B2.InterfaceC0752d0
    /* JADX INFO: renamed from: b */
    public void mo1608b() {
        Object obj = this.f55496b;
        switch (this.f55495a) {
            case 0:
                ((RunnableC17380l) obj).f55494Z.f55533H0.setVisibility(0);
                break;
            case 1:
                LayoutInflaterFactory2C17390v layoutInflaterFactory2C17390v = (LayoutInflaterFactory2C17390v) obj;
                layoutInflaterFactory2C17390v.f55533H0.setVisibility(0);
                if (layoutInflaterFactory2C17390v.f55533H0.getParent() instanceof View) {
                    View view = (View) layoutInflaterFactory2C17390v.f55533H0.getParent();
                    WeakHashMap weakHashMap = AbstractC0738T.f2096a;
                    AbstractC0728I.m1543c(view);
                }
                break;
        }
    }

    @Override // p030B2.InterfaceC0752d0
    /* JADX INFO: renamed from: c */
    public final void mo1609c() {
        Object obj = this.f55496b;
        switch (this.f55495a) {
            case 0:
                RunnableC17380l runnableC17380l = (RunnableC17380l) obj;
                runnableC17380l.f55494Z.f55533H0.setAlpha(1.0f);
                LayoutInflaterFactory2C17390v layoutInflaterFactory2C17390v = runnableC17380l.f55494Z;
                layoutInflaterFactory2C17390v.f55536K0.m1602d(null);
                layoutInflaterFactory2C17390v.f55536K0 = null;
                break;
            case 1:
                LayoutInflaterFactory2C17390v layoutInflaterFactory2C17390v2 = (LayoutInflaterFactory2C17390v) obj;
                layoutInflaterFactory2C17390v2.f55533H0.setAlpha(1.0f);
                layoutInflaterFactory2C17390v2.f55536K0.m1602d(null);
                layoutInflaterFactory2C17390v2.f55536K0 = null;
                break;
            default:
                C11234e c11234e = (C11234e) obj;
                ((LayoutInflaterFactory2C17390v) c11234e.f34002o0).f55533H0.setVisibility(8);
                LayoutInflaterFactory2C17390v layoutInflaterFactory2C17390v3 = (LayoutInflaterFactory2C17390v) c11234e.f34002o0;
                PopupWindow popupWindow = layoutInflaterFactory2C17390v3.f55534I0;
                if (popupWindow != null) {
                    popupWindow.dismiss();
                } else if (layoutInflaterFactory2C17390v3.f55533H0.getParent() instanceof View) {
                    View view = (View) layoutInflaterFactory2C17390v3.f55533H0.getParent();
                    WeakHashMap weakHashMap = AbstractC0738T.f2096a;
                    AbstractC0728I.m1543c(view);
                }
                layoutInflaterFactory2C17390v3.f55533H0.m11137e();
                layoutInflaterFactory2C17390v3.f55536K0.m1602d(null);
                layoutInflaterFactory2C17390v3.f55536K0 = null;
                ViewGroup viewGroup = layoutInflaterFactory2C17390v3.f55538M0;
                WeakHashMap weakHashMap2 = AbstractC0738T.f2096a;
                AbstractC0728I.m1543c(viewGroup);
                break;
        }
    }
}
