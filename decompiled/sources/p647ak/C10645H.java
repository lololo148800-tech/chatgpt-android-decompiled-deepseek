package p647ak;

import kotlin.jvm.internal.AbstractC16544l;
import p025An.AbstractC0593T;
import p086D6.C1970n;
import p103Dn.AbstractC2124C;
import p103Dn.InterfaceC2184i;
import p729ej.InterfaceC13427r;
import p949pj.C18470i0;

/* JADX INFO: renamed from: ak.H */
/* JADX INFO: loaded from: classes3.dex */
public final class C10645H implements InterfaceC13427r {

    /* JADX INFO: renamed from: b */
    public final C18470i0 f31579b;

    public C10645H(C18470i0 c18470i0) {
        this.f31579b = c18470i0;
    }

    @Override // p729ej.InterfaceC13427r
    /* JADX INFO: renamed from: a */
    public final boolean mo2026a(InterfaceC13427r otherWorker) {
        AbstractC16544l.m18094g(otherWorker, "otherWorker");
        return otherWorker instanceof C10645H;
    }

    @Override // p729ej.InterfaceC13427r
    public final InterfaceC2184i run() {
        return AbstractC2124C.m3224w(AbstractC2124C.m3214m(AbstractC2124C.m3215n(new C1970n(this.f31579b, 19, this)), 200L), AbstractC0593T.f1824a);
    }
}
