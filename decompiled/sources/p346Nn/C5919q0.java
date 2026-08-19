package p346Nn;

import kotlin.jvm.internal.AbstractC16544l;
import p049Bm.InterfaceC1436k;
import p389Pn.C6518c;
import p389Pn.C6519d;
import p389Pn.C6536u;
import p389Pn.InterfaceC6527l;
import p544W9.AbstractC8693p4;

/* JADX INFO: renamed from: Nn.q0 */
/* JADX INFO: loaded from: classes2.dex */
public final class C5919q0 implements InterfaceC5888b, InterfaceC5932x {

    /* JADX INFO: renamed from: a */
    public final C6518c f19288a;

    public C5919q0(C6518c c6518c) {
        this.f19288a = c6518c;
    }

    @Override // p346Nn.InterfaceC5888b
    /* JADX INFO: renamed from: a */
    public final C6518c mo6291a() {
        return this.f19288a;
    }

    @Override // p346Nn.InterfaceC5934y
    /* JADX INFO: renamed from: b */
    public final void mo6292b(String str) {
        AbstractC8693p4.m9392d(this, str);
    }

    @Override // p346Nn.InterfaceC5932x
    /* JADX INFO: renamed from: e */
    public final void mo6314e(EnumC5897f0 padding) {
        AbstractC16544l.m18094g(padding, "padding");
        m6319t(new C6519d(new C5929v0(padding)));
    }

    @Override // p346Nn.InterfaceC5888b
    /* JADX INFO: renamed from: h */
    public final void mo6294h(InterfaceC1436k[] interfaceC1436kArr, InterfaceC1436k interfaceC1436k) {
        AbstractC8693p4.m9389a(this, interfaceC1436kArr, interfaceC1436k);
    }

    @Override // p346Nn.InterfaceC5932x
    /* JADX INFO: renamed from: i */
    public final void mo6315i(EnumC5897f0 padding) {
        AbstractC16544l.m18094g(padding, "padding");
        m6319t(new C6519d(new C5927u0(padding)));
    }

    @Override // p346Nn.InterfaceC5888b
    /* JADX INFO: renamed from: n */
    public final void mo6298n(String str, InterfaceC1436k interfaceC1436k) {
        AbstractC8693p4.m9390b(this, str, interfaceC1436k);
    }

    @Override // p346Nn.InterfaceC5932x
    /* JADX INFO: renamed from: p */
    public final void mo6316p(EnumC5897f0 padding) {
        AbstractC16544l.m18094g(padding, "padding");
        m6319t(new C6536u(new C6519d(new C5931w0(padding))));
    }

    @Override // p346Nn.InterfaceC5888b
    /* JADX INFO: renamed from: r */
    public final InterfaceC5888b mo6299r() {
        return new C5919q0(new C6518c(0));
    }

    /* JADX INFO: renamed from: t */
    public final void m6319t(InterfaceC6527l interfaceC6527l) {
        this.f19288a.m7087a(interfaceC6527l);
    }
}
