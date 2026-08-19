package p715e1;

import kotlin.jvm.internal.AbstractC16544l;
import p049Bm.InterfaceC1436k;
import p1140z1.AbstractC21690f;
import p1140z1.C21660F;
import p1140z1.InterfaceC21681a0;
import p1140z1.InterfaceC21708o;
import p437Rn.C6949g;
import p492U1.EnumC7546k;
import p492U1.InterfaceC7537b;
import p523V9.AbstractC8111i5;
import p547Wc.C8816z;
import p571X9.AbstractC9113C4;
import p635a1.AbstractC10458p;

/* JADX INFO: renamed from: e1.b */
/* JADX INFO: loaded from: classes.dex */
public final class C13256b extends AbstractC10458p implements InterfaceC21681a0, InterfaceC13255a, InterfaceC21708o {

    /* JADX INFO: renamed from: A0 */
    public boolean f41869A0;

    /* JADX INFO: renamed from: B0 */
    public C13263i f41870B0;

    /* JADX INFO: renamed from: C0 */
    public InterfaceC1436k f41871C0;

    /* JADX INFO: renamed from: z0 */
    public final C13257c f41872z0;

    public C13256b(C13257c c13257c, InterfaceC1436k interfaceC1436k) {
        this.f41872z0 = c13257c;
        this.f41871C0 = interfaceC1436k;
        c13257c.f41873Y = this;
        new C6949g(this, 29);
    }

    @Override // p635a1.AbstractC10458p
    /* JADX INFO: renamed from: D0 */
    public final void mo4226D0() {
        C13263i c13263i = this.f41870B0;
        if (c13263i != null) {
            c13263i.m14861c();
        }
    }

    /* JADX INFO: renamed from: K0 */
    public final void m14855K0() {
        C13263i c13263i = this.f41870B0;
        if (c13263i != null) {
            c13263i.m14861c();
        }
        this.f41869A0 = false;
        this.f41872z0.f41874Z = null;
        AbstractC21690f.m22209n(this);
    }

    @Override // p1140z1.InterfaceC21708o
    /* JADX INFO: renamed from: L */
    public final void mo427L() {
        m14855K0();
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [Bm.k, kotlin.jvm.internal.n] */
    @Override // p1140z1.InterfaceC21708o
    /* JADX INFO: renamed from: e */
    public final void mo430e(C21660F c21660f) {
        boolean z6 = this.f41869A0;
        C13257c c13257c = this.f41872z0;
        if (!z6) {
            c13257c.f41874Z = null;
            AbstractC21690f.m22214s(this, new C8816z(this, 16, c13257c));
            if (c13257c.f41874Z == null) {
                AbstractC8111i5.m8593d("DrawResult not defined, did you forget to call onDraw?");
                throw null;
            }
            this.f41869A0 = true;
        }
        C13260f c13260f = c13257c.f41874Z;
        AbstractC16544l.m18091d(c13260f);
        c13260f.f41876a.invoke(c21660f);
    }

    @Override // p715e1.InterfaceC13255a
    public final InterfaceC7537b getDensity() {
        return AbstractC21690f.m22217v(this).f68633D0;
    }

    @Override // p715e1.InterfaceC13255a
    public final EnumC7546k getLayoutDirection() {
        return AbstractC21690f.m22217v(this).f68634E0;
    }

    @Override // p715e1.InterfaceC13255a
    /* JADX INFO: renamed from: i */
    public final long mo14854i() {
        return AbstractC9113C4.m9645c(AbstractC21690f.m22215t(this, 128).f66983o0);
    }

    @Override // p1140z1.InterfaceC21681a0
    /* JADX INFO: renamed from: j0 */
    public final void mo2488j0() {
        m14855K0();
    }
}
