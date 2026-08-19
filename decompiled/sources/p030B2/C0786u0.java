package p030B2;

import android.view.WindowInsets;
import p979r2.C18862c;

/* JADX INFO: renamed from: B2.u0 */
/* JADX INFO: loaded from: classes.dex */
public class C0786u0 extends C0784t0 {

    /* JADX INFO: renamed from: n */
    public C18862c f2195n;

    /* JADX INFO: renamed from: o */
    public C18862c f2196o;

    /* JADX INFO: renamed from: p */
    public C18862c f2197p;

    public C0786u0(C0794y0 c0794y0, WindowInsets windowInsets) {
        super(c0794y0, windowInsets);
        this.f2195n = null;
        this.f2196o = null;
        this.f2197p = null;
    }

    @Override // p030B2.C0790w0
    /* JADX INFO: renamed from: h */
    public C18862c mo1776h() {
        if (this.f2196o == null) {
            this.f2196o = C18862c.m20172c(this.f2186c.getMandatorySystemGestureInsets());
        }
        return this.f2196o;
    }

    @Override // p030B2.C0790w0
    /* JADX INFO: renamed from: j */
    public C18862c mo1777j() {
        if (this.f2195n == null) {
            this.f2195n = C18862c.m20172c(this.f2186c.getSystemGestureInsets());
        }
        return this.f2195n;
    }

    @Override // p030B2.C0790w0
    /* JADX INFO: renamed from: l */
    public C18862c mo1778l() {
        if (this.f2197p == null) {
            this.f2197p = C18862c.m20172c(this.f2186c.getTappableElementInsets());
        }
        return this.f2197p;
    }

    @Override // p030B2.AbstractC0780r0, p030B2.C0790w0
    /* JADX INFO: renamed from: m */
    public C0794y0 mo1757m(int i10, int i11, int i12, int i13) {
        return C0794y0.m1812g(null, this.f2186c.inset(i10, i11, i12, i13));
    }

    @Override // p030B2.C0782s0, p030B2.C0790w0
    /* JADX INFO: renamed from: s */
    public void mo1772s(C18862c c18862c) {
    }
}
