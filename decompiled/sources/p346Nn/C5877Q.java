package p346Nn;

import kotlin.jvm.internal.AbstractC16544l;
import p049Bm.InterfaceC1436k;
import p389Pn.C6518c;
import p389Pn.C6519d;
import p389Pn.InterfaceC6527l;
import p544W9.AbstractC8693p4;
import p544W9.AbstractC8705r4;

/* JADX INFO: renamed from: Nn.Q */
/* JADX INFO: loaded from: classes2.dex */
public final class C5877Q implements InterfaceC5888b, InterfaceC5894e {

    /* JADX INFO: renamed from: a */
    public final C6518c f19206a;

    public C5877Q(C6518c c6518c) {
        this.f19206a = c6518c;
    }

    @Override // p346Nn.InterfaceC5888b
    /* JADX INFO: renamed from: a */
    public final C6518c mo6291a() {
        return this.f19206a;
    }

    @Override // p346Nn.InterfaceC5934y
    /* JADX INFO: renamed from: b */
    public final void mo6292b(String str) {
        AbstractC8693p4.m9392d(this, str);
    }

    @Override // p346Nn.InterfaceC5930w
    /* JADX INFO: renamed from: f */
    public final void mo6305f(EnumC5897f0 padding) {
        AbstractC16544l.m18094g(padding, "padding");
        mo6308o(new C6519d(new C5899g0(padding)));
    }

    @Override // p346Nn.InterfaceC5930w
    /* JADX INFO: renamed from: g */
    public final void mo6306g(EnumC5897f0 padding) {
        AbstractC16544l.m18094g(padding, "padding");
        mo6308o(new C6519d(new C5865E(padding)));
    }

    @Override // p346Nn.InterfaceC5888b
    /* JADX INFO: renamed from: h */
    public final void mo6294h(InterfaceC1436k[] interfaceC1436kArr, InterfaceC1436k interfaceC1436k) {
        AbstractC8693p4.m9389a(this, interfaceC1436kArr, interfaceC1436k);
    }

    @Override // p346Nn.InterfaceC5930w
    /* JADX INFO: renamed from: k */
    public final void mo6307k() {
        AbstractC8705r4.m9412b(this);
    }

    @Override // p346Nn.InterfaceC5888b
    /* JADX INFO: renamed from: n */
    public final void mo6298n(String str, InterfaceC1436k interfaceC1436k) {
        AbstractC8693p4.m9390b(this, str, interfaceC1436k);
    }

    @Override // p346Nn.InterfaceC5894e
    /* JADX INFO: renamed from: o */
    public final void mo6308o(InterfaceC6527l interfaceC6527l) {
        this.f19206a.m7087a(interfaceC6527l);
    }

    @Override // p346Nn.InterfaceC5930w
    /* JADX INFO: renamed from: q */
    public final void mo6309q(EnumC5897f0 padding) {
        AbstractC16544l.m18094g(padding, "padding");
        mo6308o(new C6519d(new C5880U(padding)));
    }

    @Override // p346Nn.InterfaceC5888b
    /* JADX INFO: renamed from: r */
    public final InterfaceC5888b mo6299r() {
        return new C5877Q(new C6518c(0));
    }
}
