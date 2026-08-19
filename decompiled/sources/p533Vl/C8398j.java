package p533Vl;

import kotlin.jvm.internal.AbstractC16544l;
import mm.C17296C;
import p049Bm.InterfaceC1439n;
import p103Dn.C2153Q0;
import p103Dn.InterfaceC2149O0;
import p103Dn.InterfaceC2186j;
import p103Dn.InterfaceC2213w0;
import p225Im.InterfaceC3776x;
import p972qm.InterfaceC18770c;
import p996rm.EnumC19250a;

/* JADX INFO: renamed from: Vl.j */
/* JADX INFO: loaded from: classes3.dex */
public final class C8398j implements InterfaceC2213w0 {

    /* JADX INFO: renamed from: Y */
    public final C2153Q0 f26123Y;

    /* JADX INFO: renamed from: Z */
    public final InterfaceC1439n f26124Z;

    public C8398j(C2153Q0 c2153q0, InterfaceC1439n interfaceC1439n) {
        this.f26123Y = c2153q0;
        this.f26124Z = interfaceC1439n;
    }

    @Override // p103Dn.InterfaceC2211v0, p103Dn.InterfaceC2186j
    /* JADX INFO: renamed from: a */
    public final Object mo395a(Object obj, InterfaceC18770c interfaceC18770c) {
        this.f26123Y.mo395a(obj, interfaceC18770c);
        return C17296C.f55119a;
    }

    /* JADX INFO: renamed from: c */
    public final Object m8943c(InterfaceC3776x property) {
        AbstractC16544l.m18094g(property, "property");
        if (AbstractC16544l.m18089b(AbstractC8391c.f26112b.get(), Boolean.TRUE)) {
            AbstractC8391c.f26111a.set(this);
        }
        return this.f26123Y.getValue();
    }

    @Override // p103Dn.InterfaceC2184i
    /* JADX INFO: renamed from: d */
    public final Object mo3141d(InterfaceC2186j interfaceC2186j, InterfaceC18770c interfaceC18770c) throws Throwable {
        this.f26123Y.mo3141d(interfaceC2186j, interfaceC18770c);
        return EnumC19250a.f61036Y;
    }

    @Override // p103Dn.InterfaceC2211v0
    /* JADX INFO: renamed from: e */
    public final void mo3230e() {
        this.f26123Y.mo3230e();
        throw null;
    }

    @Override // p103Dn.InterfaceC2211v0
    /* JADX INFO: renamed from: f */
    public final boolean mo3231f(Object obj) {
        this.f26123Y.setValue(obj);
        return true;
    }

    /* JADX INFO: renamed from: g */
    public final void m8944g(Object obj, InterfaceC3776x property) {
        AbstractC16544l.m18094g(property, "property");
        C2153Q0 c2153q0 = this.f26123Y;
        Object value = c2153q0.getValue();
        c2153q0.setValue(obj);
        InterfaceC1439n interfaceC1439n = this.f26124Z;
        if (interfaceC1439n != null) {
            interfaceC1439n.invoke(obj, value);
        }
    }

    @Override // p103Dn.InterfaceC2149O0
    public final Object getValue() {
        return this.f26123Y.getValue();
    }

    @Override // p103Dn.InterfaceC2211v0
    /* JADX INFO: renamed from: i */
    public final InterfaceC2149O0 mo3258i() {
        return this.f26123Y.m3611i();
    }

    @Override // p103Dn.InterfaceC2213w0
    public final void setValue(Object obj) {
        this.f26123Y.setValue(obj);
    }
}
