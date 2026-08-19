package p656b3;

import com.google.protobuf.AbstractC12107L1;
import p049Bm.InterfaceC1436k;
import p049Bm.InterfaceC1439n;
import p571X9.AbstractC9306j0;
import p637a3.InterfaceC10496m;
import p637a3.InterfaceC10497n;
import p672c3.C11627r;

/* JADX INFO: renamed from: b3.b */
/* JADX INFO: loaded from: classes.dex */
public final class C11223b implements InterfaceC10496m {

    /* JADX INFO: renamed from: a */
    public final InterfaceC11222a f33979a;

    /* JADX INFO: renamed from: b */
    public final int f33980b = 0;

    public C11223b(InterfaceC11222a interfaceC11222a) {
        this.f33979a = interfaceC11222a;
    }

    @Override // p637a3.InterfaceC10497n
    /* JADX INFO: renamed from: a */
    public final boolean mo10951a(InterfaceC1436k interfaceC1436k) {
        return ((Boolean) interfaceC1436k.invoke(this)).booleanValue();
    }

    @Override // p637a3.InterfaceC10497n
    /* JADX INFO: renamed from: b */
    public final /* synthetic */ InterfaceC10497n mo10952b(InterfaceC10497n interfaceC10497n) {
        return AbstractC9306j0.m9883b(this, interfaceC10497n);
    }

    @Override // p637a3.InterfaceC10497n
    /* JADX INFO: renamed from: c */
    public final boolean mo10953c() {
        C11627r.f35235p0.invoke(this);
        return Boolean.TRUE.booleanValue();
    }

    @Override // p637a3.InterfaceC10497n
    /* JADX INFO: renamed from: j */
    public final Object mo10954j(Object obj, InterfaceC1439n interfaceC1439n) {
        return interfaceC1439n.invoke(obj, this);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ActionModifier(action=");
        sb2.append(this.f33979a);
        sb2.append(", rippleOverride=");
        return AbstractC12107L1.m13826q(sb2, this.f33980b, ')');
    }
}
