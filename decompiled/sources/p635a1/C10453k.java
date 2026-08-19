package p635a1;

import kotlin.jvm.internal.AbstractC16544l;
import p049Bm.InterfaceC1436k;
import p049Bm.InterfaceC1439n;
import p571X9.AbstractC9306j0;

/* JADX INFO: renamed from: a1.k */
/* JADX INFO: loaded from: classes.dex */
public final class C10453k implements InterfaceC10459q {

    /* JADX INFO: renamed from: Y */
    public final InterfaceC10459q f30955Y;

    /* JADX INFO: renamed from: Z */
    public final InterfaceC10459q f30956Z;

    public C10453k(InterfaceC10459q interfaceC10459q, InterfaceC10459q interfaceC10459q2) {
        this.f30955Y = interfaceC10459q;
        this.f30956Z = interfaceC10459q2;
    }

    @Override // p635a1.InterfaceC10459q
    /* JADX INFO: renamed from: G */
    public final boolean mo426G(InterfaceC1436k interfaceC1436k) {
        return this.f30955Y.mo426G(interfaceC1436k) && this.f30956Z.mo426G(interfaceC1436k);
    }

    @Override // p635a1.InterfaceC10459q
    /* JADX INFO: renamed from: M */
    public final /* synthetic */ InterfaceC10459q mo428M(InterfaceC10459q interfaceC10459q) {
        return AbstractC9306j0.m9882a(this, interfaceC10459q);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C10453k) {
            C10453k c10453k = (C10453k) obj;
            if (AbstractC16544l.m18089b(this.f30955Y, c10453k.f30955Y) && AbstractC16544l.m18089b(this.f30956Z, c10453k.f30956Z)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (this.f30956Z.hashCode() * 31) + this.f30955Y.hashCode();
    }

    @Override // p635a1.InterfaceC10459q
    /* JADX INFO: renamed from: j */
    public final Object mo431j(Object obj, InterfaceC1439n interfaceC1439n) {
        return this.f30956Z.mo431j(this.f30955Y.mo431j(obj, interfaceC1439n), interfaceC1439n);
    }

    public final String toString() {
        return AbstractC9306j0.m9892k(new StringBuilder("["), (String) mo431j("", C10452j.f30954Y), ']');
    }
}
