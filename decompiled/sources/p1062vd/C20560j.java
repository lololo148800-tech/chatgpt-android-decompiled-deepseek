package p1062vd;

import bf.AbstractC11372a0;
import cd.C11709i;
import kotlin.jvm.internal.AbstractC16546n;
import mm.C17296C;
import p049Bm.InterfaceC1426a;
import p049Bm.InterfaceC1436k;
import p1042uh.C20263a0;
import p1155zi.C21936L0;

/* JADX INFO: renamed from: vd.j */
/* JADX INFO: loaded from: classes3.dex */
public final class C20560j extends AbstractC16546n implements InterfaceC1426a {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f65265Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ InterfaceC1436k f65266Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ C20263a0 f65267o0;

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ C11709i f65268p0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C20560j(InterfaceC1436k interfaceC1436k, C20263a0 c20263a0, C11709i c11709i, int i10) {
        super(0);
        this.f65265Y = i10;
        this.f65266Z = interfaceC1436k;
        this.f65267o0 = c20263a0;
        this.f65268p0 = c11709i;
    }

    @Override // p049Bm.InterfaceC1426a
    public final Object invoke() {
        switch (this.f65265Y) {
            case 0:
                this.f65266Z.invoke(new C21936L0(AbstractC11372a0.m12782a(this.f65267o0)));
                this.f65268p0.m13031a();
                break;
            default:
                this.f65266Z.invoke(new C21936L0(AbstractC11372a0.m12782a(this.f65267o0)));
                this.f65268p0.m13031a();
                break;
        }
        return C17296C.f55119a;
    }
}
