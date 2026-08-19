package p030B2;

import android.view.WindowInsets;
import p003A1.AbstractC0209U;
import p843k1.AbstractC16312f;
import p979r2.C18862c;

/* JADX INFO: renamed from: B2.o0 */
/* JADX INFO: loaded from: classes.dex */
public class C0774o0 extends AbstractC0778q0 {

    /* JADX INFO: renamed from: c */
    public final WindowInsets.Builder f2173c;

    public C0774o0() {
        this.f2173c = AbstractC16312f.m17888h();
    }

    @Override // p030B2.AbstractC0778q0
    /* JADX INFO: renamed from: b */
    public C0794y0 mo1714b() {
        m1747a();
        C0794y0 c0794y0M1812g = C0794y0.m1812g(null, this.f2173c.build());
        c0794y0M1812g.f2209a.mo1760q(this.f2180b);
        return c0794y0M1812g;
    }

    @Override // p030B2.AbstractC0778q0
    /* JADX INFO: renamed from: d */
    public void mo1730d(C18862c c18862c) {
        this.f2173c.setMandatorySystemGestureInsets(c18862c.m20173d());
    }

    @Override // p030B2.AbstractC0778q0
    /* JADX INFO: renamed from: e */
    public void mo1715e(C18862c c18862c) {
        this.f2173c.setStableInsets(c18862c.m20173d());
    }

    @Override // p030B2.AbstractC0778q0
    /* JADX INFO: renamed from: f */
    public void mo1731f(C18862c c18862c) {
        this.f2173c.setSystemGestureInsets(c18862c.m20173d());
    }

    @Override // p030B2.AbstractC0778q0
    /* JADX INFO: renamed from: g */
    public void mo1716g(C18862c c18862c) {
        this.f2173c.setSystemWindowInsets(c18862c.m20173d());
    }

    @Override // p030B2.AbstractC0778q0
    /* JADX INFO: renamed from: h */
    public void mo1732h(C18862c c18862c) {
        this.f2173c.setTappableElementInsets(c18862c.m20173d());
    }

    public C0774o0(C0794y0 c0794y0) {
        WindowInsets.Builder builderM17888h;
        super(c0794y0);
        WindowInsets windowInsetsM1817f = c0794y0.m1817f();
        if (windowInsetsM1817f != null) {
            builderM17888h = AbstractC0209U.m661e(windowInsetsM1817f);
        } else {
            builderM17888h = AbstractC16312f.m17888h();
        }
        this.f2173c = builderM17888h;
    }
}
