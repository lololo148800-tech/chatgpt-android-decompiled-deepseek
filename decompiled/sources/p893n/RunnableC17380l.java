package p893n;

import android.view.ViewGroup;
import p030B2.AbstractC0738T;
import p030B2.C0750c0;

/* JADX INFO: renamed from: n.l */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC17380l implements Runnable {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f55493Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ LayoutInflaterFactory2C17390v f55494Z;

    public /* synthetic */ RunnableC17380l(LayoutInflaterFactory2C17390v layoutInflaterFactory2C17390v, int i10) {
        this.f55493Y = i10;
        this.f55494Z = layoutInflaterFactory2C17390v;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ViewGroup viewGroup;
        switch (this.f55493Y) {
            case 0:
                LayoutInflaterFactory2C17390v layoutInflaterFactory2C17390v = this.f55494Z;
                if ((layoutInflaterFactory2C17390v.f55563l1 & 1) != 0) {
                    layoutInflaterFactory2C17390v.m19104x(0);
                }
                if ((layoutInflaterFactory2C17390v.f55563l1 & 4096) != 0) {
                    layoutInflaterFactory2C17390v.m19104x(108);
                }
                layoutInflaterFactory2C17390v.f55562k1 = false;
                layoutInflaterFactory2C17390v.f55563l1 = 0;
                break;
            default:
                LayoutInflaterFactory2C17390v layoutInflaterFactory2C17390v2 = this.f55494Z;
                layoutInflaterFactory2C17390v2.f55534I0.showAtLocation(layoutInflaterFactory2C17390v2.f55533H0, 55, 0, 0);
                C0750c0 c0750c0 = layoutInflaterFactory2C17390v2.f55536K0;
                if (c0750c0 != null) {
                    c0750c0.m1600b();
                }
                if (!(layoutInflaterFactory2C17390v2.f55537L0 && (viewGroup = layoutInflaterFactory2C17390v2.f55538M0) != null && viewGroup.isLaidOut())) {
                    layoutInflaterFactory2C17390v2.f55533H0.setAlpha(1.0f);
                    layoutInflaterFactory2C17390v2.f55533H0.setVisibility(0);
                } else {
                    layoutInflaterFactory2C17390v2.f55533H0.setAlpha(0.0f);
                    C0750c0 c0750c0M1573a = AbstractC0738T.m1573a(layoutInflaterFactory2C17390v2.f55533H0);
                    c0750c0M1573a.m1599a(1.0f);
                    layoutInflaterFactory2C17390v2.f55536K0 = c0750c0M1573a;
                    c0750c0M1573a.m1602d(new C17381m(this, 0));
                }
                break;
        }
    }
}
