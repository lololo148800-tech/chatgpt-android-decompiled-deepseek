package p533Vl;

import kotlin.jvm.internal.AbstractC16544l;
import p103Dn.C2217y0;
import p103Dn.InterfaceC2149O0;
import p103Dn.InterfaceC2186j;
import p225Im.InterfaceC3776x;
import p972qm.InterfaceC18770c;

/* JADX INFO: renamed from: Vl.k */
/* JADX INFO: loaded from: classes3.dex */
public final class C8399k implements InterfaceC2149O0 {

    /* JADX INFO: renamed from: Y */
    public final C2217y0 f26125Y;

    public C8399k(C2217y0 c2217y0) {
        this.f26125Y = c2217y0;
    }

    /* JADX INFO: renamed from: c */
    public final Object m8945c(InterfaceC3776x property) {
        AbstractC16544l.m18094g(property, "property");
        if (AbstractC16544l.m18089b(AbstractC8391c.f26112b.get(), Boolean.TRUE)) {
            AbstractC8391c.f26111a.set(this);
        }
        return this.f26125Y.f6797Y.getValue();
    }

    @Override // p103Dn.InterfaceC2184i
    /* JADX INFO: renamed from: d */
    public final Object mo3141d(InterfaceC2186j interfaceC2186j, InterfaceC18770c interfaceC18770c) {
        return this.f26125Y.mo3141d(interfaceC2186j, interfaceC18770c);
    }

    @Override // p103Dn.InterfaceC2149O0
    public final Object getValue() {
        return this.f26125Y.f6797Y.getValue();
    }
}
