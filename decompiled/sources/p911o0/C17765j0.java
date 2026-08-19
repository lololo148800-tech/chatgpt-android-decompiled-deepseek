package p911o0;

import kotlin.jvm.internal.AbstractC16544l;
import p049Bm.InterfaceC1436k;
import p049Bm.InterfaceC1439n;
import p1117y1.C21368h;
import p1117y1.InterfaceC21363c;
import p1117y1.InterfaceC21366f;
import p1117y1.InterfaceC21367g;
import p349O0.C5975S;
import p349O0.C5997d;
import p349O0.C6002f0;
import p571X9.AbstractC9306j0;
import p635a1.InterfaceC10459q;

/* JADX INFO: renamed from: o0.j0 */
/* JADX INFO: loaded from: classes.dex */
public final class C17765j0 implements InterfaceC21363c, InterfaceC21366f {

    /* JADX INFO: renamed from: Y */
    public final C6002f0 f56716Y = C5997d.m6430Q(new C17725F(0, 0, 0, 0), C5975S.f19448r0);

    /* JADX INFO: renamed from: Z */
    public final InterfaceC17763i0 f56717Z;

    public C17765j0(InterfaceC17763i0 interfaceC17763i0) {
        this.f56717Z = interfaceC17763i0;
    }

    @Override // p635a1.InterfaceC10459q
    /* JADX INFO: renamed from: G */
    public final boolean mo426G(InterfaceC1436k interfaceC1436k) {
        return ((Boolean) interfaceC1436k.invoke(this)).booleanValue();
    }

    @Override // p635a1.InterfaceC10459q
    /* JADX INFO: renamed from: M */
    public final /* synthetic */ InterfaceC10459q mo428M(InterfaceC10459q interfaceC10459q) {
        return AbstractC9306j0.m9882a(this, interfaceC10459q);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C17765j0) {
            return AbstractC16544l.m18089b(((C17765j0) obj).f56717Z, this.f56717Z);
        }
        return false;
    }

    @Override // p1117y1.InterfaceC21366f
    public final C21368h getKey() {
        return AbstractC17724E0.f56585a;
    }

    @Override // p1117y1.InterfaceC21366f
    public final Object getValue() {
        return (InterfaceC17716A0) this.f56716Y.getValue();
    }

    public final int hashCode() {
        return this.f56717Z.hashCode();
    }

    @Override // p635a1.InterfaceC10459q
    /* JADX INFO: renamed from: j */
    public final Object mo431j(Object obj, InterfaceC1439n interfaceC1439n) {
        return interfaceC1439n.invoke(obj, this);
    }

    @Override // p1117y1.InterfaceC21363c
    /* JADX INFO: renamed from: p */
    public final void mo19471p(InterfaceC21367g interfaceC21367g) {
        this.f56716Y.setValue(new C17746a(new C17769l0(this.f56717Z), (InterfaceC17716A0) interfaceC21367g.mo15082a(AbstractC17724E0.f56585a)));
    }
}
