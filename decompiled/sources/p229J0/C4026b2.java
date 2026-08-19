package p229J0;

import android.content.Context;
import android.os.Build;
import android.view.Window;
import p003A1.AbstractC0231b;
import p003A1.C0178J0;
import p049Bm.InterfaceC1426a;
import p049Bm.InterfaceC1439n;
import p053C.AbstractC1466a;
import p153Fn.C2925c;
import p349O0.C5975S;
import p349O0.C5997d;
import p349O0.C6002f0;
import p349O0.C6018n0;
import p349O0.C6021p;
import p587Y1.InterfaceC9589o;
import p758g0.C13756d;

/* JADX INFO: renamed from: J0.b2 */
/* JADX INFO: loaded from: classes.dex */
public final class C4026b2 extends AbstractC0231b implements InterfaceC9589o {

    /* JADX INFO: renamed from: A0 */
    public final C2925c f12650A0;

    /* JADX INFO: renamed from: B0 */
    public final C6002f0 f12651B0;

    /* JADX INFO: renamed from: C0 */
    public Object f12652C0;

    /* JADX INFO: renamed from: D0 */
    public boolean f12653D0;

    /* JADX INFO: renamed from: w0 */
    public final Window f12654w0;

    /* JADX INFO: renamed from: x0 */
    public final boolean f12655x0;

    /* JADX INFO: renamed from: y0 */
    public final InterfaceC1426a f12656y0;

    /* JADX INFO: renamed from: z0 */
    public final C13756d f12657z0;

    public C4026b2(Context context, Window window, boolean z6, InterfaceC1426a interfaceC1426a, C13756d c13756d, C2925c c2925c) {
        super(context);
        this.f12654w0 = window;
        this.f12655x0 = z6;
        this.f12656y0 = interfaceC1426a;
        this.f12657z0 = c13756d;
        this.f12650A0 = c2925c;
        this.f12651B0 = C5997d.m6430Q(AbstractC3998W0.f12547a, C5975S.f19448r0);
    }

    @Override // p587Y1.InterfaceC9589o
    /* JADX INFO: renamed from: a */
    public final Window mo4721a() {
        return this.f12654w0;
    }

    @Override // p003A1.AbstractC0231b
    /* JADX INFO: renamed from: b */
    public final void mo564b(int i10, C6021p c6021p) {
        int i11;
        c6021p.m6526U(576708319);
        if ((i10 & 6) == 0) {
            i11 = (c6021p.m6545h(this) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i11 & 3) == 2 && c6021p.m6562y()) {
            c6021p.m6517L();
        } else {
            ((InterfaceC1439n) this.f12651B0.getValue()).invoke(c6021p, 0);
        }
        C6018n0 c6018n0M6555r = c6021p.m6555r();
        if (c6018n0M6555r != null) {
            c6018n0M6555r.f19536d = new C0178J0(this, i10, 7);
        }
    }

    @Override // p003A1.AbstractC0231b
    public final boolean getShouldCreateCompositionOnAttachedToWindow() {
        return this.f12653D0;
    }

    @Override // p003A1.AbstractC0231b, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        int i10;
        super.onAttachedToWindow();
        if (!this.f12655x0 || (i10 = Build.VERSION.SDK_INT) < 33) {
            return;
        }
        if (this.f12652C0 == null) {
            InterfaceC1426a interfaceC1426a = this.f12656y0;
            this.f12652C0 = i10 >= 34 ? AbstractC1466a.m2095o(AbstractC4020a2.m4720a(interfaceC1426a, this.f12657z0, this.f12650A0)) : AbstractC3994V1.m4708a(interfaceC1426a);
        }
        AbstractC3994V1.m4709b(this, this.f12652C0);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (Build.VERSION.SDK_INT >= 33) {
            AbstractC3994V1.m4710c(this, this.f12652C0);
        }
        this.f12652C0 = null;
    }
}
