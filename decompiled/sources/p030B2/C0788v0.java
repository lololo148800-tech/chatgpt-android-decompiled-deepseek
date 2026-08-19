package p030B2;

import android.view.View;
import android.view.WindowInsets;
import p979r2.C18862c;

/* JADX INFO: renamed from: B2.v0 */
/* JADX INFO: loaded from: classes.dex */
public final class C0788v0 extends C0786u0 {

    /* JADX INFO: renamed from: q */
    public static final C0794y0 f2202q = C0794y0.m1812g(null, WindowInsets.CONSUMED);

    public C0788v0(C0794y0 c0794y0, WindowInsets windowInsets) {
        super(c0794y0, windowInsets);
    }

    @Override // p030B2.AbstractC0780r0, p030B2.C0790w0
    /* JADX INFO: renamed from: f */
    public C18862c mo1754f(int i10) {
        return C18862c.m20172c(this.f2186c.getInsets(AbstractC0792x0.m1810a(i10)));
    }

    @Override // p030B2.AbstractC0780r0, p030B2.C0790w0
    /* JADX INFO: renamed from: g */
    public C18862c mo1755g(int i10) {
        return C18862c.m20172c(this.f2186c.getInsetsIgnoringVisibility(AbstractC0792x0.m1810a(i10)));
    }

    @Override // p030B2.AbstractC0780r0, p030B2.C0790w0
    /* JADX INFO: renamed from: p */
    public boolean mo1759p(int i10) {
        return this.f2186c.isVisible(AbstractC0792x0.m1810a(i10));
    }

    @Override // p030B2.AbstractC0780r0, p030B2.C0790w0
    /* JADX INFO: renamed from: d */
    public final void mo1753d(View view) {
    }
}
