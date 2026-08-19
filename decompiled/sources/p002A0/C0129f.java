package p002A0;

import kotlin.jvm.internal.AbstractC16546n;
import mm.C17296C;
import p003A1.AbstractC0187M0;
import p049Bm.InterfaceC1436k;
import p1140z1.AbstractC21690f;
import p349O0.C5984W0;
import p492U1.C7542g;
import p492U1.C7545j;
import p492U1.InterfaceC7537b;
import p571X9.AbstractC9113C4;
import p759g1.C13800b;

/* JADX INFO: renamed from: A0.f */
/* JADX INFO: loaded from: classes.dex */
public final class C0129f extends AbstractC16546n implements InterfaceC1436k {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f541Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ C0134k f542Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0129f(C0134k c0134k, int i10) {
        super(1);
        this.f541Y = i10;
        this.f542Z = c0134k;
    }

    @Override // p049Bm.InterfaceC1436k
    public final Object invoke(Object obj) {
        switch (this.f541Y) {
            case 0:
                return new C13800b(((C13800b) this.f542Z.f559G0.m15224e()).f43584a);
            default:
                long j10 = ((C7542g) obj).f23896a;
                C5984W0 c5984w0 = AbstractC0187M0.f704f;
                C0134k c0134k = this.f542Z;
                InterfaceC7537b interfaceC7537b = (InterfaceC7537b) AbstractC21690f.m22204i(c0134k, c5984w0);
                c0134k.f558F0.setValue(new C7545j(AbstractC9113C4.m9643a(interfaceC7537b.mo7866k0(C7542g.m7877b(j10)), interfaceC7537b.mo7866k0(C7542g.m7876a(j10)))));
                return C17296C.f55119a;
        }
    }
}
