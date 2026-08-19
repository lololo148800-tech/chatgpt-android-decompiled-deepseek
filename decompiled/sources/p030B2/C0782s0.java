package p030B2;

import android.view.WindowInsets;
import p979r2.C18862c;

/* JADX INFO: renamed from: B2.s0 */
/* JADX INFO: loaded from: classes.dex */
public class C0782s0 extends AbstractC0780r0 {

    /* JADX INFO: renamed from: m */
    public C18862c f2194m;

    public C0782s0(C0794y0 c0794y0, WindowInsets windowInsets) {
        super(c0794y0, windowInsets);
        this.f2194m = null;
    }

    @Override // p030B2.C0790w0
    /* JADX INFO: renamed from: b */
    public C0794y0 mo1768b() {
        return C0794y0.m1812g(null, this.f2186c.consumeStableInsets());
    }

    @Override // p030B2.C0790w0
    /* JADX INFO: renamed from: c */
    public C0794y0 mo1769c() {
        return C0794y0.m1812g(null, this.f2186c.consumeSystemWindowInsets());
    }

    @Override // p030B2.C0790w0
    /* JADX INFO: renamed from: i */
    public final C18862c mo1770i() {
        if (this.f2194m == null) {
            WindowInsets windowInsets = this.f2186c;
            this.f2194m = C18862c.m20171b(windowInsets.getStableInsetLeft(), windowInsets.getStableInsetTop(), windowInsets.getStableInsetRight(), windowInsets.getStableInsetBottom());
        }
        return this.f2194m;
    }

    @Override // p030B2.C0790w0
    /* JADX INFO: renamed from: n */
    public boolean mo1771n() {
        return this.f2186c.isConsumed();
    }

    @Override // p030B2.C0790w0
    /* JADX INFO: renamed from: s */
    public void mo1772s(C18862c c18862c) {
        this.f2194m = c18862c;
    }
}
