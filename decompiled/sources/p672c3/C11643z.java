package p672c3;

import p049Bm.InterfaceC1436k;
import p049Bm.InterfaceC1439n;
import p571X9.AbstractC9306j0;
import p637a3.InterfaceC10496m;
import p637a3.InterfaceC10497n;
import p884m3.C17144c;

/* JADX INFO: renamed from: c3.z */
/* JADX INFO: loaded from: classes.dex */
public final class C11643z implements InterfaceC10496m {

    /* JADX INFO: renamed from: a */
    public final C17144c f35272a;

    public C11643z(C17144c c17144c) {
        this.f35272a = c17144c;
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

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C11643z) && this.f35272a.equals(((C11643z) obj).f35272a);
    }

    public final int hashCode() {
        return this.f35272a.hashCode();
    }

    @Override // p637a3.InterfaceC10497n
    /* JADX INFO: renamed from: j */
    public final Object mo10954j(Object obj, InterfaceC1439n interfaceC1439n) {
        return interfaceC1439n.invoke(obj, this);
    }

    public final String toString() {
        return "CornerRadiusModifier(radius=" + this.f35272a + ')';
    }
}
