package p843k1;

import android.graphics.Canvas;
import android.graphics.Outline;
import android.view.View;
import fo.C13711h;
import kotlin.jvm.internal.AbstractC16546n;
import p003A1.C0164E1;
import p492U1.EnumC7546k;
import p492U1.InterfaceC7537b;
import p523V9.AbstractC8112i6;
import p774h1.C14347c;
import p774h1.C14363s;
import p774h1.InterfaceC14362r;
import p821j1.AbstractC16038c;
import p821j1.C16037b;
import p861l1.AbstractC16800a;

/* JADX INFO: renamed from: k1.p */
/* JADX INFO: loaded from: classes.dex */
public final class C16322p extends View {

    /* JADX INFO: renamed from: y0 */
    public static final C0164E1 f50625y0 = new C0164E1(4);

    /* JADX INFO: renamed from: o0 */
    public final AbstractC16800a f50626o0;

    /* JADX INFO: renamed from: p0 */
    public final C14363s f50627p0;

    /* JADX INFO: renamed from: q0 */
    public final C16037b f50628q0;

    /* JADX INFO: renamed from: r0 */
    public boolean f50629r0;

    /* JADX INFO: renamed from: s0 */
    public Outline f50630s0;

    /* JADX INFO: renamed from: t0 */
    public boolean f50631t0;

    /* JADX INFO: renamed from: u0 */
    public InterfaceC7537b f50632u0;

    /* JADX INFO: renamed from: v0 */
    public EnumC7546k f50633v0;

    /* JADX INFO: renamed from: w0 */
    public AbstractC16546n f50634w0;

    /* JADX INFO: renamed from: x0 */
    public C16308b f50635x0;

    public C16322p(AbstractC16800a abstractC16800a, C14363s c14363s, C16037b c16037b) {
        super(abstractC16800a.getContext());
        this.f50626o0 = abstractC16800a;
        this.f50627p0 = c14363s;
        this.f50628q0 = c16037b;
        setOutlineProvider(f50625y0);
        this.f50631t0 = true;
        this.f50632u0 = AbstractC16038c.f49482a;
        this.f50633v0 = EnumC7546k.f23904Y;
        InterfaceC16310d.f50543a.getClass();
        this.f50634w0 = C16307a.f50517o0;
        setWillNotDraw(false);
        setClipBounds(null);
    }

    /* JADX WARN: Type inference failed for: r9v0, types: [Bm.k, kotlin.jvm.internal.n] */
    @Override // android.view.View
    public final void dispatchDraw(Canvas canvas) {
        C14363s c14363s = this.f50627p0;
        C14347c c14347c = c14363s.f45050a;
        Canvas canvas2 = c14347c.f45028a;
        c14347c.f45028a = canvas;
        InterfaceC7537b interfaceC7537b = this.f50632u0;
        EnumC7546k enumC7546k = this.f50633v0;
        long jM8603a = AbstractC8112i6.m8603a(getWidth(), getHeight());
        C16308b c16308b = this.f50635x0;
        ?? r10 = this.f50634w0;
        C16037b c16037b = this.f50628q0;
        InterfaceC7537b interfaceC7537bM15197n = c16037b.f49479Z.m15197n();
        C13711h c13711h = c16037b.f49479Z;
        EnumC7546k enumC7546kM15201w = c13711h.m15201w();
        InterfaceC14362r interfaceC14362rM15196m = c13711h.m15196m();
        long jM15202x = c13711h.m15202x();
        C16308b c16308b2 = (C16308b) c13711h.f43260o0;
        c13711h.m15186I(interfaceC7537b);
        c13711h.m15188K(enumC7546k);
        c13711h.m15185H(c14347c);
        c13711h.m15189L(jM8603a);
        c13711h.f43260o0 = c16308b;
        c14347c.mo15706e();
        try {
            r10.invoke(c16037b);
            c14347c.mo15719r();
            c13711h.m15186I(interfaceC7537bM15197n);
            c13711h.m15188K(enumC7546kM15201w);
            c13711h.m15185H(interfaceC14362rM15196m);
            c13711h.m15189L(jM15202x);
            c13711h.f43260o0 = c16308b2;
            c14363s.f45050a.f45028a = canvas2;
            this.f50629r0 = false;
        } catch (Throwable th2) {
            c14347c.mo15719r();
            c13711h.m15186I(interfaceC7537bM15197n);
            c13711h.m15188K(enumC7546kM15201w);
            c13711h.m15185H(interfaceC14362rM15196m);
            c13711h.m15189L(jM15202x);
            c13711h.f43260o0 = c16308b2;
            throw th2;
        }
    }

    public final boolean getCanUseCompositingLayer$ui_graphics_release() {
        return this.f50631t0;
    }

    public final C14363s getCanvasHolder() {
        return this.f50627p0;
    }

    public final View getOwnerView() {
        return this.f50626o0;
    }

    @Override // android.view.View
    public final boolean hasOverlappingRendering() {
        return this.f50631t0;
    }

    @Override // android.view.View
    public final void invalidate() {
        if (this.f50629r0) {
            return;
        }
        this.f50629r0 = true;
        super.invalidate();
    }

    public final void setCanUseCompositingLayer$ui_graphics_release(boolean z6) {
        if (this.f50631t0 != z6) {
            this.f50631t0 = z6;
            invalidate();
        }
    }

    public final void setInvalidated(boolean z6) {
        this.f50629r0 = z6;
    }

    @Override // android.view.View
    public final void forceLayout() {
    }

    @Override // android.view.View
    public final void onLayout(boolean z6, int i10, int i11, int i12, int i13) {
    }
}
