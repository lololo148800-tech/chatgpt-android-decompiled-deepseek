package p346Nn;

import kotlin.jvm.internal.AbstractC16544l;
import p049Bm.InterfaceC1436k;
import p389Pn.C6518c;
import p389Pn.C6519d;
import p389Pn.InterfaceC6527l;
import p544W9.AbstractC8693p4;

/* JADX INFO: renamed from: Nn.J */
/* JADX INFO: loaded from: classes2.dex */
public final class C5870J implements InterfaceC5888b, InterfaceC5890c {

    /* JADX INFO: renamed from: a */
    public final C6518c f19189a;

    public C5870J(C6518c c6518c) {
        this.f19189a = c6518c;
    }

    @Override // p346Nn.InterfaceC5888b
    /* JADX INFO: renamed from: a */
    public final C6518c mo6291a() {
        return this.f19189a;
    }

    @Override // p346Nn.InterfaceC5934y
    /* JADX INFO: renamed from: b */
    public final void mo6292b(String str) {
        AbstractC8693p4.m9392d(this, str);
    }

    @Override // p346Nn.InterfaceC5926u
    /* JADX INFO: renamed from: d */
    public final void mo6293d(EnumC5897f0 padding) {
        AbstractC16544l.m18094g(padding, "padding");
        mo6297m(new C6519d(new C5935z(padding)));
    }

    @Override // p346Nn.InterfaceC5888b
    /* JADX INFO: renamed from: h */
    public final void mo6294h(InterfaceC1436k[] interfaceC1436kArr, InterfaceC1436k interfaceC1436k) {
        AbstractC8693p4.m9389a(this, interfaceC1436kArr, interfaceC1436k);
    }

    @Override // p346Nn.InterfaceC5926u
    /* JADX INFO: renamed from: j */
    public final void mo6295j(EnumC5897f0 padding) {
        AbstractC16544l.m18094g(padding, "padding");
        mo6297m(new C6519d(new C5933x0(padding)));
    }

    @Override // p346Nn.InterfaceC5926u
    /* JADX INFO: renamed from: l */
    public final void mo6296l(EnumC5897f0 padding) {
        AbstractC16544l.m18094g(padding, "padding");
        mo6297m(new C6519d(new C5881V(padding)));
    }

    @Override // p346Nn.InterfaceC5890c
    /* JADX INFO: renamed from: m */
    public final void mo6297m(InterfaceC6527l interfaceC6527l) {
        this.f19189a.m7087a(interfaceC6527l);
    }

    @Override // p346Nn.InterfaceC5888b
    /* JADX INFO: renamed from: n */
    public final void mo6298n(String str, InterfaceC1436k interfaceC1436k) {
        AbstractC8693p4.m9390b(this, str, interfaceC1436k);
    }

    @Override // p346Nn.InterfaceC5888b
    /* JADX INFO: renamed from: r */
    public final InterfaceC5888b mo6299r() {
        return new C5870J(new C6518c(0));
    }
}
