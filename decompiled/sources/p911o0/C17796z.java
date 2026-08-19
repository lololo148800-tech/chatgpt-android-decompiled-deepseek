package p911o0;

import kotlin.jvm.internal.AbstractC16544l;
import p049Bm.InterfaceC1436k;
import p049Bm.InterfaceC1439n;
import p1117y1.InterfaceC21363c;
import p1117y1.InterfaceC21367g;
import p571X9.AbstractC9306j0;
import p635a1.InterfaceC10459q;

/* JADX INFO: renamed from: o0.z */
/* JADX INFO: loaded from: classes.dex */
public final class C17796z implements InterfaceC21363c {

    /* JADX INFO: renamed from: Y */
    public final InterfaceC1436k f56780Y;

    /* JADX INFO: renamed from: Z */
    public InterfaceC17716A0 f56781Z;

    public C17796z(InterfaceC1436k interfaceC1436k) {
        this.f56780Y = interfaceC1436k;
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
        return (obj instanceof C17796z) && ((C17796z) obj).f56780Y == this.f56780Y;
    }

    public final int hashCode() {
        return this.f56780Y.hashCode();
    }

    @Override // p635a1.InterfaceC10459q
    /* JADX INFO: renamed from: j */
    public final Object mo431j(Object obj, InterfaceC1439n interfaceC1439n) {
        return interfaceC1439n.invoke(obj, this);
    }

    @Override // p1117y1.InterfaceC21363c
    /* JADX INFO: renamed from: p */
    public final void mo19471p(InterfaceC21367g interfaceC21367g) {
        InterfaceC17716A0 interfaceC17716A0 = (InterfaceC17716A0) interfaceC21367g.mo15082a(AbstractC17724E0.f56585a);
        if (AbstractC16544l.m18089b(interfaceC17716A0, this.f56781Z)) {
            return;
        }
        this.f56781Z = interfaceC17716A0;
        this.f56780Y.invoke(interfaceC17716A0);
    }
}
