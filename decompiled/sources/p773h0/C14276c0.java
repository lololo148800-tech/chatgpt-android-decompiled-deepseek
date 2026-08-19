package p773h0;

import kotlin.jvm.internal.AbstractC16546n;
import mm.C17296C;
import p049Bm.InterfaceC1426a;
import p1095x1.InterfaceC21098s;
import p759g1.C13800b;

/* JADX INFO: renamed from: h0.c0 */
/* JADX INFO: loaded from: classes.dex */
public final class C14276c0 extends AbstractC16546n implements InterfaceC1426a {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f44784Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ C14280e0 f44785Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C14276c0(C14280e0 c14280e0, int i10) {
        super(0);
        this.f44784Y = i10;
        this.f44785Z = c14280e0;
    }

    @Override // p049Bm.InterfaceC1426a
    public final Object invoke() {
        switch (this.f44784Y) {
            case 0:
                InterfaceC21098s interfaceC21098s = (InterfaceC21098s) this.f44785Z.f44810M0.getValue();
                return new C13800b(interfaceC21098s != null ? interfaceC21098s.mo21517D(0L) : 9205357640488583168L);
            case 1:
                return new C13800b(this.f44785Z.f44812O0);
            default:
                this.f44785Z.m15569M0();
                return C17296C.f55119a;
        }
    }
}
