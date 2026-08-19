package p636a2;

import kotlin.jvm.internal.AbstractC16544l;
import p003A1.AbstractC0237c1;
import p003A1.C0280q;
import p049Bm.InterfaceC1436k;
import p049Bm.InterfaceC1439n;
import p1095x1.InterfaceC21066U;
import p492U1.InterfaceC7537b;
import p571X9.AbstractC9306j0;
import p635a1.InterfaceC10459q;

/* JADX INFO: renamed from: a2.m */
/* JADX INFO: loaded from: classes.dex */
public final class C10476m extends AbstractC0237c1 implements InterfaceC21066U {

    /* JADX INFO: renamed from: Z */
    public final C10469f f31026Z;

    /* JADX INFO: renamed from: o0 */
    public final InterfaceC1436k f31027o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C10476m(C10469f c10469f, InterfaceC1436k constrainBlock) {
        super(C0280q.f1030t0);
        AbstractC16544l.m18094g(constrainBlock, "constrainBlock");
        this.f31026Z = c10469f;
        this.f31027o0 = constrainBlock;
    }

    @Override // p635a1.InterfaceC10459q
    /* JADX INFO: renamed from: G */
    public final boolean mo426G(InterfaceC1436k interfaceC1436k) {
        return ((Boolean) interfaceC1436k.invoke(this)).booleanValue();
    }

    @Override // p635a1.InterfaceC10459q
    /* JADX INFO: renamed from: M */
    public final InterfaceC10459q mo428M(InterfaceC10459q interfaceC10459q) {
        return AbstractC9306j0.m9882a(this, interfaceC10459q);
    }

    @Override // p1095x1.InterfaceC21066U
    /* JADX INFO: renamed from: b */
    public final Object mo10940b(InterfaceC7537b interfaceC7537b, Object obj) {
        AbstractC16544l.m18094g(interfaceC7537b, "<this>");
        return new C10475l(this.f31026Z, this.f31027o0);
    }

    public final boolean equals(Object obj) {
        C10476m c10476m = obj instanceof C10476m ? (C10476m) obj : null;
        return AbstractC16544l.m18089b(this.f31027o0, c10476m != null ? c10476m.f31027o0 : null);
    }

    public final int hashCode() {
        return this.f31027o0.hashCode();
    }

    @Override // p635a1.InterfaceC10459q
    /* JADX INFO: renamed from: j */
    public final Object mo431j(Object obj, InterfaceC1439n interfaceC1439n) {
        return interfaceC1439n.invoke(obj, this);
    }
}
